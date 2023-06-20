package Test;
import Contact.Contact;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

public class ContactTest {

    // Tests contact ID length
    @Test
    @DisplayName("The contact ID cannot exceed 10 characters.")
    void testContactIdLength() {
        Contact contact = new Contact("firstName", "lastName", "0000000000", "address");
        if (contact.getContactId().length() > 10) {
            fail("Error: Contact ID exceeds 10 characters.");
        }
    }

    // Tests first name length
    @Test
    @DisplayName("The first name cannot exceed 10 characters.")
    void testFirstNameLength() {
        Contact contact = new Contact("JardaniBabaYaga", "lastName", "0000000000", "address");
        if (contact.getFirstName().length() > 10) {
            fail("Error: First name exceeds 10 characters.");
        }
    }

    // Tests last name length
    @Test
    @DisplayName("The last name cannot exceed 10 characters.")
    void testLastNameLength() {
        Contact contact = new Contact("firstName", "BabaYagaJovonovich", "0000000000", "address");
        if (contact.getLastName().length() > 10) {
            fail("Error: Last name exceeds 10 characters.");
        }
    }

    // Tests phone number length
    @Test
    @DisplayName("The phone number cannot be more or less than 10 characters.")
    void testPhoneNumberLength() {
        Contact contact = new Contact("firstName", "lastName", "00000000001", "address");
        if (contact.getPhoneNumber().length() != 10) {
            fail("Error: Phone number is not 10 characters long.");
        }
    }

    // Tests address length
    @Test
    @DisplayName("The address cannot exceed 30 characters.")
    void testAddressLength() {
        Contact contact = new Contact("firstName", "lastName", "0000000000",
                "1234567890 abcdefg 1234567890" + "1234567890 abcdefg 1234567890");
        if (contact.getAddress().length() > 30) {
            fail("Error: Address exceeds 30 characters.");
        }
    }

    // Tests null first name
    @Test
    @DisplayName("First name cannot be null.")
    void testFirstNameNull() {
        Contact contact = new Contact(null, "lastName", "0000000000", "address");
        assertNotNull(contact.getFirstName(), "First name is null.");
    }

    // Tests null last name
    @Test
    @DisplayName("Last name cannot be null")
    void testLastNameNull() {
        Contact contact = new Contact("firstName", null, "0000000000", "address");
        assertNotNull(contact.getLastName(), "Last name is null.");
    }

    // Tests null phone number
    @Test
    @DisplayName("Phone number cannot be null.")
    void testPhoneNumberNull() {
        Contact contact = new Contact("firstName", "lastName", null, "address");
        assertNotNull(contact.getPhoneNumber(), "Phone number is null.");
    }

    // Tests null address
    @Test
    @DisplayName("Address cannot be null")
    void testAddressNull() {
        Contact contact = new Contact("firstName", "lastName", "0000000000", null);
        assertNotNull(contact.getAddress(), "Address is null.");
    }

}
