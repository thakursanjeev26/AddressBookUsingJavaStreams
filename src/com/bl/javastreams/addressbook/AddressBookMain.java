package com.bl.javastreams.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Address Book program");

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

        // Creating contact object
        Contact contact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);

        // Displaying the contact details
        System.out.println("Contact Added: " + contact);
    }
}
