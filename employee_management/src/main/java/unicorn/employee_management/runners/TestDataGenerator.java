//TestDataGenerator.java
package unicorn.employee_management.runners;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import unicorn.employee_management.controllers.AddressController;
import unicorn.employee_management.controllers.CredentialsController;
import unicorn.employee_management.controllers.DepartmentController;
import unicorn.employee_management.controllers.EmployeeController;
import unicorn.employee_management.controllers.ExperienceController;
import unicorn.employee_management.controllers.NextOfKinController;
import unicorn.employee_management.controllers.PositionController;
import unicorn.employee_management.controllers.ReportingStructureController;
import unicorn.employee_management.models.*;

import java.util.Date;

@Component
public class TestDataGenerator implements CommandLineRunner {

    @Autowired
    private AddressController addressController;

    @Autowired
    private CredentialsController credentialsController;

    @Autowired
    private DepartmentController departmentController;

    @Autowired
    private EmployeeController employeeController;

    @Autowired
    private ExperienceController experienceController;

    @Autowired
    private NextOfKinController nextOfKinController;

    @Autowired
    private PositionController positionController;

    @Autowired
    private ReportingStructureController reportingStructureController;

    @Override
    public void run(String... args) throws Exception {
        generateTestData();
    }

    private void generateTestData() {
        // Generate test data for Address
        Address address = new Address("Blk 123, #20-12 Clementi Ave 1", "Clementi", "Singapore", "12345", "Singapore");
        addressController.addAddress(address);

        // Generate test data for Credentials
        Credentials credentials = new Credentials("O-Levels", "MOE", new Date(), new Date());
        credentialsController.addCredentials(credentials);

        // Generate test data for Department
        Department department = new Department("Cleaning", "Cleaning Staff Department");
        departmentController.addDepartment(department);

        // Generate test data for Experience
        Experience experience = new Experience("Competitor Cleaners", "Cleaner", new Date(), new Date());
        experienceController.addExperience(experience);

        // Generate test data for NextOfKin
        Address nextOfKinAddress = new Address("Blk 123, #20-12 Clementi Ave 1", "Clementi", "Singapore", "12345", "Country");
        NextOfKin nextOfKin = new NextOfKin("Mary Lim", "Wife", "1234567890", "mary@email.com", nextOfKinAddress);
        nextOfKinController.addNextOfKin(nextOfKin);

        // Generate test data for Position
        Position position = new Position("Staff", "Staff Position");
        positionController.addPosition(position);

        // Generate test data for Employee
        Employee employee = new Employee(
            "John Tan", 
            "john@email.com", 
            "1234567890",
            new Date(), // dateJoined
            null, // dateLeft
            new Date(), // dateOfBirth
            "NRIC", // nationalType
            "S1234567A", // nationalId
            Race.CHINESE, // race
            Citizenship.SINGAPOREAN, // citizenship
            Religion.BUDDHISM, // religion
            Gender.MALE, 
            MaritalStatus.SINGLE, 
            address, 
            nextOfKin, 
            credentials, 
            experience, 
            department, 
            position, 
            "A" // salaryGrade
        );

        employeeController.addEmployee(employee);

        // Generate test data for ReportingStructure
        ReportingStructure reportingStructure = new ReportingStructure(employee, employee);
        reportingStructureController.addReportingStructure(reportingStructure);
    }
}
