package Contact;
import java.util.ArrayList;

public class ContactService {

    // Create list to store contacts
    public ArrayList<Contact> contactList = new ArrayList<Contact>();

    // Print contact information for verification
    public void printContacts() {
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println("\t Contact ID: " + contactList.get(i).getContactId());
            System.out.println("\t First Name: " + contactList.get(i).getFirstName());
            System.out.println("\t Last Name: " + contactList.get(i).getLastName());
            System.out.println("\t Phone Number: " + contactList.get(i).getPhoneNumber());
            System.out.println("\t Address: " + contactList.get(i).getAddress() + "\n");
        }
    }

    // Add contact to the list
    public void addContact(String firstName,
                           String lastName,
                           String phoneNumber,
                           String address) {
        // Create a new contact
        Contact contact = new Contact(firstName, lastName, phoneNumber, address);
        contactList.add(contact);
    }

    // Returns contact object if available, otherwise return object with null values
    public Contact getContact(String contactId) {
        Contact contact = new Contact(null, null, null, null);
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getContactId().contentEquals(contactId)) {
                contact = contactList.get(i);
            }
        }
        return contact;
    }

    // Delete contact if found from the list, otherwise return error message
    public void deleteContact(String contactId) {
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getContactId().equals(contactId)) {
                contactList.remove(i);
                break;
            }
            if (i == contactList.size() - 1) {
                System.out.println("Error: Contact ID " + contactId + " not found.");
            }
        }
    }

    // Updates the first name of a given contact
    public void updateFirstName(String newFirstName, String contactId) {
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getContactId().equals(contactId)) {
                contactList.get(i).setFirstName(newFirstName);
                break;
            }
            if (i == contactList.size() - 1) {
                System.out.println("Error: Contact ID " + contactId + " not found.");
            }
        }
    }

    // Updates the last name of a given contact
    public void updateLastName(String newLastName, String contactId) {
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getContactId().equals(contactId)) {
                contactList.get(i).setLastName(newLastName);
                break;
            }
            if (i == contactList.size() - 1) {
                System.out.println("Error: Contact ID " + contactId + " not found.");
            }
        }
    }

    // Updates the phone number of a given contact
    public void updatePhoneNumber(String newPhoneNumber, String contactId) {
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getContactId().equals(contactId)) {
                contactList.get(i).setPhoneNumber(newPhoneNumber);
                break;
            }
            if (i == contactList.size() - 1) {
                System.out.println("Error: Contact ID " + contactId + " not found.");
            }
        }
    }

    // Updates the address of a given contact
    public void updateAddress(String newAddress, String contactId) {
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getContactId().equals(contactId)) {
                contactList.get(i).setAddress(newAddress);
                break;
            }
            if (i == contactList.size() - 1) {
                System.out.println("Error: Contact ID " + contactId + " not found.");
            }
        }
    }

}