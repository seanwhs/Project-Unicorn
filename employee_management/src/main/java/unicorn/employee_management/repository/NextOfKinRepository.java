//NextOfKinRepository.java
package unicorn.employee_management.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import unicorn.employee_management.models.NextOfKin;

public interface NextOfKinRepository extends JpaRepository<NextOfKin, Long>{
    
}
