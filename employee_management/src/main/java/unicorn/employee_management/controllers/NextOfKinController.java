// NextOfKinController.java
package unicorn.employee_management.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import unicorn.employee_management.models.NextOfKin;
import unicorn.employee_management.services.NextOfKinService;
import java.util.List;

@RestController
@RequestMapping("/api/nextofkin")
public class NextOfKinController {
    @Autowired
    private NextOfKinService nextOfKinService;

    @GetMapping("/")
    public List<NextOfKin> getAllNextOfKin() {
        return nextOfKinService.getAllNextOfKin();
    }

    @GetMapping("/{id}")
    public NextOfKin getNextOfKinById(@PathVariable Long id) {
        return nextOfKinService.getNextOfKinById(id);
    }

    @PostMapping("/")
    public NextOfKin addNextOfKin(@RequestBody NextOfKin nextOfKin) {
        return nextOfKinService.addNextOfKin(nextOfKin);
    }

    @PutMapping("/{id}")
    public NextOfKin updateNextOfKin(@PathVariable Long id, @RequestBody NextOfKin nextOfKin) {
        return nextOfKinService.updateNextOfKin(id, nextOfKin);
    }

    @DeleteMapping("/{id}")
    public void deleteNextOfKin(@PathVariable Long id) {
        nextOfKinService.deleteNextOfKin(id);
    }
}
