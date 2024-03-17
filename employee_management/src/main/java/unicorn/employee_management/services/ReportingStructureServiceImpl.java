// ReportingStructureServiceImpl.java
package unicorn.employee_management.services;
import org.springframework.stereotype.Service;
import unicorn.employee_management.models.ReportingStructure;
import unicorn.employee_management.repository.ReportingStructureRepository;
import java.util.List;

@Service
public class ReportingStructureServiceImpl implements ReportingStructureService {
    private ReportingStructureRepository reportingStructureRepository;

    public ReportingStructureServiceImpl(ReportingStructureRepository reportingStructureRepository) {
        this.reportingStructureRepository = reportingStructureRepository;
    }

    @Override
    public List<ReportingStructure> getAllReportingStructures() {
        return reportingStructureRepository.findAll();
    }

    @Override
    public ReportingStructure getReportingStructureById(Long id) {
        return reportingStructureRepository.findById(id).orElse(null);
    }

    @Override
    public ReportingStructure addReportingStructure(ReportingStructure reportingStructure) {
        return reportingStructureRepository.save(reportingStructure);
    }

    @Override
    public ReportingStructure updateReportingStructure(Long id, ReportingStructure reportingStructure) {
        ReportingStructure existingReportingStructure = reportingStructureRepository.findById(id).orElse(null);
        if (existingReportingStructure != null) {
            existingReportingStructure.setSupervisor(reportingStructure.getSupervisor());
            existingReportingStructure.setEmployee(reportingStructure.getEmployee());
            return reportingStructureRepository.save(existingReportingStructure);
        }
        return null;
    }

    @Override
    public void deleteReportingStructure(Long id) {
        reportingStructureRepository.deleteById(id);
    }
}
