package se.yrgo.building.service;

import se.yrgo.building.data.BuildingNotFoundException;
import se.yrgo.building.domain.Building;

import java.util.List;
import java.util.Optional;

public interface BuildingService {
    List<Building> getByJanitorId(Long janitorId);
    public Optional<Building> getBuildingByGuestId(Long id);
    public Optional<Building> getBuildingById(Long id) throws BuildingNotFoundException;
    public List<Building> getAllBuildings();
    public Building registerNewBuilding(Building newBuilding);
    public void demolishBuilding(Building oldBuilding);

}
