package com.springbootTutorial.SpringDataJPATutorial.springDataJPARespository;

import com.springbootTutorial.SpringDataJPATutorial.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

// the code below is used to create a repository for containing the signatures of the methods for doing 
// transaction and commiting data to the mysql database

// Extending the interface below with the JPARespository interface for getting access to all the CRUD
// methods present in the JPARespository interface class and passing the name of the entity class and
// the type of the primary key of the entity class as the generic values to the JPARepository interface
public interface EmployeeJPARepository extends JpaRepository<EmployeeEntity, Integer>{
    
}
