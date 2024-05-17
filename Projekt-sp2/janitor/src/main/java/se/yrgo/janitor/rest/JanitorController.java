package se.yrgo.janitor.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.yrgo.janitor.domain.Janitor;
import se.yrgo.janitor.service.JanitorService;
import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8085")
@RestController
@RequestMapping("/janitors")
public class JanitorController {
    private final JanitorService janitorService;

    @Autowired
    public JanitorController(JanitorService janitorService) {
        this.janitorService = janitorService;
    }

    @GetMapping
    public List<Janitor> getAllJanitors() {
        return janitorService.getAllJanitors();
    }

    @PostMapping("/create-janitor")
    public ResponseEntity<String> createJanitor(@Valid @RequestBody Janitor janitor) {
        janitorService.registerNewJanitor(janitor);
        return ResponseEntity.ok("Janitor registered successfully");
    }

    @PostMapping("fire-janitor")
    public void fireJanitor(@RequestBody Janitor janitor) {
        janitorService.fireJanitor(janitor);
    }

    // Exception handling for validation errors
    @ExceptionHandler(org.springframework.web.bind.MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<String> handleValidationExceptions(org.springframework.web.bind.MethodArgumentNotValidException ex) {
        return ResponseEntity.badRequest().body(ex.getFieldError().getDefaultMessage());
    }
}