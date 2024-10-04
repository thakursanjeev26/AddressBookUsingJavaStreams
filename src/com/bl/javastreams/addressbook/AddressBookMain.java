package com.bl.javastreams.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        System.out.println("Welcome to Address Book program");

        boolean exit=false;

        while (!exit) {
            System.out.println("1. Add New Contact");
            System.out.println("2. Display All Contacts");
            System.out.println("3. Edit Existing Contact");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Taking input for contact details
                    System.out.println("Enter First Name:");
                    String firstName = sc.nextLine();

                    System.out.println("Enter Last Name:");
                    String lastName = sc.nextLine();

                    System.out.println("Enter Address:");
                    String address = sc.nextLine();

                    System.out.println("Enter City:");
                    String city = sc.nextLine();

                    System.out.println("Enter State:");
                    String state = sc.nextLine();

                    System.out.println("Enter Zip Code:");
                    String zip = sc.nextLine();

                    System.out.println("Enter Phone Number:");
                    String phoneNumber = sc.nextLine();

                    System.out.println("Enter Email:");
                    String email = sc.nextLine();

                    // Create a new Contact object
                    Contact contact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);

                    // Add the contact to Address Book
                    addressBook.addContact(contact);
                    break;

                case 2:
                    // Display all contacts
                    addressBook.displayContacts();
                    break;
                case 3:
                    // Edit an existing contact
                    System.out.println("Enter the First Name of the contact to edit:");
                    String editFirstName = sc.nextLine();

                    System.out.println("Enter the Last Name of the contact to edit:");
                    String editLastName = sc.nextLine();

                    // Call editContactByName method
                    addressBook.editContactByName(editFirstName, editLastName);
                    break;
                case 4:
                    // Exit the program
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }

        sc.close();


    }
}
