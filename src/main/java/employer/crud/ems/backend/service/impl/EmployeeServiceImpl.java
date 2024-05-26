package employer.crud.ems.backend.service.impl;

import employer.crud.ems.backend.dto.EmployeeDto;
import employer.crud.ems.backend.entity.Employee;
import employer.crud.ems.backend.exception.ResourceNotFoundException;
import employer.crud.ems.backend.mapper.EmployeeMapper;
import employer.crud.ems.backend.repository.EmployeeRepository;
import employer.crud.ems.backend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor


public class EmployeeServiceImpl implements EmployeeService {

    private  EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto creaEmployeeDto(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee= employeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDto(savedEmployee);


    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId)
        .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id: " + employeeId));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }
}
