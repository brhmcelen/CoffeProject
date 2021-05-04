package entities;

import java.util.Date;

public class Customer {
	
	private int id;
	private String firstName;
	private String lastName;
	private String tckn;
	private Date dateOfBirth;
	
	
	public Customer() {
		
		
		
	}


	public Customer(int id, String firstName, String lastName, String tckn, Date dateOfBirth) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.tckn = tckn;
		this.dateOfBirth = dateOfBirth;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getTckn() {
		return tckn;
	}


	public void setTckn(String tckn) {
		this.tckn = tckn;
	}


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
