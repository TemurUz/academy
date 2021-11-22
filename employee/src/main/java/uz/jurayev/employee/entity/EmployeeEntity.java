package uz.jurayev.employee.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;

//@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
//@Table(name = "employee")
public class EmployeeEntity {

//    @Id
    private String employeeId;
    private String firstName;
    private String lastName;
//    @Column(unique = true)
    private String email;

}
