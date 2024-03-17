//PositionRepository.java
package unicorn.employee_management.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import unicorn.employee_management.models.Position;

public interface PositionRepository extends JpaRepository<Position, Long> {
    
}
