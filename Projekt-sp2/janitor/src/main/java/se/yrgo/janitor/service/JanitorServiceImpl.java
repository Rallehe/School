package se.yrgo.janitor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.yrgo.janitor.data.JanitorNotFoundException;
import se.yrgo.janitor.data.JanitorRepository;
import se.yrgo.janitor.domain.Janitor;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class JanitorServiceImpl implements JanitorService{

    @Autowired
    private JanitorRepository repository;

    @Override
    public void getJanitorById(Long id) throws JanitorNotFoundException {
        repository.findById(id);
    }

    @Override
    public List<Janitor> getAllJanitors() {
        return repository.findAll();
    }

    @Override
    public Janitor registerNewJanitor(Janitor newJanitor) {
        repository.save(newJanitor);
        return newJanitor;
    }

    @Override
    public void fireJanitor(Janitor janitorToFire) {
        repository.delete(janitorToFire);
    }
}
