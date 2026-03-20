package com.wed.demo.service;

import com.wed.demo.entity.Employee;
import com.wed.demo.records.EmployeeRequest;
import com.wed.demo.records.EmployeeResponse;
import com.wed.demo.repo.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeServiceImpl implements EmployeeService{



    private final EmployeeRepository repository;
    @Override
    public EmployeeResponse create(EmployeeRequest request) {

        Employee emp = new Employee();
        emp.setName(request.name());
        emp.setEmail(request.email());
        emp.setSalary(request.salary());
        emp.setDepartment(request.department());
        return map(repository.save(emp));
    }

    @Override
    public EmployeeResponse update(Long id, EmployeeRequest request) {
        return null;
    }

    @Override
    public EmployeeResponse patch(Long id, EmployeeRequest request) {
        return null;
    }

private EmployeeResponse map(Employee e){
        return new EmployeeResponse(
                e.getId(),
                e.getName(),
                e.getEmail(),
                e.getSalary(),
                e.getDepartment()
        );
}
}
