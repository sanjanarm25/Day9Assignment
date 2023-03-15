package com.bridgelabz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AddressBookSystem {

    static class Contact {
        private String firstName;
        private String lastName;
        private String address;
        private String city;
        private String state;
        private int zip;
        private String phoneNumber;
        private String email;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public int getZip() {
            return zip;
        }

        public void setZip(int zip) {
            this.zip = zip;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            List<Contact> contacts = new ArrayList<>();


            Contact contact = new Contact();


            System.out.println("Enter First Name:");
            String firstName = scanner.nextLine();
            contact.setFirstName(firstName);

            System.out.println("Enter Last Name:");
            String lastName = scanner.nextLine();
            contact.setLastName(lastName);

            System.out.println("Enter Address:");
            String address = scanner.nextLine();
            contact.setAddress(address);

            System.out.println("Enter City:");
            String city = scanner.nextLine();
            contact.setCity(city);

            System.out.println("Enter State:");
            String state = scanner.nextLine();
            contact.setState(state);

            System.out.println("Enter Zip Code:");
            int zip = scanner.nextInt();
            contact.setZip(zip);

            scanner.nextLine(); // clear buffer

            System.out.println("Enter Phone Number:");
            String phoneNumber = scanner.nextLine();
            contact.setPhoneNumber(phoneNumber);

            System.out.println("Enter Email:");
            String email = scanner.nextLine();
            contact.setEmail(email);

            System.out.println("Contact created successfully:");
            System.out.println("First Name: " + contact.getFirstName());
            System.out.println("Last Name: " + contact.getLastName());
            System.out.println("Address: " + contact.getAddress());
            System.out.println("City: " + contact.getCity());
            System.out.println("State: " + contact.getState());
            System.out.println("Zip Code: " + contact.getZip());
            System.out.println("Phone Number: " + contact.getPhoneNumber());
            System.out.println("Email: " + contact.getEmail());

            contacts.add(contact);

            System.out.println("\nEnter First Name to edit:");
            String editFirstName = scanner.nextLine();

            System.out.println("Enter Last Name to edit:");
            String editLastName = scanner.nextLine();

            if (contact.getFirstName().equals(editFirstName) && contact.getLastName().equals(editLastName)) {
                System.out.println("\nEnter updated Address:");
                String updatedAddress = scanner.nextLine();
                contact.setAddress(updatedAddress);

                System.out.println("Enter updated City:");
                String updatedCity = scanner.nextLine();
                contact.setCity(updatedCity);

                System.out.println("Enter updated State:");
                String updatedState = scanner.nextLine();
                contact.setState(updatedState);

                System.out.println("Enter updated Zip Code:");
                int updatedZip = scanner.nextInt();
                contact.setZip(updatedZip);

                scanner.nextLine(); // clear buffer

                System.out.println("Enter updated Phone Number:");
                String updatedPhoneNumber = scanner.nextLine();
                contact.setPhoneNumber(updatedPhoneNumber);

                System.out.println("Enter updated Email:");
                String updatedEmail = scanner.nextLine();
                contact.setEmail(updatedEmail);

                System.out.println("Contact updated successfully:");
                System.out.println("First Name: " + contact.getFirstName());
                System.out.println("Last Name: " + contact.getLastName());
                System.out.println("Address: " + contact.getAddress());
                System.out.println("City: " + contact.getCity());
                System.out.println("State: " + contact.getState());
                System.out.println("Zip Code: " + contact.getZip());
                System.out.println("Phone Number: " + contact.getPhoneNumber());
                System.out.println("Email: " + contact.getEmail());
            } else {
                System.out.println("Contact not found");
            }

            // code for deleting a contact
            System.out.println("\nEnter First Name to delete:");
            String deleteFirstName = scanner.nextLine();

            System.out.println("Enter Last Name to delete:");
            String deleteLastName = scanner.nextLine();

            Iterator<Contact> iterator = contacts.iterator();
            while (iterator.hasNext()) {
                Contact c = iterator.next();
                if (c.getFirstName().equals(deleteFirstName) && c.getLastName().equals(deleteLastName)) {
                    iterator.remove();
                    System.out.println("Contact deleted successfully");
                    break;
                }
            }
        }


}
