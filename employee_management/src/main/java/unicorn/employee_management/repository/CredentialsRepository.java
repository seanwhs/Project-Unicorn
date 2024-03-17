//CredentialsRepository.java
package unicorn.employee_management.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import unicorn.employee_management.models.Credentials;

public interface CredentialsRepository extends JpaRepository <Credentials, Long> {
    
}
