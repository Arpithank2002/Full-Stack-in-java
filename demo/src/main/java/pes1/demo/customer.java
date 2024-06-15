
package pes1.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity

public class customer {
@Id
private int cid;
private String cname;
private String email;
private String city;
private long phone;
public int getCid() {
	return cid;
}


public customer() {
	super();
}


public customer(int cid, String cname, String email, String city, long phone) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.email = email;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
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