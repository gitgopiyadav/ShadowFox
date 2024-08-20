import contactManager.ContactManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ContactManager manager = new ContactManager();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit){
            System.out.println("\nContact Management System");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contact");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");

            System.out.println("Choose an option");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){

                case 1:
                    System.out.print("Enter your Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter your PhoneNumber: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter your Email: ");
                    String email = scanner.nextLine();
                    manager.addContact(name, phoneNumber, email);
                    break;

                case 2:
                    manager.viewContacts();
                    break;

                case 3:
                    System.out.print("Enter contact index to update: ");
                    int updateIndex = scanner.nextInt() - 1;
                    scanner.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new PhoneNumber:" );
                    String newPhoneNumber = scanner.nextLine();
                    System.out.print("Enter new Email: ");
                    String newEmail = scanner.nextLine();
                    manager.updateContact(updateIndex, newName, newPhoneNumber, newEmail);
                    break;

                case 4:
                    System.out.print("Enter contact index to delete: ");
                    int deleteIndex = scanner.nextInt() - 1;
                    scanner.nextLine();
                    manager.deleteContact(deleteIndex);
                    break;

                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again. ");
            }

        }
        scanner.close();

    }
}