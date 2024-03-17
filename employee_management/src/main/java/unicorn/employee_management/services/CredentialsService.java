// CredentialsService.java
package unicorn.employee_management.services;
import unicorn.employee_management.models.Credentials;
import java.util.List;

public interface CredentialsService {
    List<Credentials> getAllCredentials();
    Credentials getCredentialsById(Long id);
    Credentials addCredentials(Credentials credentials);
    Credentials updateCredentials(Long id, Credentials credentials);
    void deleteCredentials(Long id);
}
