//DepartmentRepository.java
package unicorn.employee_management.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import unicorn.employee_management.models.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    
}
