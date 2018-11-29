package com.secondlevelcache;

public class UserDTO {
 
	private int id;
	private String firstname;
	private String lastname;
	private String city;
	private String email;
	private String password;
	private int age;
	
	public int getId() {
		return id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", city=" + city
				+ ", email=" + email + ", password=" + password + ", getId()=" + getId() + ", getFirstname()="
				+ getFirstname() + ", getLastname()=" + getLastname() + ", getCity()=" + getCity() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
