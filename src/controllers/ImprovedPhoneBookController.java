package controllers;

import appUsers.Contact;

import javax.swing.*;
import java.util.ArrayList;

public class ImprovedPhoneBookController {

    private ArrayList<Contact> contactList = new ArrayList<>();

    public void createContact(Contact contact){
        this.contactList.add(contact);
    }



    public void createContact(){
        String contactName = this.getUserInput("enter contact's name");
        String contactPhoneNo = this.getUserInput("enter contact's phone number");
        String contactEmail = null;

        String inputEmail = this.getUserInput("enter contact's email. enter 'skip' to skip");
        if (!inputEmail.equals("skip")){
            contactEmail = "none";
        }

        Contact newContact = new Contact(contactName, contactPhoneNo, contactEmail);
        contactList.add(newContact);

        JOptionPane.showMessageDialog(null,"New contact "+ contactName+" created!");

    }

    public void removeContact(){
        String name = String.valueOf(this.getUserInput("enter the contact's name"));
        this.displayMessage();
    }



    private String getUserInput(String message) {
        return JOptionPane.showInputDialog(null, message);
    }

    private void displayMessage(String message) {
        JOptionPane.showInputDialog(null, message);
    }








}
