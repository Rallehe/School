package com.yrgo.services.diary;

import java.util.*;

import com.yrgo.domain.Action;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("diaryService")
public class DiaryManagementServiceMockImpl implements DiaryManagementService {
	
	private Set<Action>allActions= new HashSet<Action>();

	@Override
	public void recordAction(Action action) {
		allActions.add(action);
	}

	//Hint: 
	//Create a list<Action>
	//In the for each loop going through the list use this condition: "if(action.getOwningUser().equals(requiredUser) && !action.isComplete())" to add a new action to the list. 
	public List<Action> getAllIncompleteActions(String requiredUser) {
		List<Action> incompleteActions = new LinkedList<>();
		for (Action action : allActions) {
			if(action.getOwningUser().equals(requiredUser) && !action.isComplete()) {
				incompleteActions.add(action);
			}
		}
		return incompleteActions;
	}

}
