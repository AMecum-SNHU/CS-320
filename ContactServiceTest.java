import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	void testContactServiceClass() {
		ContactService contactList = new ContactService();
		assertTrue(contactList.contacts.size() == 0);
	}

	@Test
	void testContactServiceAdd() {
		ContactService contactList = new ContactService();
		contactList.addContact(new Contact());
		assertTrue(contactList.contacts.size() == 1);
	}

	@Test
	void testContactServiceAddDuplicateId() {
		ContactService contactList = new ContactService();
		contactList.addContact(new Contact("1"));
		contactList.addContact(new Contact("1"));
		assertTrue(contactList.contacts.size() == 1);
	}

	@Test
	void testContactServicDelete() {
		ContactService contactList = new ContactService();
		contactList.addContact(new Contact("1"));
		contactList.deleteContact("1");
		assertTrue(contactList.contacts.size() == 0);
	}
	
	@Test
	void testContactServiceUpdate() {
		ContactService contactList = new ContactService();
		contactList.addContact(new Contact());
		contactList.updateContact("new", "newFName", "newLName", "5558885555", "newAddress");
		for (Contact c : contactList.contacts) {
			if (c.getContactId().equals("new")) {
				assertTrue(c.getFirstName().equals("newFName"));
				assertTrue(c.getLastName().equals("newLName"));
				assertTrue(c.getPhoneNumber().equals("5558885555"));
				assertTrue(c.getAddress().equals("newAddress"));
			}
		}
	}

}
