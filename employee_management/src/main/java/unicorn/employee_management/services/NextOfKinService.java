// NextOfKinService.java
package unicorn.employee_management.services;
import unicorn.employee_management.models.NextOfKin;
import java.util.List;

public interface NextOfKinService {
    List<NextOfKin> getAllNextOfKin();
    NextOfKin getNextOfKinById(Long id);
    NextOfKin addNextOfKin(NextOfKin nextOfKin);
    NextOfKin updateNextOfKin(Long id, NextOfKin nextOfKin);
    void deleteNextOfKin(Long id);
}
