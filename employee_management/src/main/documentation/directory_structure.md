# Employee Management System Directory Structure

```
employee-management-system
├── src
│   ├── main
│   │   ├── java
│   │   │   └── unicorn
│   │   │       └── employee_management
│   │   │           ├── controllers
│   │   │           │   ├── AddressController.java
│   │   │           │   ├── CredentialsController.java
│   │   │           │   ├── DepartmentController.java
│   │   │           │   ├── EmployeeController.java
│   │   │           │   ├── ExperienceController.java
│   │   │           │   ├── NextOfKinController.java
│   │   │           │   ├── PositionController.java
│   │   │           │   └── ReportingStructureController.java
│   │   │           ├── models
│   │   │           │   ├── Address.java
│   │   │           │   ├── Citizenship.java
│   │   │           │   ├── Credentials.java
│   │   │           │   ├── Department.java
│   │   │           │   ├── Employee.java
│   │   │           │   ├── Experience.java
│   │   │           │   ├── Gender.java
│   │   │           │   ├── MaritalStatus.java
│   │   │           │   ├── NextOfKin.java
│   │   │           │   ├── Position.java
│   │   │           │   ├── Race.java
│   │   │           │   └── ReportingStructure.java
│   │   │           ├── repository
│   │   │           │   ├── AddressRepository.java
│   │   │           │   ├── CredentialsRepository.java
│   │   │           │   ├── DepartmentRepository.java
│   │   │           │   ├── EmployeeRepository.java
│   │   │           │   ├── ExperienceRepository.java
│   │   │           │   ├── NextOfKinRepository.java
│   │   │           │   ├── PositionRepository.java
│   │   │           │   └── ReportingStructureRepository.java
│   │   │           └── services
│   │   │               ├── AddressService.java
│   │   │               ├── AddressServiceImpl.java
│   │   │               ├── CredentialsService.java
│   │   │               ├── CredentialsServiceImpl.java
│   │   │               ├── DepartmentService.java
│   │   │               ├── DepartmentServiceImpl.java
│   │   │               ├── EmployeeService.java
│   │   │               ├── EmployeeServiceImpl.java
│   │   │               ├── ExperienceService.java
│   │   │               ├── ExperienceServiceImpl.java
│   │   │               ├── NextOfKinService.java
│   │   │               ├── NextOfKinServiceImpl.java
│   │   │               ├── PositionService.java
│   │   │               ├── PositionServiceImpl.java
│   │   │               ├── ReportingStructureService.java
│   │   │               └── ReportingStructureServiceImpl.java
│   │   └── resources
│   │       └── application.properties
│   └── test
│       └── java
│           └── unicorn
│               └── employee_management
│                   ├── controllers
│                   │   └── ControllerTests.java
│                   └── services
│                       ├── ServiceTests.java
│                       └── ServiceTestsRunner.java
└── pom.xml

```

This structure includes:

1. **Controller Package**: Contains controller classes for each entity to handle HTTP requests and responses.
2. **Models Package**: Contains entity classes such as Address, Credentials, Department, Employee, Experience, NextOfKin, Position, and ReportingStructure.
3. **Repository Package**: Contains repository interfaces for each entity to perform CRUD operations.
4. **Services Package**: Contains service interfaces and their implementations for each entity to encapsulate business logic.
5. **Test Package**: Contains test classes for controller and service layers to perform unit tests.
6. **Resources**: Contains the `application.properties` file for configuring the Spring application.
7. **pom.xml**: Maven configuration file for managing project dependencies.

This structure organizes the project in a clean and maintainable way, following best practices for Spring Boot applications. Let me know if you need further assistance!
