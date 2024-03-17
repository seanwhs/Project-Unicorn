// PositionController.java
package unicorn.employee_management.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import unicorn.employee_management.models.Position;
import unicorn.employee_management.services.PositionService;
import java.util.List;

@RestController
@RequestMapping("/api/position")
public class PositionController {
    @Autowired
    private PositionService positionService;

    @GetMapping("/")
    public List<Position> getAllPositions() {
        return positionService.getAllPositions();
    }

    @GetMapping("/{id}")
    public Position getPositionById(@PathVariable Long id) {
        return positionService.getPositionById(id);
    }

    @PostMapping("/")
    public Position addPosition(@RequestBody Position position) {
        return positionService.addPosition(position);
    }

    @PutMapping("/{id}")
    public Position updatePosition(@PathVariable Long id, @RequestBody Position position) {
        return positionService.updatePosition(id, position);
    }

    @DeleteMapping("/{id}")
    public void deletePosition(@PathVariable Long id) {
        positionService.deletePosition(id);
    }
}
