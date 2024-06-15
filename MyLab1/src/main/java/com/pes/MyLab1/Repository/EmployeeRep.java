package com.pes.MyLab1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pes.MyLab1.model.Employee;
public interface EmployeeRep extends JpaRepository<Employee,Long>{

}
