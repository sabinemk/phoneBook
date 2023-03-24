package controllers;

import appUsers.Contact;

import javax.swing.*;
import java.util.ArrayList;

public class ImprovedMenuController {

    private ImprovedMenuController improvedMenuController = new ImprovedMenuController();

    private ArrayList<Contact> contactList = new ArrayList<>();
    public void start() {
        JOptionPane.showConfirmDialog(null, "Hi! Please, choose" +
                "an action to perform");

        this.displayMainMenu();
    }

    private void displayMainMenu() {
        String option = this.getUserInput("enter an activity number to execute\n" +
                "1. Create a contact\n" +
                "2. Remove a contact\n" +
                "3. Find a contact\n" +
                "4. Update an existing contact\n" +
                "5. View all contacts\n" +
                "6. Export contact list (csv)\n" +
                "7. Import contact list (csv)\n" +
                "8. Close / Exit\n"
        );

        switch (option){
            case "1":
                this.handleContactCreation();
                break;
            case "2":
                //this.handleRemoveContact(); //
                break;
            case "3":
                //this.handleFindingContact();//partial match?
                break;
            case "4":
                // this.updateContact //failed
                break;
            case "5":
                //this.viewMyContactList(); //not complete
                break;
            case "6":
                //export contact
                break;
            case "7":
                //import contacts
                break;
            case "8":
                System.exit(0);
            default:
                System.out.println("please enter a valid menu option");

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




    private String getUserInput(String message) {
        return JOptionPane.showInputDialog(null, message);
    }

    private void displayMessage(String message) {
        JOptionPane.showInputDialog(null, message);
    }

}
