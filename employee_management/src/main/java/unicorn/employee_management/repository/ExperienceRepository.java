//ExperienceRepository.java
package unicorn.employee_management.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import unicorn.employee_management.models.Experience;

public interface ExperienceRepository extends JpaRepository<Experience, Long>{
    
}
