package Test;
import Contact.Contact;
import Contact.ContactService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import java.util.ArrayList;


@TestMethodOrder(OrderAnnotation.class)
public class ContactServiceTest {

    // Tests the updateFirstName function
    @Test
    @DisplayName("This tests the first name update feature.")
    @Order(1)
    void testUpdateFirstName() {
        ContactService service = new ContactService();
        service.addContact("John", "Wick", "3105648005", "82 Beaver St New York NY 10005");
        service.updateFirstName("Jardani", "0");
        service.printContacts();
        assertEquals("Jardani", service.getContact("0").getFirstName(), "Unable to update first name.");
    }

    // Tests the first name requirements
    @Test
    @DisplayName("The first name cannot exceed 10 characters.")
    @Order(2)
    void testFirstNameLength() {
        Contact contact = new Contact("JardaniBabaYaga", "lastName", "0000000000", "address");
        if (contact.getFirstName().length() > 10) {
            fail("Error: First name exceeds 10 characters.");
        }
    }

    // Tests the updateLastName function
    @Test
    @DisplayName("This tests the last name update feature.")
    @Order(3)
    void testUpdateLastName() {
        ContactService service = new ContactService();
        service.addContact("John", "Wick", "3105648005", "82 Beaver St New York NY 10005");
        service.updateLastName("Jovonovich", "3");
        service.printContacts();
        assertEquals("Jovonovich", service.getContact("3").getLastName(), "Unable to update last name.");
    }

    // Tests the last name requirements
    @Test
    @DisplayName("The last name cannot exceed 10 characters.")
    @Order(4)
    void testLastNameLength() {
        Contact contact = new Contact("firstName", "BabaYagaJovonovich", "0000000000", "address");
        if (contact.getLastName().length() > 10) {
            fail("Error: Last name exceeds 10 characters.");
        }
    }

    // Tests the updatePhoneNumber function
    @Test
    @DisplayName("This tests the phone number update feature.")
    @Order(5)
    void testUpdatePhoneNumber() {
        ContactService service = new ContactService();
        service.addContact("John", "Wick", "3105648005", "82 Beaver St New York NY 10005");
        service.updatePhoneNumber("2128810000", "6");
        service.printContacts();
        assertEquals("2128810000", service.getContact("6").getPhoneNumber(), "Unable to update phone number.");
    }

    // Tests the phone number requirements
    @Test
    @DisplayName("The phone number cannot be more or less than 10 characters.")
    @Order(6)
    void testPhoneNumberLength() {
        Contact contact = new Contact("firstName", "lastName", "00000000001", "address");
        if (contact.getPhoneNumber().length() != 10) {
            fail("Error: Phone number is not 10 characters long.");
        }
    }

    // Tests the updateAddress function
    @Test
    @DisplayName("This tests the address update feature.")
    @Order(7)
    void testUpdateAddress() {
        ContactService service = new ContactService();
        service.addContact("John", "Wick", "3105648005", "82 Beaver St New York NY 10005");
        service.updateAddress("4140 Broadway NYC 10033", "9");
        service.printContacts();
        assertEquals("4140 Broadway NYC 10033", service.getContact("9").getAddress(), "Unable to update address.");
    }

    // Tests the address requirements
    @Test
    @DisplayName("The address cannot exceed 30 characters.")
    @Order(8)
    void testAddressLength() {
        Contact contact = new Contact("firstName", "lastName", "0000000000",
                "1234567890 abcdefg 1234567890" + "1234567890 abcdefg 1234567890");
        if (contact.getAddress().length() > 30) {
            fail("Error: Address exceeds 30 characters.");
        }
    }

    // Tests the addContact function
    @Test
    @DisplayName("This tests the add contact feature.")
    @Order(9)
    void testAddContact() {
        ContactService service = new ContactService();
        service.addContact("John", "Wick", "3105648005", "82 Beaver St New York NY 10005");
        service.printContacts();
        assertNotNull(service.getContact("0"), "Unable to add contact.");
    }

    // Tests the deleteContact function
    @Test
    @DisplayName("This tests the delete contact feature.")
    @Order(10)
    void testDeleteContact() {
        ContactService service = new ContactService();
        service.addContact("John", "Wick", "3105648005", "82 Beaver St New York NY 10005");
        service.deleteContact("14");
        ArrayList<Contact> emptyContactList = new ArrayList<Contact>();
        service.printContacts();
        assertEquals(service.contactList, emptyContactList, "Unable to delete contact.");
    }

}
