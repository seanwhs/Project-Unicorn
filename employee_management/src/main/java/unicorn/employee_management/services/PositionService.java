// PositionService.java
package unicorn.employee_management.services;
import unicorn.employee_management.models.Position;
import java.util.List;

public interface PositionService {
    List<Position> getAllPositions();
    Position getPositionById(Long id);
    Position addPosition(Position position);
    Position updatePosition(Long id, Position position);
    void deletePosition(Long id);
}
