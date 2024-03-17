// ExperienceService.java
package unicorn.employee_management.services;
import unicorn.employee_management.models.Experience;
import java.util.List;

public interface ExperienceService {
    List<Experience> getAllExperiences();
    Experience getExperienceById(Long id);
    Experience addExperience(Experience experience);
    Experience updateExperience(Long id, Experience experience);
    void deleteExperience(Long id);
}
