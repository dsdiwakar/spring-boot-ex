package com.abc.ordermanagement.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "customer")
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2810001854729659313L;
	@Id
	private int customerId;
	private String firstName;
	private String lastName;
	private String middleName;

	@JsonManagedReference(value = "customer-address")
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Address> addressSet;

	@JsonManagedReference(value = "customer-contact")
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Contact> contactSet;

	public Customer() {
	}

	public Customer(int customerId, String firstName, String lastName, String middleName, Set<Address> addressSet,
			Set<Contact> contactSet) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.addressSet = addressSet;
		this.contactSet = contactSet;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public Set<Address> getAddressSet() {
		return addressSet;
	}

	public void setAddressSet(Set<Address> addressSet) {
		this.addressSet = addressSet;
	}

	public Set<Contact> getContactSet() {
		return contactSet;
	}

	public void setContactSet(Set<Contact> contactSet) {
		this.contactSet = contactSet;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", middleName=" + middleName + ", addressSet=" + addressSet + ", contactSet=" + contactSet + "]";
	}

}
