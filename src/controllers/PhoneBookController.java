package controllers;

import appUsers.Contact;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PhoneBookController {

    public PhoneBookController(ArrayList<Contact> contact) {
        this.contactList = contact;
    }

    private ArrayList<Contact> contactList = new ArrayList<>();

    public void createContact(Contact contact){
        this.contactList.add(contact);
    }


    public String viewContactList(ArrayList<Contact> contactList){

        for (Contact contacts: contactList){
            System.out.println(contacts);
        }

        return " are in your contact list";

    }

    public Contact removeContact(ArrayList<Contact> contacts,String nameToRemove){
        String contactName = this.getUserInput("enter contact's name to remove it");

        for(Contact contact : contacts){
            if (contact.getName().equals(nameToRemove)){
                return contact;
            }
        }
        return null;
    }



    private String getUserInput(String message) {
        return JOptionPane.showInputDialog(null, message);
    }



}
