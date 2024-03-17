//ReportingStructureRepository.java
package unicorn.employee_management.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import unicorn.employee_management.models.ReportingStructure;

public interface ReportingStructureRepository extends JpaRepository<ReportingStructure, Long> {
    
}
