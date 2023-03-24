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

    private void removeContact() {
        String name = getUserInput("Enter the name of the contact to be removed:");

        Contact contact = PhoneBookController.findContact(name);
        if (contact == null) {
            JOptionPane.showMessageDialog(null, "Contact not found.");
            return;
        }

        PhoneBookController.removeContact(contact);
        JOptionPane.showMessageDialog(null, "Contact removed successfully.");
    }

    public String viewContactList(ArrayList<Contact> contactList){

        for (Contact contacts: contactList){
            System.out.println(contacts);
        }

        return " are in your contact list";

    }

    public void removeContact(Contact contact){
        contactList.remove(contact);
    }








    private String getUserInput(String message) {
        return JOptionPane.showInputDialog(null, message);
    }



}
