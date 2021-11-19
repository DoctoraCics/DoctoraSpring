package com.samplefullstack.samplefullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.samplefullstack.samplefullstack.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>
{
}
