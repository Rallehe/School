package se.yrgo.janitor;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;
import se.yrgo.janitor.domain.Janitor;
import se.yrgo.janitor.service.JanitorService;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Transactional
@TestPropertySource(locations = "classpath:application-test.properties")
public class JanitorApplicationTests {

    @Autowired
    private JanitorService service;

    @Test
    public void createJanitor() {
        service.registerNewJanitor(new Janitor("Test", "Testsson", "123456123"));
        service.registerNewJanitor(new Janitor("Test2", "Testsson2", "123456123"));

        int janitorSize = service.getAllJanitors().size();
        assertEquals(2, janitorSize);
    }

    @Test
    public void fireJanitor() {
        Janitor j = service.registerNewJanitor(new Janitor("Test", "Testsson", "123456123"));
        service.fireJanitor(j);
        int janitorSize = service.getAllJanitors().size();
        assertEquals(0, janitorSize);
    }
}