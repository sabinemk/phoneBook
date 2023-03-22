import controllers.MenuController;

public class Main {
    public static void main(String[] args) {
        MenuController menu = new MenuController();

        menu.start();


    }
}

/**
 *Make a phonebook application,
 *
 *     users should be able to add different people to the phonebook (name, phone number, email (optional)).
 *     Users should be able to remove contacts
 *     Find different contacts by name, phone number
 *     Find different contacts by part of name of contact or part of phone number,
 *     Users should be able to update contact.
 *     Users should be able to see all contacts.
 *
 * Bonus tasks
 *
 *     Users should be able to export the contacts to .csv fomat
 *     Users should be able to import existing contacts from .csv files
 *
 * A menu could be added to make things easier for users to use the app
 * Storing the contacts to file or database is highly recommendedIf your contacts will be in memory,
 * then possibility to import existing contacts from csv and export updated contacts back to csv should be considered. Upload your work to github
 **/