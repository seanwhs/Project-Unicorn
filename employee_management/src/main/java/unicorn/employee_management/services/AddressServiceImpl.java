// AddressServiceImpl.java
package unicorn.employee_management.services;
import org.springframework.stereotype.Service;
import unicorn.employee_management.models.Address;
import unicorn.employee_management.repository.AddressRepository;
import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    
    private AddressRepository addressRepository;
    
    public AddressServiceImpl(AddressRepository addressRepository){
        this.addressRepository=addressRepository;
    }
    

    @Override
    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    @Override
    public Address getAddressById(Long id) {
        return addressRepository.findById(id).orElse(null);
    }

    @Override
    public Address addAddress(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public Address updateAddress(Long id, Address addressDetails) {
        Address address = addressRepository.findById(id).orElse(null);
        if (address != null) {
            address.setStreet(addressDetails.getStreet());
            address.setCity(addressDetails.getCity());
            address.setState(addressDetails.getState());
            address.setPostalCode(addressDetails.getPostalCode());
            address.setCountry(addressDetails.getCountry());
            return addressRepository.save(address);
        }
        return null;
    }

    @Override
    public void deleteAddress(Long id) {
        addressRepository.deleteById(id);
    }
}
