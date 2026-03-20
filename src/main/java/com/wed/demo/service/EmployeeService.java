package com.wed.demo.service;

import com.wed.demo.records.Employee;
import com.wed.demo.records.EmployeeRequest;
import com.wed.demo.records.EmployeeResponse;
import com.wed.demo.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface EmployeeService {

  EmployeeResponse create(EmployeeRequest request);

  EmployeeResponse update(Long id, EmployeeRequest request);

  EmployeeResponse patch(Long id, EmployeeRequest request);

}
