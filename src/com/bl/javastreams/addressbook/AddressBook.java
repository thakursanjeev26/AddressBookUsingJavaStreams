package com.bl.javastreams.addressbook;

import java.util.ArrayList;
import java.util.List;

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
}
