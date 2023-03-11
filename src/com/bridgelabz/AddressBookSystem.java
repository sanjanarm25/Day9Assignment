package com.bridgelabz;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookSystem {

    static class Contact {
        String firstName;
        String lastName;
        String address;
        String city;
        String state;
        String zip;
        String phoneNumber;
        String email;

        Contact(String firstName, String lastName, String address, String city, String state, String zip, String phoneNumber, String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.city = city;
            this.state = state;
            this.zip = zip;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        public String toString() {
            return "Name: " + firstName + " " + lastName + "\n" +
                    "Address: " + address + "\n" +
                    "City: " + city + "\n" +
                    "State: " + state + "\n" +
                    "Zip: " + zip + "\n" +
                    "Phone Number: " + phoneNumber + "\n" +
                    "Email: " + email;
        }
    }

    static class AddressBook {
        String name;
        List<Contact> contacts;

        AddressBook(String name) {
            this.name = name;
            contacts = new ArrayList<>();
        }

        void addContact(Contact contact) {
            contacts.add(contact);
        }

        void displayContacts() {
            for (Contact contact : contacts) {
                System.out.println(contact);
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Address Book Program in AddressBook");

        // Create a new address book
        AddressBook addressBook = new AddressBook("My Address Book");

        // Add a new contact
        System.out.println("Add a new contact:");
        System.out.print("First name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("City: ");
        String city = scanner.nextLine();
        System.out.print("State: ");
        String state = scanner.nextLine();
        System.out.print("Zip: ");
        String zip = scanner.nextLine();
        System.out.print("Phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        Contact newContact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
        addressBook.addContact(newContact);
        System.out.println("Contact added successfully!");

        // Display all contacts in the address book
        System.out.println("All Contacts:");
        addressBook.displayContacts();
    }

}
