package employer.crud.ems.backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import employer.crud.ems.backend.dto.EmployeeDto;
import employer.crud.ems.backend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private  EmployeeService employeeService;

    // api add employee


    @PostMapping   
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {
        EmployeeDto savedEmployee = employeeService.creaEmployeeDto(employeeDto);
        return  new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
}