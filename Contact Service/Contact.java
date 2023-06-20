package Contact;

import java.util.concurrent.atomic.AtomicLong;

public class Contact {

    // Class variables
    private final String contactId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;
    private static AtomicLong idGenerator = new AtomicLong();

    // Creating an object of the Contact class
    public Contact(String firstName,
                   String lastName,
                   String phoneNumber,
                   String address) {

        // Setting contactId as an unchangeable variable
        this.contactId = String.valueOf(idGenerator.getAndIncrement());

        // Checking firstName against requirements
        if (firstName == null || firstName.isEmpty()) {
            this.firstName = "null";
        } else if (firstName.length() > 10) {
            // Obtain the first 10 characters of a longer first name
            this.firstName = firstName.substring(0, 10);
        } else {
            // Set first name
            this.firstName = firstName;
        }

        // Checking lastName against requirements
        if (lastName == null || lastName.isEmpty()) {
            this.lastName = "null";
        } else if (lastName.length() > 10) {
            // Obtain the first 10 characters of a longer last name
            this.lastName = lastName.substring(0, 10);
        } else {
            // Set last name
            this.lastName = lastName;
        }

        // Checking phone number against requirements
        if (phoneNumber == null || phoneNumber.isEmpty() || phoneNumber.length() != 10) {
            this.phoneNumber = "1234567890";
        } else {
            // Set phone number
            this.phoneNumber = phoneNumber;
        }

        // Checking address against requirements
        if (address == null || address.isEmpty()) {
            this.address = "null";
        } else if (address.length() > 30) {
            // Obtain the first 30 characters of a longer address
            this.address = address.substring(0, 30);
        } else {
            // Set address
            this.address = address;
        }

    }


    // GETTERS ---------------------------------------------------------------------------------------------------------

    // Contact ID getter
    public String getContactId() {
        return contactId;
    }

    // First name getter
    public String getFirstName() {
        return firstName;
    }

    // Last name getter
    public String getLastName() {
        return lastName;
    }

    // Phone getter
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Address getter
    public String getAddress() {
        return address;
    }


    // SETTERS ---------------------------------------------------------------------------------------------------------

    // First name setter
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Last name setter
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Phone setter
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Address setter
    public void setAddress(String address) {
        this.address = address;
    }
}
