// CredentialsController.java
package unicorn.employee_management.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import unicorn.employee_management.models.Credentials;
import unicorn.employee_management.services.CredentialsService;
import java.util.List;

@RestController
@RequestMapping("/api/credentials")
public class CredentialsController {
    @Autowired
    private CredentialsService credentialsService;

    @GetMapping("/")
    public List<Credentials> getAllCredentials() {
        return credentialsService.getAllCredentials();
    }

    @GetMapping("/{id}")
    public Credentials getCredentialsById(@PathVariable Long id) {
        return credentialsService.getCredentialsById(id);
    }

    @PostMapping("/")
    public Credentials addCredentials(@RequestBody Credentials credentials) {
        return credentialsService.addCredentials(credentials);
    }

    @PutMapping("/{id}")
    public Credentials updateCredentials(@PathVariable Long id, @RequestBody Credentials credentials) {
        return credentialsService.updateCredentials(id, credentials);
    }

    @DeleteMapping("/{id}")
    public void deleteCredentials(@PathVariable Long id) {
        credentialsService.deleteCredentials(id);
    }
}
