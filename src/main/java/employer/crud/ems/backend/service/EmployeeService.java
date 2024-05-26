package employer.crud.ems.backend.service;

import employer.crud.ems.backend.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {

    EmployeeDto creaEmployeeDto(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long id);

    List<EmployeeDto> getAllEmployees();

     EmployeeDto updateEmployee(Long id, EmployeeDto employeeDto);

    void deleteEmployee(Long id);

}
