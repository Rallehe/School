package com.yrgo.dataaccess;

import com.yrgo.domain.Action;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ActionDaoJpaImp implements ActionDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    public void create(Action newAction) {
        System.out.println("Using Jpa");
        em.persist(newAction);
    }

    @Override
    public List<Action> getIncompleteActions(String userId) {
        return em.createQuery("select action from Action as action where action.owningUser =:userId and action.complete =false").setParameter("userId", userId).getResultList();
    }

    @Override
    public void update(Action actionToUpdate) throws RecordNotFoundException {
        em.createQuery("UPDATE Action as a SET a.details = :details, a.complete = :isComplete, a.owningUser = :owningUser, a.requiredBy = :requiredBy WHERE a.actionId = :actionId")
                .setParameter("actionId", actionToUpdate.getActionId())
                .setParameter("details", actionToUpdate.getDetails())
                .setParameter("isComplete", actionToUpdate.isComplete())
                .setParameter("owningUser", actionToUpdate.getOwningUser())
                .setParameter("requiredBy", actionToUpdate.getRequiredBy())
                .executeUpdate();
    }

    @Override
    public void delete(Action oldAction) throws RecordNotFoundException {
        Action action = em.find(Action.class, oldAction.getActionId());
        em.remove(action);
    }
}
