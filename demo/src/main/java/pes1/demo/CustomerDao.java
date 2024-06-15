package pes1.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<customer, Integer> {

}