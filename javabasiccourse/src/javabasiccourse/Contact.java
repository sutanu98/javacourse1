package javabasiccourse;

public class Contact {
 private String name=new String();
 private String phoneNumber=new String();
public Contact(String name, String phoneNumber) {
	//super();
	this.name = name;
	this.phoneNumber = phoneNumber;
}
public String getName() {
	return this.name;
}
public String getPhoneNumber() {
	return this.phoneNumber;
}
public static Contact createContact(String name,String phoneNumber) {
	//this.name=name;
	//this.phoneNumber=phoneNumber;
	Contact ret=new Contact(name,phoneNumber);
	return ret;
}
 
}
