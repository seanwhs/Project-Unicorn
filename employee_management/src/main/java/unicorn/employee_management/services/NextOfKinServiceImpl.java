// NextOfKinServiceImpl.java
package unicorn.employee_management.services;
import org.springframework.stereotype.Service;
import unicorn.employee_management.models.NextOfKin;
import unicorn.employee_management.repository.NextOfKinRepository;
import java.util.List;

@Service
public class NextOfKinServiceImpl implements NextOfKinService {
    private NextOfKinRepository nextOfKinRepository;

    public NextOfKinServiceImpl(NextOfKinRepository nextOfKinRepository) {
        this.nextOfKinRepository = nextOfKinRepository;
    }

    @Override
    public List<NextOfKin> getAllNextOfKin() {
        return nextOfKinRepository.findAll();
    }

    @Override
    public NextOfKin getNextOfKinById(Long id) {
        return nextOfKinRepository.findById(id).orElse(null);
    }

    @Override
    public NextOfKin addNextOfKin(NextOfKin nextOfKin) {
        return nextOfKinRepository.save(nextOfKin);
    }

    @Override
    public NextOfKin updateNextOfKin(Long id, NextOfKin nextOfKin) {
        NextOfKin existingNextOfKin = nextOfKinRepository.findById(id).orElse(null);
        if (existingNextOfKin != null) {
            existingNextOfKin.setName(nextOfKin.getName());
            existingNextOfKin.setRelationship(nextOfKin.getRelationship());
            existingNextOfKin.setPhoneNumber(nextOfKin.getPhoneNumber());
            existingNextOfKin.setEmail(nextOfKin.getEmail());
            existingNextOfKin.setAddress(nextOfKin.getAddress());
            return nextOfKinRepository.save(existingNextOfKin);
        }
        return null;
    }

    @Override
    public void deleteNextOfKin(Long id) {
        nextOfKinRepository.deleteById(id);
    }
}
