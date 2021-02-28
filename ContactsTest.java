package Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import module.pkg3.Contact;

class ContactsTest {

 /*
  * Test using the setters and getters of the
  * Contact class   
  */
@Test
public void testContactClass(){
    Contact contact = new Contact("123456789");
    contact.setFirstName("bill");
    contact.setLastName("robinson");
    contact.setAddress("123 road");
    contact.setPhoneNum("1234567123");
    
    
    assertTrue(contact.getfirstName().toString().equals("bill"));
    assertTrue(contact.getlastName().toString().equals("robinson"));
    assertTrue(contact.getAddress().toString().equals("123 road"));
    assertTrue(contact.getcontactID().equals("123456789"));
    assertTrue(contact.getphoneNum().toString().equals("1234567123"));
    
}

/*
 * Test where all fields are too long 
 */
@Test
public void testContactClassTooLong() {
    
    assertThrows(IllegalArgumentException.class,() -> {
    new Contact("12345678901","jimjimjimm","robinsononn","12345678901","1234567890 1234567890 1234567890");
});
}

/*
 * Test of the other constructor with all fields too long
 */
@Test
public void testContactStringOnly() {
	assertThrows(IllegalArgumentException.class,()-> {
		new Contact("12345678901");
	});
}

/*
 * Next series of test go through
 * and test different exceptions ( length and null value test)
 * for each individual value in the constructor.
 */
@Test
public void testContactFirstNameOnly() {
	assertThrows(IllegalArgumentException.class,()-> {
		new Contact("123456789","BillBillBill","jones","1231231245","123 road");
	});
}


@Test
public void testContactLastNameOnly() {
	assertThrows(IllegalArgumentException.class,()-> {
		new Contact("123456789","Bill","JonesJoness","12312367","123 road");
	});
}



@Test
public void testContactPhoneNumberOnly() {
	assertThrows(IllegalArgumentException.class,()-> {
		new Contact("123456789","bill","jones","12345678901","123 road");
	});
}


@Test
public void testContactAddressOnly() {
	assertThrows(IllegalArgumentException.class,()-> {
		new Contact("123456789","bill","jones","12367845","1234567890 1234567890 1234567890");
	});
}

@Test
public void testContactIdNullOnly() {
	assertThrows(IllegalArgumentException.class,()-> {
		new Contact(null,"bill","jones","1236784567","123456789");
	});
}


@Test
public void testContactFistNameNullOnly() {
	assertThrows(IllegalArgumentException.class,()-> {
		new Contact("123456789",null,"jones","1236784567","1234567890");
	});
}

@Test
public void testContactLastNameNullOnly() {
	assertThrows(IllegalArgumentException.class,()-> {
		new Contact("123456789","bill",null,"1236784567","1234567890");
	});
}

@Test
public void testContactPhoneNumNullOnly() {
	assertThrows(IllegalArgumentException.class,()-> {
		new Contact("123456789","bill","jones",null,"1234567890");
	});
}


@Test
public void testContactAddressNullOnly() {
	assertThrows(IllegalArgumentException.class,()-> {
		new Contact("123456789","bill","jones","12367845",null);
	});
}




}



