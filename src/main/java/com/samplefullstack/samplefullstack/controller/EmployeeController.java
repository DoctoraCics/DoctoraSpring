package com.samplefullstack.samplefullstack.controller;

import com.samplefullstack.samplefullstack.entity.Employee;
import com.samplefullstack.samplefullstack.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*") //allow connections
public class EmployeeController
{
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> getAll()
    {
        return employeeRepository.findAll();
    }

    @PostMapping("/employees")
    public Employee postEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }

    @GetMapping("/employees/{employee_id}")
    public Employee getEmployee(@PathVariable Long employee_id) {return employeeRepository.findById(employee_id).get();}

    @PutMapping("/employees")
    public Employee putEmployee(@RequestBody Employee employee) {return employeeRepository.save(employee);}

    @DeleteMapping("/employees/{employee_id}")
    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable Long employee_id){
        employeeRepository.deleteById(employee_id);
        return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
    }
}
