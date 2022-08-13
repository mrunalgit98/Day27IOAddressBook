import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Address{
    private static ArrayList<Contact> list = new ArrayList<Contact>();

    // Add contact details in AddressBookContact ::
    public void AddContactsDetails() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the First Name => ");
        String firstName = userInput.nextLine();
        System.out.println("Enter the Last Name => ");
        String lastName = userInput.nextLine();
        System.out.println("Enter the Address => ");
        String address = userInput.nextLine();
        System.out.println("Enter the City => ");
        String city = userInput.nextLine();
        System.out.println("Enter the State => ");
        String state = userInput.nextLine();
        System.out.println("Enter the Zip Code => ");
        int zip = userInput.nextInt();
        System.out.println("Enter the Phone Number => ");
        long phoneNumber = userInput.nextLong();
        System.out.println("Enter the Email => ");
        String email = userInput.nextLine();
        email = userInput.nextLine();
        Contact details = new Contact(firstName, lastName, address, city, state, zip, phoneNumber,
                email);
        list.add(details);
        details.display();
    }
    public void file(){

        try {
            FileWriter f=new FileWriter("address.txt");
            f.write("firstName");
            f.write("lastName");
            f.write("address");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    public static void main(String[] args) {
        Address a1=new Address();
        a1.AddContactsDetails();
a1.file();




    }
}
