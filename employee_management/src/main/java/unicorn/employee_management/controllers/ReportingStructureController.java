// ReportingStructureController.java
package unicorn.employee_management.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import unicorn.employee_management.models.ReportingStructure;
import unicorn.employee_management.services.ReportingStructureService;

import java.util.List;

@RestController
@RequestMapping("/api/reportingstructure")
public class ReportingStructureController {
    @Autowired
    private ReportingStructureService reportingStructureService;

    @GetMapping("/")
    public List<ReportingStructure> getAllReportingStructures() {
        return reportingStructureService.getAllReportingStructures();
    }

    @GetMapping("/{id}")
    public ReportingStructure getReportingStructureById(@PathVariable Long id) {
        return reportingStructureService.getReportingStructureById(id);
    }

    @PostMapping("/")
    public ReportingStructure addReportingStructure(@RequestBody ReportingStructure reportingStructure) {
        return reportingStructureService.addReportingStructure(reportingStructure);
    }

    @PutMapping("/{id}")
    public ReportingStructure updateReportingStructure(@PathVariable Long id, @RequestBody ReportingStructure reportingStructure) {
        return reportingStructureService.updateReportingStructure(id, reportingStructure);
    }

    @DeleteMapping("/{id}")
    public void deleteReportingStructure(@PathVariable Long id) {
        reportingStructureService.deleteReportingStructure(id);
    }
}
