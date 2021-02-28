/*
 * Contact class that stores informations on Contacts
 * Uses StringBuffers for mutable strings 
 * 
 */
package module.pkg3;

/**
 *
 * @author Daniel Tipton
 */
public class Contact {
    private String contactID;
    private StringBuffer firstName = new StringBuffer(10);
    private StringBuffer lastName = new StringBuffer(10);
    private StringBuffer phoneNum = new StringBuffer(10);
    private StringBuffer address = new StringBuffer(30);
    
    
    //constructor with all fields
    public Contact(String id, String firstName, String lastName, String number, String address) {
    	
    	if (id == null || id.length() > 10){
            throw new IllegalArgumentException("Invalid ID");
            
        }
    	
    	if (firstName == null || firstName.length() > 10){
            throw new IllegalArgumentException("Invalid Name");
            
        }
    	
    	if (lastName == null || lastName.length() > 10){
            throw new IllegalArgumentException("Invalid Last Name");
            
        }
    	
    	if (number == null || number.length() > 10){
            throw new IllegalArgumentException("Invalid Number");
            
        }
    	
    	
    	if (address == null || address.length() > 30){
            throw new IllegalArgumentException("Invalid Address");
            
        }
    	
    	else {
    	this.contactID = id;
    	this.firstName.append(firstName);
    	this.lastName.append(lastName);
    	this.phoneNum.append(number);
    	this.address.append(address);
    	
    	}
    	
    	
    }
      
    // constructor that just takes in an ID string
    public Contact(String contactID){
        if (contactID == null || contactID.length() > 10){
            throw new IllegalArgumentException("Invalid ID");
            
        }
        
        this.contactID = contactID;
        
        
    }
    
    
    //setters and getters
    public String getcontactID(){
        return this.contactID;
    }
    
    public StringBuffer getlastName(){
        return this.lastName;
    }
    
    public StringBuffer getfirstName() {
        return this.firstName;
    }
    
    public StringBuffer getphoneNum() {
        return this.phoneNum;
    }
    
    public StringBuffer getAddress() {
        return this.address;
    }
    
    public void setLastName(String name){
        
        this.lastName.replace(0,9,name);
       
    }
    
    public void setFirstName(String name){
         
         this.firstName.replace(0, 9, name);
            
      
    }
    
    public void setPhoneNum(String name){    
         
        this.phoneNum.replace(0, 9, name);
         
    }
    
    public void setAddress( String add){
       
         this.address.replace(0, 29, add);
            
    }
}
