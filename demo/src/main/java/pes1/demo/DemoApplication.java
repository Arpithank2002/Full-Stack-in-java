package pes1.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	@Autowired
	CustomerDao customerDao;
	@Autowired
    EmployeeDao employeeDao;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		customer c= new customer(1,"Anya","pes123@gmail.com","karnataka",6000);
		customer p= new customer(2,"Rani","pes123@gmail.com","india",2314);
		customer d= new customer(3,"Ragu","Mandya123@gmail.com","Mandya",34351);

		customerDao.save(c);
		customerDao.save(p);
		customerDao.save(d);
		customerDao.delete(d);
		System.out.println("lab1 Doen");
		
		Employee e= new Employee(1,"Anya","karnataka",6000);
		employeeDao.save(e);
		
	}

}