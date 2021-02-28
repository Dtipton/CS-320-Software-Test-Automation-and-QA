package ContactTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import module.pkg3.Contact;
import module.pkg3.ContactService;
import java.util.ArrayList;

class ContactServiceTest {
	
	
	/*
	 * Testing to see if exception arguement goes through
	 */
	@Test
	public void ContactServiceAddTestException() {
		ContactService contact = new ContactService();
		
		contact.add("1234567890");
		assertThrows(IllegalArgumentException.class,() -> {
		    contact.add("1234567890");
		});
		
	}
	
	/*
	 * Test to make sure add function is working
	 */
	@Test
	public void ContactServiceAddTest() {
		ContactService contact = new ContactService();
		contact.add("123456789");
		boolean isthere = false;
		
		// go through the arraylist looking for a match
		for ( int i = 0; i < contact.getContactService().size(); i++) {
			if (contact.getContactService().get(i).getcontactID().equals("123456789")) {
				isthere = true;
			}
			
			assertTrue(isthere == true);
				
		}
		
	}
	
	/*
	 * Test of the delete function
	 */
	@Test
	public void ContactServiceDeleteTest() {
		ContactService contact = new ContactService();
		contact.add("123456789");
		contact.add("098765432");
		contact.delete("098765432");
		boolean isgone = true;
		
		//after method is called check to see the item is gone from the list
		for ( int i = 0; i < contact.getContactService().size(); i++) {
			if (contact.getContactService().get(i).getcontactID().equals("09875432")) {
				isgone = false;
			}
			
			assertTrue(isgone == true);
		}
		
	}
	
	/*
	 * Test updating of the different contact
	 * fields
	 */
	@Test
	public void ContactServiceUpdateTest() {
		ContactService contact = new ContactService();
		contact.add("123456789");
		contact.updateFirstName("123456789","bill");
		contact.updateLastName("123456789", "robinson");
		contact.updatePhoneNum("123456789","123456");
		contact.updateAddress("123456789", "123 road");
		
		// since there is only one element in the arraylist I look at the first item , turn the stringbuffer object into a string and then compare with the updated values
		assertTrue(contact.getContactService().get(0).getfirstName().toString().equals("bill"));
		assertTrue(contact.getContactService().get(0).getlastName().toString().equals("robinson"));
		assertTrue(contact.getContactService().get(0).getphoneNum().toString().equals("123456"));
		assertTrue(contact.getContactService().get(0).getAddress().toString().equals("123 road"));
	}
	

}
