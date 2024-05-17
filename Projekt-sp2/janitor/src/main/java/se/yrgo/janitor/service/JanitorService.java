package se.yrgo.janitor.service;

import se.yrgo.janitor.data.JanitorNotFoundException;
import se.yrgo.janitor.domain.Janitor;

import java.util.List;

public interface JanitorService {
    public void getJanitorById(Long id) throws JanitorNotFoundException;
    public List<Janitor> getAllJanitors();
    public Janitor registerNewJanitor(Janitor newJanitor);
    public void fireJanitor(Janitor janitorToFire);
}
