import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testContactClass() {
		Contact contact = new Contact("1234567890", "fname", "lname", "5558885555", "home");
		assertTrue(contact.getContactId().equals("1234567890"));
		assertTrue(contact.getFirstName().equals("fname"));
		assertTrue(contact.getLastName().equals("lname"));
		assertTrue(contact.getPhoneNumber().equals("5558885555"));
		assertTrue(contact.getAddress().equals("home"));
	}
	
	@Test
	void testContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("12345678901", "fname", "lname", "5558885555", "home");
		});
	}
	
	@Test
	void testContactClassIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact(null, "fname", "lname", "5558885555", "home");
		});
	}

	
	@Test
	void testContactFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("1234567890", "fnamefnamef", "lname", "5558885555", "home");
		});
	}
	
	@Test
	void testContactFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("1234567890", null, "lname", "5558885555", "home");
		});
	}

	
	@Test
	void testContactLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("1234567890", "fname", "lnamelnamel", "5558885555", "home");
		});
	}
	
	@Test
	void testContactLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("1234567890", "fname", null, "5558885555", "home");
		});
	}

	
	@Test
	void testContactPhoneNumerTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("1234567890", "fname", "lname", "55588855551", "home");
		});
	}

	
	@Test
	void testContactPhoneNumerTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("1234567890", "fname", "lname", "555888555", "home");
		});
	}
	
	@Test
	void testContactPhoneNumberIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("1234567890", "fname", "lname", null, "home");
		});
	}

	
	@Test
	void testContactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("1234567890", "fname", "lname", "5558885555", "home1home2home3home4home5home6h");
		});
	}
	
	@Test
	void testContactAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("1234567890", "fname", "lname", "5558885555", null);
		});
	}

}
