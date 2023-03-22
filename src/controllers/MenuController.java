package controllers;


import appUsers.Contact;

import javax.swing.*;
import java.util.ArrayList;

public class MenuController {

    public MenuController() {
    }
    private ArrayList<Contact> contactList = new ArrayList<>();

    private PhoneBookController phoneBookController = new PhoneBookController(new ArrayList<Contact>());


    public void start() {
        JOptionPane.showConfirmDialog(null, "Hi! Please, choose" +
                "an action to perform");
        
        this.displayMainMenu();
    }
    
    private void displayMainMenu(){
        String option = this.getUserInput("enter an activity number to execute\n" +
                "1. Create a contact\n" +
                "2. Remove a contact\n" +
                "3. Find a contact\n"+
                "4. Update an existing contact\n"+
                "5. View all contacts\n"+
                "6. Export contact list (csv)\n"+
                "7. Import contact list (csv)\n"+
                "8. Close / Exit\n"
        );

        switch (option){
            case "1":
                this.handleContactCreation();
                break;
            case "2":
                this.handleRemoveContact(); //doesnt work
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                this.viewMyContactList(); //doesnt work???
                break;
            case "6":
                break;
            case "7":
                break;
            case "8":
                System.exit(0);

        }
        this.displayMainMenu();
       
    }

    private void handleContactCreation(){
        String contactName = this.getUserInput("enter contact's name");
        String contactPhoneNo = this.getUserInput("enter contact's phone number");
        String contactEmail = null;

        String inputEmail = this.getUserInput("enter contact's email. enter 'skip' to skip");
        if (!inputEmail.equals("skip")){
            contactEmail = "none";
        }

        Contact newContact = new Contact(contactName, contactPhoneNo, contactEmail);
        contactList.add(newContact);

        System.out.println("New contact "+ contactName+" created!");

    }

    private void handleRemoveContact(){
        phoneBookController.removeContact(null, null);

    }

    private void viewMyContactList(){
        try {
            this.displayMessage(this.phoneBookController.viewContactList(contactList));
        }catch (Exception e){
            this.displayMessage("contact not found");
        }

    }

    private String getUserInput(String message) {
        return JOptionPane.showInputDialog(null, message);
    }

    private void displayMessage(String message) {
        JOptionPane.showInputDialog(null, message);
    }




}
