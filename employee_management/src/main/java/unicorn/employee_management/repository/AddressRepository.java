//AddressRepository.java
package unicorn.employee_management.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import unicorn.employee_management.models.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
    
}
