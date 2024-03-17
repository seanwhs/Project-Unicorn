//Department.java
package unicorn.employee_management.models;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phoneNumber;
    private Date dateJoined;
    private Date dateLeft;
    private Date dateOfBirth;
    private String nationalType; 
    private String nationalId; 

    @Enumerated(EnumType.STRING)
    private Race race;

    @Enumerated(EnumType.STRING)
    private Citizenship citizenship;

    @Enumerated(EnumType.STRING)
    private Religion religion;

    @Enumerated(EnumType.STRING)
    private Gender gender;
    
    @Enumerated(EnumType.STRING)
    private MaritalStatus maritalStatus;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @ManyToOne
    @JoinColumn(name = "next_of_kin_id")
    private NextOfKin nextOfKin;

    @ManyToOne
    @JoinColumn(name = "credentials_id")
    private Credentials credentials;

    @ManyToOne
    @JoinColumn(name = "experience_id")
    private Experience experience;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position position;

    private String salaryGrade;

    public Employee(String name, String email, String phoneNumber, Date dateJoined, Date dateLeft, Date dateOfBirth,
            String nationalType, String nationalId, Race race, Citizenship citizenship, Religion religion,
            Gender gender, MaritalStatus maritalStatus, Address address, NextOfKin nextOfKin, Credentials credentials,
            Experience experience, Department department, Position position, String salaryGrade) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateJoined = dateJoined;
        this.dateLeft = dateLeft;
        this.dateOfBirth = dateOfBirth;
        this.nationalType = nationalType;
        this.nationalId = nationalId;
        this.race = race;
        this.citizenship = citizenship;
        this.religion = religion;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.address = address;
        this.nextOfKin = nextOfKin;
        this.credentials = credentials;
        this.experience = experience;
        this.department = department;
        this.position = position;
        this.salaryGrade = salaryGrade;
    }

    
}
