package com.bridgelabz;

public class AddressBookSystem {

    static class Contact {
        private String firstName;
        private String lastName;
        private String address;
        private String city;
        private String state;
        private String zip;
        private String phoneNumber;
        private String email;

        public Contact(String firstName, String lastName, String address, String city, String state, String zip, String phoneNumber, String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.city = city;
            this.state = state;
            this.zip = zip;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        // Getter methods for the Contact fields
        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getAddress() {
            return address;
        }

        public String getCity() {
            return city;
        }

        public String getState() {
            return state;
        }

        public String getZip() {
            return zip;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public String getEmail() {
            return email;
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program in AddressBook");
        Contact contact1 = new Contact("Prasanjya", "Sen", "123 Main Street", "Pune", "Maharashtra", "12345", "555-555-1234", "abxd@gmail.com");

        // Display the contact details
        System.out.println("Contact Details:");
        System.out.println("Name: " + contact1.getFirstName() + " " + contact1.getLastName());
        System.out.println("Address: " + contact1.getAddress());
        System.out.println("City: " + contact1.getCity());
        System.out.println("State: " + contact1.getState());
        System.out.println("Zip: " + contact1.getZip());
        System.out.println("Phone Number: " + contact1.getPhoneNumber());
        System.out.println("Email: " + contact1.getEmail());

    }

}
