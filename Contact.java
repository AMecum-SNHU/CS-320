
public class Contact {
	private static final byte CONTACT_ID_LENGTH = 10;
	private static final byte CONTACT_FIRSTNAME_LENGTH = 10;
	private static final byte CONTACT_LASTNAME_LENGTH = 10;
	private static final byte CONTACT_PHONENUMBER_LENGTH = 10;
	private static final byte CONTACT_ADDRESS_LENGTH = 30;
	private String contactId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	// Default new Contact
	Contact() {
		this.contactId = "new";
		this.firstName = "new";
		this.lastName = "new";
		this.phoneNumber = "new";
		this.address = "new";
	}
	
	// New Contact with user-defined contactId
	Contact(String contactId) {
		setContactId(contactId);
		this.firstName = "new";
		this.lastName = "new";
		this.phoneNumber = "new";
		this.address = "new";
	}
	
	// New Contact with user-defined input
	Contact(String contactId, String firstName, String lastName, String phoneNumber, String address) {
		setContactId(contactId);
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
		setAddress(address);
	}

	protected String getContactId() {
		return contactId;
	}

	protected String getFirstName() {
		return firstName;
	}

	protected String getLastName() {
		return lastName;
	}

	protected String getPhoneNumber() {
		return phoneNumber;
	}

	protected String getAddress() {
		return address;
	}

	protected void setContactId(String contactId) {
		if (contactId == null || contactId.equals("")) { // Check if contactId is null
			throw new IllegalArgumentException("Contact ID cannot be blank.");
		} else if (contactId.length() > CONTACT_ID_LENGTH) { // Check if contactId is greater than predetermined length
			throw new IllegalArgumentException("Contact ID cannot be longer than " + CONTACT_ID_LENGTH + " characters.");
		} else {
			this.contactId = contactId; // Set contactId
		}
	}

	protected void setFirstName(String firstName) {
		if (firstName == null || firstName.equals("")) { // Check if firstName is null
			throw new IllegalArgumentException("First name cannot be blank.");
		} else if (firstName.length() > CONTACT_FIRSTNAME_LENGTH) { // Check if firstName is greater than predetermined length
			throw new IllegalArgumentException("First name cannot be longer than " + CONTACT_FIRSTNAME_LENGTH + " characters.");
		} else {
			this.firstName = firstName; // Set firstName
		}
	}

	protected void setLastName(String lastName) {
		if (lastName == null || lastName.equals("")) { // Check if lastName is null
			throw new IllegalArgumentException("Last name cannot be blank.");
		} else if (lastName.length() > CONTACT_LASTNAME_LENGTH) { // Check if lastName is greater than predetermined length
			throw new IllegalArgumentException("Last name cannot be longer than " + CONTACT_LASTNAME_LENGTH + " characters.");
		} else {
			this.lastName = lastName; // Set lastName
		}
	}

	protected void setPhoneNumber(String phoneNumber) {
		if (phoneNumber == null || phoneNumber.equals("")) { // Check if phoneNumber is null
			throw new IllegalArgumentException("Phone number cannot be blank.");
		} else if (phoneNumber.length() != CONTACT_PHONENUMBER_LENGTH) { // Check if phoneNumber is not equal to predetermined length
			throw new IllegalArgumentException("Phone number must be " + CONTACT_PHONENUMBER_LENGTH + " characters.");
		} else if (!phoneNumber.matches("[0-9]+")) { // Check if phoneNumber is numeric
			throw new IllegalArgumentException("Phone number can only contain numbers.");
		} else {
			this.phoneNumber = phoneNumber; // Set phoneNumber
		}
	}

	protected void setAddress(String address) {
		if (address == null || address.equals("")) { // Check if address is null
			throw new IllegalArgumentException("Address cannot be blank.");
		} else if (address.length() > CONTACT_ADDRESS_LENGTH) { // Check if address is greater than predetermined length
			throw new IllegalArgumentException("Address cannot be longer than " + CONTACT_ADDRESS_LENGTH + " characters.");
		} else {
			this.address = address; // Set address
		}
	}
}
