package com.pes.MyLab1.Controller;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pes.MyLab1.Repository.EmployeeRep;
import com.pes.MyLab1.model.Employee;
@RestController
@RequestMapping("/myEmployees/v1.0")
public class EmployeeController {
	@Autowired
	EmployeeRep employeeRep;
	@GetMapping("/allEmployees")
	public List<Employee> getAllEmployees(){
		List<Employee> le=employeeRep.findAll();
		return le;
	}
	/*@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		
		return employeeRep.save(employee);
	}*/
	@PostMapping("/addEmployeeList")
	public List<Employee> addEmployeeList(@RequestBody List<Employee> employees) {
		return  employeeRep.saveAll(employees);
	}
	  @DeleteMapping("/deleteEmployee/{id}")
	    public String deleteEmployee(@PathVariable long id) {
	        Optional<Employee> employee = employeeRep.findById(id);
	        if (employee.isPresent()) {
	            employeeRep.deleteById(id);
	            return "Employee deleted successfully";
	        } else {
	            return "Employee not found";
	        }
	    }
}
