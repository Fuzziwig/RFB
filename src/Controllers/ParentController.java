package Controllers;

import Models.Parent;
import Service.ParentService;

import java.sql.SQLException;
import java.util.Scanner;

public class ParentController {

    ParentService ps = new ParentService();
    UserController uc = new UserController();


    public void createParent() throws SQLException {
        //Models.Child child = new Models.Child();
        Scanner sc = new Scanner(System.in);

        System.out.print("ID nr på forældre: ");
        int parent_id = sc.nextInt();
        //for den ikke springer fornavn over bug i java
        sc.nextLine();

        //System.out.println("Fornavn på Forældre: ");
        // String parent_first_name = sc.nextLine();
        String parent_first_name = uc.readName("Fornavn på forældre: ", "Indtast et gyldigt navn med bogstaver", 45);


        // System.out.println("Efternavn på Forældre: ");
        //String parent_last_name = sc.nextLine();
        String parent_last_name = uc.readName("Efternavn på forældre: ", "Indtast et gyldigt navn med bogstaver", 45);


        //System.out.println("PhoneNummer for Forældre: ");
        //String parent_phone_number = sc.nextLine();
        String parent_phone_number = uc.readPhoneNumber("Telefonnummer", "Intast venligst 8 cifret nummer");



        //System.out.println("Email:");
        //String parent_email= sc.nextLine();
        String parent_email = uc.readEmail("Email for forældre","Intast en gyldig mail", 40);


        System.out.println("Address id på forældre: ");
        int adress_id = sc.nextInt();

        Parent parent = new Parent(parent_id,parent_first_name,parent_last_name,parent_phone_number,parent_email,adress_id);
        ps.createParent(parent);
    }

    public void readParent ()throws SQLException {
        ps.readParent();
    }


    public void updateParent() throws SQLException{
        Scanner sc = new Scanner(System.in);


        System.out.print("ID nr på forældre: ");
        int parent_id = sc.nextInt();
        sc.nextLine();

        //System.out.println("Fornavn på Forældre: ");
        //String parent_first_name = sc.nextLine();
        String parent_first_name = uc.readName("Ændre på forældrenavn:","Indtast et gyldigt navn med bogstaver",45);


        //System.out.println("Efternavn på Forældre: ");
        //String parent_last_name = sc.nextLine();
        String parent_last_name = uc.readName("Ændre på forældre efternavt:","Indtast et gyldigt navn med bogstaver",45);


        System.out.println("Ændre på phoneNummer for Forældre: ");
        String parent_phone_number = sc.nextLine();

        //System.out.println("Email:");
        //String parent_email= sc.nextLine();
        String parent_email= uc.readEmail("Email på forældre:","Indtast et gyldigt mail ",45);


        System.out.println("Address id på forældre: ");
        int address_id = sc.nextInt();

        Parent parent = new Parent(parent_id,parent_first_name,parent_last_name,parent_phone_number,parent_email,address_id);
        ps.updateParent(parent);
    }
    public void deleteParent() throws SQLException {
        System.out.println("Hvilken forældre vil du gerne slette fra databasen? ");
        System.out.println("indtast parent_id nr på forældre for at slette det forældre");
        Scanner sc = new Scanner(System.in);
        int parent_id = sc.nextInt();
        System.out.println("Du har nu slettet forældre fra databasen");
        ps.deleteParent(parent_id);

    }

}
