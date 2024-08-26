package contactManager;
import java.util.*;


public class ContactManager {

    public ArrayList<Contact> contacts;

    public ContactManager(){
        contacts = new ArrayList<>();
    }

    public void addContact(String name, String phoneNumber, String email){
        Contact contact = new Contact(name, phoneNumber, email);
        contacts.add(contact);
        System.out.println("Contact added successfully");
    }

    public void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            for (int i = 0; i < contacts.size(); i++) {
                Contact contact = contacts.get(i);
                System.out.println("Contact " + (i + 1) + ":");
                System.out.println("Name: " + contact.getName());
                System.out.println("Phone: " + contact.getPhoneNumber());
                System.out.println("Email: " + contact.getEmail());
                System.out.println();
            }
        }
    }


    public void updateContact(int index, String name, String phoneNumber, String email){
        if(index >= 0 && index < contacts.size()){
            Contact contact = contacts.get(index);
            contact.setName(name);
            contact.setPhoneNumber(phoneNumber);
            contact.setEmail(email);
            System.out.println("Contact update successfully.");
        }
        else{
            System.out.println("Invalid contact index.");
        }
    }

    public void deleteContact(int index){
        if (index >= 0 && index < contacts.size()){
            contacts.remove(index);
            System.out.println("Contact deleted successfully.");
        }else{
            System.out.println("Invalid contact index");
        }
    }



}
