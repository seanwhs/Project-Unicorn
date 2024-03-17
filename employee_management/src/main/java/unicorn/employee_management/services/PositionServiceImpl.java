// PositionServiceImpl.java
package unicorn.employee_management.services;
import org.springframework.stereotype.Service;
import unicorn.employee_management.models.Position;
import unicorn.employee_management.repository.PositionRepository;
import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {
    private PositionRepository positionRepository;

    public PositionServiceImpl(PositionRepository positionRepository) {
        this.positionRepository = positionRepository;
    }

    @Override
    public List<Position> getAllPositions() {
        return positionRepository.findAll();
    }

    @Override
    public Position getPositionById(Long id) {
        return positionRepository.findById(id).orElse(null);
    }

    @Override
    public Position addPosition(Position position) {
        return positionRepository.save(position);
    }

    @Override
    public Position updatePosition(Long id, Position position) {
        Position existingPosition = positionRepository.findById(id).orElse(null);
        if (existingPosition != null) {
            existingPosition.setName(position.getName());
            existingPosition.setDescription(position.getDescription());
            return positionRepository.save(existingPosition);
        }
        return null;
    }

    @Override
    public void deletePosition(Long id) {
        positionRepository.deleteById(id);
    }
}
