// ExperienceController.java
package unicorn.employee_management.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import unicorn.employee_management.models.Experience;
import unicorn.employee_management.services.ExperienceService;
import java.util.List;

@RestController
@RequestMapping("/api/experience")
public class ExperienceController {
    @Autowired
    private ExperienceService experienceService;

    @GetMapping("/")
    public List<Experience> getAllExperiences() {
        return experienceService.getAllExperiences();
    }

    @GetMapping("/{id}")
    public Experience getExperienceById(@PathVariable Long id) {
        return experienceService.getExperienceById(id);
    }

    @PostMapping("/")
    public Experience addExperience(@RequestBody Experience experience) {
        return experienceService.addExperience(experience);
    }

    @PutMapping("/{id}")
    public Experience updateExperience(@PathVariable Long id, @RequestBody Experience experience) {
        return experienceService.updateExperience(id, experience);
    }

    @DeleteMapping("/{id}")
    public void deleteExperience(@PathVariable Long id) {
        experienceService.deleteExperience(id);
    }
}
