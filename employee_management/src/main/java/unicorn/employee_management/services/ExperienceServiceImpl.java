// ExperienceServiceImpl.java
package unicorn.employee_management.services;
import org.springframework.stereotype.Service;
import unicorn.employee_management.models.Experience;
import unicorn.employee_management.repository.ExperienceRepository;
import java.util.List;

@Service
public class ExperienceServiceImpl implements ExperienceService {
    private ExperienceRepository experienceRepository;

    public ExperienceServiceImpl(ExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }

    @Override
    public List<Experience> getAllExperiences() {
        return experienceRepository.findAll();
    }

    @Override
    public Experience getExperienceById(Long id) {
        return experienceRepository.findById(id).orElse(null);
    }

    @Override
    public Experience addExperience(Experience experience) {
        return experienceRepository.save(experience);
    }

    @Override
    public Experience updateExperience(Long id, Experience experience) {
        Experience existingExperience = experienceRepository.findById(id).orElse(null);
        if (existingExperience != null) {
            existingExperience.setCompanyName(experience.getCompanyName());
            existingExperience.setJobTitle(experience.getJobTitle());
            existingExperience.setStartDate(experience.getStartDate());
            existingExperience.setEndDate(experience.getEndDate());
            return experienceRepository.save(existingExperience);
        }
        return null;
    }

    @Override
    public void deleteExperience(Long id) {
        experienceRepository.deleteById(id);
    }
}
