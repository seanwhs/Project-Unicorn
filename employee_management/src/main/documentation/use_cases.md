# Use Cases

Use Cases for Spring Boot Employee Management API Server:

1. **Admin User Registration:**
    - Description: An admin user needs to register with the system to gain access to administrative functionalities.
    - Actors: Admin User
    - Preconditions: None
    - Main Flow:
        1. The admin user sends a registration request with necessary details (username, email, password) via the registration endpoint.
        2. The system validates the input data.
        3. If validation passes, the system creates a new admin user and returns a success response.
    - Postconditions: Admin user is registered and can now log in to the system.

2. **Regular User Registration:**
    - Description: A regular user needs to register with the system to access employee data.
    - Actors: Regular User
    - Preconditions: None
    - Main Flow:
        1. The regular user sends a registration request with necessary details (username, email, password) via the registration endpoint.
        2. The system validates the input data.
        3. If validation passes, the system creates a new regular user and returns a success response.
    - Postconditions: Regular user is registered and can now log in to the system.

3. **User Login:**
    - Description: Users need to authenticate themselves to access the system.
    - Actors: Admin User, Regular User
    - Preconditions: User is registered.
    - Main Flow:
        1. The user sends a login request with credentials (username, password) via the login endpoint.
        2. The system verifies the credentials.
        3. If authentication is successful, the system generates a JWT token and returns it to the user.
    - Postconditions: User is authenticated and receives a JWT token for accessing protected endpoints.

4. **Employee Creation:**
    - Description: An admin user needs to add a new employee to the system.
    - Actors: Admin User
    - Preconditions: User is authenticated and has admin privileges.
    - Main Flow:
        1. The admin user sends an employee creation request with employee details via the appropriate endpoint.
        2. The system validates the input data.
        3. If validation passes, the system creates a new employee record and returns a success response.
    - Postconditions: New employee record is added to the system.

5. **Employee Search:**
    - Description: Users need to search for employees based on specific criteria.
    - Actors: Admin User, Regular User
    - Preconditions: User is authenticated.
    - Main Flow:
        1. The user sends a search request with search parameters (name, department, position) via the search endpoint.
        2. The system retrieves matching employee records based on the provided criteria.
        3. The system returns the search results to the user.
    - Postconditions: User receives the list of employees matching the search criteria.

6. **Department Creation:**
    - Description: An admin user needs to create a new department within the organization.
    - Actors: Admin User
    - Preconditions: User is authenticated and has admin privileges.
    - Main Flow:
        1. The admin user sends a department creation request with department details via the appropriate endpoint.
        2. The system validates the input data.
        3. If validation passes, the system creates a new department record and returns a success response.
    - Postconditions: New department record is added to the system.

7. **Position Management:**
    - Description: An admin user needs to manage positions within the organization.
    - Actors: Admin User
    - Preconditions: User is authenticated and has admin privileges.
    - Main Flow:
        1. The admin user sends requests to create, update, or delete positions via the appropriate endpoints.
        2. The system validates the input data for each operation.
        3. If validation passes, the system performs the requested operation on the position records and returns a success response.
    - Postconditions: Position records are created, updated, or deleted as per the admin user's actions.

These use cases cover various functionalities outlined in the Software Requirement Document for the Spring Boot Employee Management API Server, providing a detailed understanding of how users interact with the system and achieve their goals.
