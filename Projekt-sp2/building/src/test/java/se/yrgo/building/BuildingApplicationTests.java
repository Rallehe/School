package se.yrgo.building;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;
import se.yrgo.building.domain.Building;
import se.yrgo.building.service.BuildingService;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Transactional
@TestPropertySource(locations = "classpath:application-test.properties")
class BuildingApplicationTests {

	@Autowired
	private BuildingService buildingService;


	/**
	 * Verify that the Spring application context can be
	 * successfully loaded without errors.
	 */
	@Test
	void contextLoads() {
	}

	/**
	 * Creates a new building, then asserts that the list
	 * of all buildings only contains 1 object. It will never contain
	 * more than one since a test database is used for the tests
	 */
	@Test
	public void newBuilding() {
		buildingService.registerNewBuilding(new Building("Lyktan", Arrays.asList(1L, 2L), Arrays.asList(3L, 4L), 7L));
		int buildingSize = buildingService.getAllBuildings().size();
		assertEquals(1, buildingSize);
	}

	/**
	 * Creates a new building, then calls method used for
	 * deleting a building. Then asserts the list of all
	 * buildings only contains 1.
	 */
	@Test
	public void deleteBuilding() {
		Building buildingToDelete = buildingService.registerNewBuilding(new Building("Lyktan", Arrays.asList(1L, 2L), Arrays.asList(3L, 4L), 7L));
		buildingService.demolishBuilding(buildingToDelete);
		int buildingSize = buildingService.getAllBuildings().size();
		assertEquals(0, buildingSize);

	}

}
