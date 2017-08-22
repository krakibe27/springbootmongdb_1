package io.spring.example.demo.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="customesList")
public class Customer implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private String address;

	public Customer() {

	}

	public Customer(String id, String address) {
		super();
		this.id = id;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", address=" + address + "]";
	}

}
