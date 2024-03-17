//EmployeeRepository.java
package unicorn.employee_management.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import unicorn.employee_management.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
