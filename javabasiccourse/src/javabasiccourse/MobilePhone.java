package javabasiccourse;
import java.util.*;
public class MobilePhone {
private ArrayList<Contact> myContacts;//=new ArrayList<Contact>();
private String myNumber=new String();
public MobilePhone(String myNumber){
	this.myNumber=myNumber;
	myContacts=new ArrayList<Contact>();
}
public boolean addNewContact(Contact contact) {
	if(findContact(contact.getName())==-1) {
		
		//System.out.println("check if there: "+myContacts.contains(contact));
		myContacts.add(contact);
		return true;
	}
	else {
		return false;
	}
}
public boolean updateContact(Contact old, Contact upd) {
	if(myContacts.contains(old)) {
		myContacts.set(myContacts.indexOf(old),upd);
		return true;
	}
	else {
		return false;
	}
}
public boolean removeContact(Contact contact) {
	if(myContacts.contains(contact)) {
		myContacts.remove(contact);
		return true;
	}
	else {
		return false;
	}
}
private int findContact(Contact contact) {
	return findContact(contact.getName());
	//return myContacts.indexOf(contact);
}
private int findContact(String name) {
	int j=0;
	int ret=-1;
	for(int i=0;i<myContacts.size();i++) {
		if((myContacts.get(i).getName()).equals(name)) {
			ret=i;
			break;
		}
		j=i+1;
	}
	return ret;	
}
public Contact queryContact(String name) {
	int j=0;
	Contact ret=null;
	for(int i=0;i<myContacts.size();i++) {
		if((myContacts.get(i).getName()).equals(name)) {
			ret=myContacts.get(i);
			break;
		}
		j=i+1;
	}
	if(j==myContacts.size()) {
		ret=null;
	}
	return ret;
}
public void printContacts() {
	 System.out.println("Contact List:");
		for(int i=0;i<myContacts.size();i++) {
		System.out.println((i+1)+". "+myContacts.get(i).getName()+" -> "+myContacts.get(i).getPhoneNumber());
		}
	}

}
