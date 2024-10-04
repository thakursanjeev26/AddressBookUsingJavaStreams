package com.bl.javastreams.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    private List<Contact>contactList;

    public AddressBook(){
        contactList=new ArrayList<>();
    }

    public void addContact(Contact contact){
        contactList.add(contact);
        System.out.println("Contact added successfully");
    }

    public void displayContacts(){
        if(contactList.isEmpty()){
            System.out.println("\"No contacts in Address Book.\"");
        }
        else {
            for (Contact contact:contactList){
                System.out.println(contact);
            }
        }



    }

    public void editContactByName(String firstName,String lastName){
        Scanner sc = new Scanner(System.in);
        boolean contactFound=false;

        for (Contact contact:contactList){
            if (contact.getFirstName().equalsIgnoreCase(firstName)&&contact.getLastName().equalsIgnoreCase(lastName)){
                contactFound=true;
                // Display the existing contact details
                System.out.println("Contact Found: " + contact);

                // Prompt user for new details
                System.out.println("Enter new Address:");
                contact.setAddress(sc.nextLine());

                System.out.println("Enter new City:");
                contact.setCity(sc.nextLine());

                System.out.println("Enter new State:");
                contact.setState(sc.nextLine());

                System.out.println("Enter new Zip Code:");
                contact.setZip(sc.nextLine());

                System.out.println("Enter new Phone Number:");
                contact.setPhoneNumber(sc.nextLine());

                System.out.println("Enter new Email:");
                contact.setEmail(sc.nextLine());

                System.out.println("Contact updated successfully!");
                break;

            }
        }
        if (!contactFound){
            System.out.println("Contact Not Found");
        }

    }

}
