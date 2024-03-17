# Postman Tests:

### AddressController Tests:

1. **Get All Addresses**:
    - Method: GET
    - URL: `http://localhost:8080/api/address/`
2. **Get Address by ID**:
    - Method: GET
    - URL: `http://localhost:8080/api/address/{id}`
3. **Add Address**:
    - Method: POST
    - URL: `http://localhost:8080/api/address/`
    - Body (JSON):
        
        ```json
        {
            "street": "Sample Street",
            "city": "Sample City",
            "state": "Sample State",
            "postalCode": "12345",
            "country": "Sample Country"
        }
        
        ```
        
4. **Update Address**:
    - Method: PUT
    - URL: `http://localhost:8080/api/address/{id}`
    - Body (JSON, Updated Address Data):
        
        ```json
        {
            "street": "Updated Street",
            "city": "Updated City",
            "state": "Updated State",
            "postalCode": "54321",
            "country": "Updated Country"
        }
        
        ```
        
5. **Delete Address**:
    - Method: DELETE
    - URL: `http://localhost:8080/api/address/{id}`

### CredentialsController Tests:

1. **Get All Credentials**:
    - Method: GET
    - URL: `http://localhost:8080/api/credentials/`
2. **Get Credentials by ID**:
    - Method: GET
    - URL: `http://localhost:8080/api/credentials/{id}`
3. **Add Credentials**:
    - Method: POST
    - URL: `http://localhost:8080/api/credentials/`
    - Body (JSON):
        
        ```json
        {
            "type": "Sample Type",
            "issuer": "Sample Issuer",
            "issueDate": "2024-03-17",
            "expiryDate": "2025-03-17"
        }
        
        ```
        
4. **Update Credentials**:
    - Method: PUT
    - URL: `http://localhost:8080/api/credentials/{id}`
    - Body (JSON, Updated Credentials Data):
        
        ```json
        {
            "type": "Updated Type",
            "issuer": "Updated Issuer",
            "issueDate": "2024-03-17",
            "expiryDate": "2025-03-17"
        }
        
        ```
        
5. **Delete Credentials**:
    - Method: DELETE
    - URL: `http://localhost:8080/api/credentials/{id}`

### DepartmentController Tests:

1. **Get All Departments**:
    - Method: GET
    - URL: `http://localhost:8080/api/department/`
2. **Get Department by ID**:
    - Method: GET
    - URL: `http://localhost:8080/api/department/{id}`
3. **Add Department**:
    - Method: POST
    - URL: `http://localhost:8080/api/department/`
    - Body (JSON):
        
        ```json
        {
            "name": "Sample Department",
            "description": "Sample Department Description"
        }
        
        ```
        
4. **Update Department**:
    - Method: PUT
    - URL: `http://localhost:8080/api/department/{id}`
    - Body (JSON, Updated Department Data):
        
        ```json
        {
            "name": "Updated Department",
            "description": "Updated Department Description"
        }
        
        ```
        
5. **Delete Department**:
    - Method: DELETE
    - URL: `http://localhost:8080/api/department/{id}`

### EmployeeController Tests:

1. **Get All Employees**:
    - Method: GET
    - URL: `http://localhost:8080/api/employee/`
2. **Get Employee by ID**:
    - Method: GET
    - URL: `http://localhost:8080/api/employee/{id}`
3. **Add Employee**:
    - Method: POST
    - URL: `http://localhost:8080/api/employee/`
    - Body (JSON):
        
        ```json
        {
            "name": "Sample Employee",
            "email": "sample@example.com",
            "phoneNumber": "1234567890",
            "dateJoined": "2024-03-17",
            "dateLeft": "2025-03-17",
            "dateOfBirth": "1990-01-01",
            "nationalType": "Sample National Type",
            "nationalId": "1234567890",
            "race": "MALAY",
            "citizenship": "SINGAPOREAN",
            "religion": "CHRISTIANITY",
            "gender": "MALE",
            "maritalStatus": "SINGLE",
            "address": {
                "street": "Sample Street",
                "city": "Sample City",
                "state": "Sample State",
                "postalCode": "12345",
                "country": "Sample Country"
            },
            "nextOfKin": {
                "name": "Sample Next of Kin",
                "relationship": "Sample Relationship",
                "phoneNumber": "1234567890",
                "email": "nextofkin@example.com",
                "address": {
                    "street": "Next of Kin Street",
                    "city": "Next of Kin City",
                    "state": "Next of Kin State",
                    "postalCode": "54321",
                    "country": "Next of Kin Country"
                }
            },
            "credentials": {
                "type": "Sample Type",
                "issuer": "Sample Issuer",
                "issueDate": "2024-03-17",
                "expiryDate": "2025-03-17"
            },
            "experience": {
                "companyName": "Sample Company",
                "jobTitle": "Sample Job Title",
                "startDate": "2020-01-01",
                "endDate": "2022-01-01"
            },
            "department": {
                "name": "Sample Department",
                "description": "Sample Department Description"
            },
            "position": {
                "name": "Sample Position",
                "description": "Sample Position Description"
            },
            "salaryGrade": "Sample Salary Grade"
        }
        
        ```
        
