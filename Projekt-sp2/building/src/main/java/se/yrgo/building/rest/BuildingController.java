package se.yrgo.building.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.yrgo.building.data.BuildingNotFoundException;
import se.yrgo.building.data.BuildingRepository;
import se.yrgo.building.domain.Building;
import se.yrgo.building.service.BuildingService;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8085")
@RestController
@RequestMapping("/buildings")
public class BuildingController {

    @Autowired
    private BuildingRepository buildingData;

    private final BuildingService buildingService;

    @Autowired
    public BuildingController(BuildingService buildingService) {
        this.buildingService = buildingService;
    }

    @GetMapping
    public List<Building> getAllBuildings() {
        return buildingService.getAllBuildings();
    }

    @GetMapping(value="{id}")
    public ResponseEntity<?> getBuildingById(@PathVariable("id") Long id) {
        try {
            Optional<Building> building = Optional.ofNullable(buildingService.getBuildingById(id)
                    .orElseThrow(() -> new BuildingNotFoundException("Building not found with id: " + id)));
            return ResponseEntity.ok(building);
        } catch (BuildingNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @PostMapping("/create-building")
    public ResponseEntity<Building> createBuilding(@Valid @RequestBody Building building) {
        Building createdBuilding = buildingService.registerNewBuilding(building);
        return new ResponseEntity<>(createdBuilding, HttpStatus.CREATED);
    }

    @GetMapping("/by-janitor")
    public List<Building> buildingsByJanitor(@RequestParam Long janitorId) {
        return buildingService.getByJanitorId(janitorId);
    }

    // Exception handling for validation errors
    @ExceptionHandler(org.springframework.web.bind.MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<String> handleValidationExceptions(org.springframework.web.bind.MethodArgumentNotValidException ex) {
        return ResponseEntity.badRequest().body(ex.getFieldError().getDefaultMessage());
    }

}
