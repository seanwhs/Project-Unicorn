// CredentialsServiceImpl.java
package unicorn.employee_management.services;
import org.springframework.stereotype.Service;
import unicorn.employee_management.models.Credentials;
import unicorn.employee_management.repository.CredentialsRepository;
import java.util.List;

@Service
public class CredentialsServiceImpl implements CredentialsService {
    private CredentialsRepository credentialsRepository;

    public CredentialsServiceImpl(CredentialsRepository credentialsRepository) {
        this.credentialsRepository = credentialsRepository;
    }

    @Override
    public List<Credentials> getAllCredentials() {
        return credentialsRepository.findAll();
    }

    @Override
    public Credentials getCredentialsById(Long id) {
        return credentialsRepository.findById(id).orElse(null);
    }

    @Override
    public Credentials addCredentials(Credentials credentials) {
        return credentialsRepository.save(credentials);
    }

    @Override
    public Credentials updateCredentials(Long id, Credentials credentials) {
        Credentials existingCredentials = credentialsRepository.findById(id).orElse(null);
        if (existingCredentials != null) {
            existingCredentials.setType(credentials.getType());
            existingCredentials.setIssuer(credentials.getIssuer());
            existingCredentials.setIssueDate(credentials.getIssueDate());
            existingCredentials.setExpiryDate(credentials.getExpiryDate());
            return credentialsRepository.save(existingCredentials);
        }
        return null;
    }

    @Override
    public void deleteCredentials(Long id) {
        credentialsRepository.deleteById(id);
    }
}
