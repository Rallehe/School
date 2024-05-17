package se.yrgo.guest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import javax.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import se.yrgo.guest.domain.Guest;
import se.yrgo.guest.service.GuestService;

@SpringBootTest
@Transactional
@TestPropertySource(locations = "classpath:application-test.properties")
class GuestApplicationTests {

	@Autowired
	private GuestService guestService;

	@Test
	public void newGuest() {
		guestService.newGuest(new Guest("Abo", "Kattsson", "12323645"));
		int guestSize = guestService.getAllGuests().size();
		assertEquals(1, guestSize);
	}

	@Test
	public void deleteGuest() {
		Guest guestToDelete = guestService.newGuest(new Guest("Abo", "Kattsson", "12323645"));
		guestService.deleteGuest(guestToDelete);
		int guestSize = guestService.getAllGuests().size();
		assertEquals(0, guestSize);

	}
}
