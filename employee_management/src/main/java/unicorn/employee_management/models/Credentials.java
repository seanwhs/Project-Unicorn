//Credentials.java
package unicorn.employee_management.models;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Credentials {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private String issuer;
    private Date issueDate;
    private Date expiryDate;

    public Credentials(String type, String issuer, Date issueDate, Date expiryDate) {
        this.type = type;
        this.issuer = issuer;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
    }
}
