// ReportingStructureService.java
package unicorn.employee_management.services;
import unicorn.employee_management.models.ReportingStructure;
import java.util.List;

public interface ReportingStructureService {
    List<ReportingStructure> getAllReportingStructures();
    ReportingStructure getReportingStructureById(Long id);
    ReportingStructure addReportingStructure(ReportingStructure reportingStructure);
    ReportingStructure updateReportingStructure(Long id, ReportingStructure reportingStructure);
    void deleteReportingStructure(Long id);
}
