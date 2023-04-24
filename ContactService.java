import java.util.*;

public class ContactService {
	ArrayList<Contact> contacts;
	
	public ContactService() {
		contacts = new ArrayList<>();
	}
	
	// Add contact
	public boolean addContact(Contact contact) {
		boolean contactExists = false;
		
		// Check if contact exists
		for (Contact c : contacts) {
			if (c.getContactId().equals(contact.getContactId())) {
				contactExists = true;
			}
		}
		
		if (!contactExists) { // if contact does not exist
			contacts.add(contact); // add contact to list of contacts
			return true;
		} else {
			return false;
		}
	}
	
	// Delete contact
	public boolean deleteContact(String contactId) {
		// Check if contact exists
		for (Contact c : contacts) {
			if (c.getContactId().equals(contactId)) { // if contact exists
				contacts.remove(c); // remove the contact
				return true;
			}
		}
		return false;
	}
	
	// Update contact
	public boolean updateContact(String contactId, String firstName, String lastName, String phoneNumber, String address) {
		// Check if contact exists
		for (Contact c : contacts) {
			if (c.getContactId().equals(contactId)) { // if contact exists
				c.setFirstName(firstName); // set firstName
				c.setLastName(lastName); // set lastName
				c.setPhoneNumber(phoneNumber); // set phoneNumber
				c.setAddress(address); // set address
				// Note:  Error checking for the setters occurs in the setters
				return true;
			}
		}
		return false;
	}
}
