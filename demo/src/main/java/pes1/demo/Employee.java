
package pes1.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity

public class Employee {
@Id
private int cid;
private String cname;

private String city;
private long phone;
public int getCid() {
	return cid;
}


public Employee() {
	super();
}


public Employee(int cid, String cname,  String city, long phone) {
	super();
	this.cid = cid;
	this.cname = cname;
	
	this.city = city;
	this.phone = phone;
}

public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}


public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
}