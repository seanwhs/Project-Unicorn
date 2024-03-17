//ReportingStructure.java
package unicorn.employee_management.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ReportingStructure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "supervisor_id")
    private Employee supervisor;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public ReportingStructure(Employee supervisor, Employee employee) {
        this.supervisor = supervisor;
        this.employee = employee;
    }

}
