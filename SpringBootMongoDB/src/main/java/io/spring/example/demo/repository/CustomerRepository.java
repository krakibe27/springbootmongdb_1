package io.spring.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import io.spring.example.demo.model.Customer;

@RepositoryRestResource(collectionResourceRel="customer", path="customer")
public interface CustomerRepository extends MongoRepository<Customer, String> {
	
	List<Customer> findByAddress(@Param("name") String name);

}
