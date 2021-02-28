/*
 * Builds an arrayList of Contacts
 * Adds, Removes and edits contacts in the list
 * 
 */
package module.pkg3;

import java.util.ArrayList;

/**
 *
 * @author Daniel Tipton
 */
public class ContactService {
    private ArrayList<Contact> contacts = new ArrayList<Contact>();
    
    // adds items to the arraylist if as long as they are unique
    public void add(String id){
        Contact temp = new Contact(id);
        boolean check = false;
        
        for (int i = 0; i < contacts.size(); i++){
            if ( contacts.get(i).getcontactID().equals(id)){
                check = true;
            }
        }
        
        if ( check == true){
            
            throw new IllegalArgumentException("ID Already Exist");
            
        }
        
        else {
            
        contacts.add(temp);
       
        }
    }
    
    /*
     * Takes in a string id and removes the contact with that from the ContactService arraylist
     */
    public void delete(String id){
        
        for ( int i = 0; i < contacts.size(); i++){
            if (contacts.get(i).getcontactID().equals(id)){
                contacts.remove(i);
            }
        }
    }
    
    
    /*
     * Functions to update the values of Contacts
     */
    public void updateFirstName(String id, String name){
        
        for ( int i = 0; i < contacts.size(); i++){
            if (contacts.get(i).getcontactID().equals(id)){
                contacts.get(i).setFirstName(name);
            }
        }
        
    }
    
    public void updateLastName( String id, String name){
        for ( int i = 0; i < contacts.size(); i++){
            if (contacts.get(i).getcontactID().equals(id)){
                contacts.get(i).setLastName(name);
            }
        }
    }
    
    public void updatePhoneNum( String id, String num){
        for ( int i = 0; i < contacts.size(); i++){
            if (contacts.get(i).getcontactID().equals(id)){
                contacts.get(i).setPhoneNum(num);
            }
        }
    }
    
    public void updateAddress ( String id, String add){
        for ( int i = 0; i < contacts.size(); i++){
            if (contacts.get(i).getcontactID().equals(id)){
                contacts.get(i).setAddress(add);
            }
        }
    }
    
    
    public ArrayList<Contact> getContactService(){
        return contacts;
    }
    
}
