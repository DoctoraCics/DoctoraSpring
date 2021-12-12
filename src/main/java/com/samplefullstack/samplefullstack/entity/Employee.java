package com.samplefullstack.samplefullstack.entity;
import javax.persistence.*;

@Entity
@Table(name = "tbl_employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employee_id;
    private String name;
    private String location;
    private String department;

    public Employee(Long employee_id, String name, String location, String department) {
        this.employee_id = employee_id;
        this.name = name;
        this.location = location;
        this.department = department;
    }
    public Employee()
    {

    }

    public Long getEmployeeId() {
        return employee_id;
    }

    public void setEmployeeId(Long employeeId) {
        this.employee_id = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


}
