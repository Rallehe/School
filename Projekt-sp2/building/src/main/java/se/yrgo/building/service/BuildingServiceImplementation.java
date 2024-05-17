package se.yrgo.building.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import se.yrgo.building.data.BuildingNotFoundException;
import se.yrgo.building.data.BuildingRepository;
import se.yrgo.building.domain.Building;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//(So the TM can make a rollback if program crashes)
    @Transactional//(propagation= Propagation.REQUIRES_NEW)
    @Service
    public class BuildingServiceImplementation implements BuildingService {

        private final BuildingRepository buildingRepository;

    public BuildingServiceImplementation(BuildingRepository buildingRepository) {
            this.buildingRepository = buildingRepository;
        }

        public List<Building> getByJanitorId(Long janitorId) {
            return buildingRepository.findByJanitorId(janitorId);
        }

        public Optional<Building> getBuildingByGuestId(Long guestId) {
            return buildingRepository.findById(guestId);
        }
        @Override
        public Optional<Building> getBuildingById(Long id) throws BuildingNotFoundException {
            return buildingRepository.findById(id);
        }

        @Override
        public List<Building> getAllBuildings() {
            return buildingRepository.findAll();
        }

        @Override
        public Building registerNewBuilding(Building newBuilding) {
            return buildingRepository.save(newBuilding);
        }

        @Override
        public void demolishBuilding(Building oldBuilding) {
            buildingRepository.delete(oldBuilding);
        }

    }


