package uz.jurayev.employee.controller;

import org.springframework.web.bind.annotation.*;
import uz.jurayev.employee.entity.EmployeeEntity;

import java.util.List;

@CrossOrigin(origins = "localhost:3000")
@RestController
@RequestMapping("/api")
public class EmployeeController {

    @GetMapping("/employees")
    public List<EmployeeEntity> getEmployees(){
        return List.of(new EmployeeEntity("1", "Xurshid", "Jurayev", "hersh1409@gmail.com"),
                       new EmployeeEntity("2", "Xayotxon", "Jurayeva", "xayotxon@gmail.com"),
                       new EmployeeEntity("3", "Sarvar", "Mirzajonov", "sarvar@gmail.com"),
                       new EmployeeEntity("4", "Maxmudjon", "Bozorov", "maxmud1234@gmail.com"));
    }
//    @PostMapping("/add")
//    public void createEmployee(){
//
//    }
//    @PutMapping(/{employeId})
//    public EmployeeDto updateEmployee(){
//
//    }
//    @DeleteMapping("/{employeeId}")
//    public void deleteEmployee(){
//
//    }
}