4. **Update Employee**:
    - Method: PUT
    - URL: `http://localhost:8080/api/employee/{id}`
    - Body (JSON, Updated Employee Data):
        
        ```json
        {
            "name": "Updated Employee Name",
            "email": "updated@example.com",
            "phoneNumber": "9876543210"
            // Add other updated fields as needed
        }
        
        ```
        
5. **Delete Employee**:
    - Method: DELETE
    - URL: `http://localhost:8080/api/employee/{id}`

### ExperienceController Tests:

1. **Get All Experiences**:
    - Method: GET
    - URL: `http://localhost:8080/api/experience/`
2. **Get Experience by ID**:
    - Method: GET
    - URL: `http://localhost:8080/api/experience/{id}`
3. **Add Experience**:
    - Method: POST
    - URL: `http://localhost:8080/api/experience/`
    - Body (JSON):
        
        ```json
        {
            "companyName": "Sample Company",
            "jobTitle": "Sample Job Title",
            "startDate": "2020-01-01",
            "endDate": "2022-01-01"
        }
        
        ```
        
4. **Update Experience**:
    - Method: PUT
    - URL: `http://localhost:8080/api/experience/{id}`
    - Body (JSON, Updated Experience Data):
        
        ```json
        {
            "companyName": "Updated Company",
            "jobTitle": "Updated Job Title",
            "startDate": "2021-01-01",
            "endDate": "2023-01-01"
        }
        
        ```
        
5. **Delete Experience**:
    - Method: DELETE
    - URL: `http://localhost:8080/api/experience/{id}`

### NextOfKinController Tests:

1. **Get All Next of Kin**:
    - Method: GET
    - URL: `http://localhost:8080/api/nextofkin/`
2. **Get Next of Kin by ID**:
    - Method: GET
    - URL: `http://localhost:8080/api/nextofkin/{id}`
3. **Add Next of Kin**:
    - Method: POST
    - URL: `http://localhost:8080/api/nextofkin/`
    - Body (JSON):
        
        ```json
        {
            "name": "Sample Next of Kin",
            "relationship": "Sample Relationship",
            "phoneNumber": "1234567890",
            "email": "nextofkin@example.com",
            "address": {
                "street": "Next of Kin Street",
                "city": "Next of Kin City",
                "state": "Next of Kin State",
                "postalCode": "54321",
                "country": "Next of Kin Country"
            }
        }
        
        ```
        
4. **Update Next of Kin**:
    - Method: PUT
    - URL: `http://localhost:8080/api/nextofkin/{id}`
    - Body (JSON, Updated Next of Kin Data):
        
        ```json
        {
            "name": "Updated Next of Kin Name",
            "phoneNumber": "9876543210"
            // Add other updated fields as needed
        }
        
        ```
        
5. **Delete Next of Kin**:
    - Method: DELETE
    - URL: `http://localhost:8080/api/nextofkin/{id}`

### PositionController Tests:

1. **Get All Positions**:
    - Method: GET
    - URL: `http://localhost:8080/api/position/`
2. **Get Position by ID**:
    - Method: GET
    - URL: `http://localhost:8080/api/position/{id}`
3. **Add Position**:
    - Method: POST
    - URL: `http://localhost:8080/api/position/`
    - Body (JSON):
        
        ```json
        {
            "name": "Sample Position",
            "description": "Sample Position Description"
        }
        
        ```
        
4. **Update Position**:
    - Method: PUT
    - URL: `http://localhost:8080/api/position/{id}`
    - Body (JSON, Updated Position Data):
        
        ```json
        {
            "name": "Updated Position Name",
            "description": "Updated Position Description"
        }
        
        ```
        
5. **Delete Position**:
    - Method: DELETE
    - URL: `http://localhost:8080/api/position/{id}`

### ReportingStructureController Tests:

1. **Get All Reporting Structures**:
    - Method: GET
    - URL: `http://localhost:8080/api/reportingstructure/`
2. **Get Reporting Structure by ID**:
    - Method: GET
    - URL: `http://localhost:8080/api/reportingstructure/{id}`
3. **Add Reporting Structure**:
    - Method: POST
    - URL: `http://localhost:8080/api/reportingstructure/`
    - Body (JSON):
        
        ```json
        {
            "supervisorId": 1,
            "employeeId": 2
        }
        
        ```
        
4. **Update Reporting Structure**:
    - Method: PUT
    - URL: `http://localhost:8080/api/reportingstructure/{id}`
    - Body (JSON, Updated Reporting Structure Data):
        
        ```json
        {
            "supervisorId": 3,
            "employeeId": 4
        }
        
        ```
        
5. **Delete Reporting Structure**:
    - Method: DELETE
    - URL: `http://localhost:8080/api/reportingstructure/{id}`
