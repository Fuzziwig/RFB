package Controllers;

import Models.Child;
import Service.ChildService;


import java.sql.Date;
import java.sql.SQLException;
import java.util.Scanner;


public class ChildController {

    enum Stue {
        RØD, BLÅ, VENTELISTE
    }

    ChildService cs = new ChildService();
    UserController uc = new UserController();

    public void createChild() throws SQLException {
        //Models.Child child = new Models.Child();
        Scanner sc = new Scanner(System.in);

        //System.out.println("CPR nr på barn: ");
        //int cprNr = sc.nextInt();
        int cprNr = uc.readCPR("CPR nr på barn: ", "Indtast et gyldigt CPR nr (format : 2312182525)");

        //System.out.println("Datoen for indskrivelse af barn: ");
        //int dateOfEntry = sc.nextInt();
        int dateOfEntry = 0; //placeholder til vi får Dateformat sat op i database
        java.sql.Date dateOfEntry2 = uc.readDate("Datoen for indskrivelse af barn: ", "Indtast en gyldig dato (format : 29/02/2012)");
        //Har sat en ekstra sc.nextLine() her da der en bug i java som gør den ellers
        //ville have spruget "Fornavn på barn" over.
        //sc.nextLine();


        //System.out.println("Fornavn på barn: ");
        //String firstName = sc.nextLine();
        //child.setChildFirstName(firstName);
        String firstName = uc.readName("Fornavn på barn: ", "Indtast et gyldigt navn med bogstaver", 45);


        //System.out.println("Efternavn på barn: ");
        //String lastName = sc.nextLine();
        //child.setChildFirstName(lastName);
        String lastName = uc.readName("Efternavn på barn: ", "Indtast et gyldigt navn med bogstaver", 45);

        String location= uc.readLocation("Stue på barn, tast r for Rød, b for blå eller v for venteliste:", "Indtast et gyldigt bogstav");
/*
        System.out.println("Stue på barn, tast r for Rød, b for blå eller v for venteliste:");
        String location= "";
        //Stue s;

       String valg = sc.nextLine();
        switch (valg) {
            case "r":
              //  s = Stue.RØD;
                location = "RØD STUE";
                break;
            case "b":
             //   s = Stue.BLÅ;

                location = "BLÅ STUE";
                break;
            case "v":
            //    s = Stue.VENTELISTE;
                location = "VENTELISTE";
                break;
        }*/
        //String valg
        String info = uc.readText("Ekstra info om barnet: ", 255);
        //System.out.println("Ekstra info på barnet: ");
        //String info = sc.nextLine();
        Child child = new Child(cprNr,dateOfEntry,firstName,lastName,location,info);
        cs.createChild(child);
    }

    public void readChildren() throws SQLException {
        cs.readChildren();
    }

    public void updateChild() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("CPR nr på barn: ");
        int cprNr = sc.nextInt();

        System.out.println("Datoen for indskrivelse af barn: ");
        int dateOfEntry = sc.nextInt();
        //Har sat en ekstra sc.nextLine() her da der en bug i java som gør den ellers
        //ville have spruget "Fornavn på barn" over.
        sc.nextLine();

        System.out.println("Fornavn på barn: ");
        String firstName = sc.nextLine();
        //child.setChildFirstName(firstName);

        System.out.println("Efternavn på barn");
        String lastName = sc.nextLine();
        //child.setChildFirstName(lastName);

        System.out.println("Stue på barn");
        String location = sc.nextLine();
        //child.setChildFirstName(location);

        System.out.println("Ekstra info på barnet: ");
        String info = sc.nextLine();
        Child child = new Child(cprNr,dateOfEntry,firstName,lastName,location,info);
        cs.updateChild(child);
    }

    public void deleteChild() throws SQLException {
        System.out.println("Hvilket barn vil du gerne slette fra databasen? ");
        System.out.println("indtast cpr nr på barn for at slette det barn");
        Scanner sc = new Scanner(System.in);
        int cprNrID = sc.nextInt();
        System.out.println("Du har nu slettet barnet fra databasen");
        cs.deleteChild(cprNrID);
    }
}

/*
    Lagde kun den sidste value ind i db som var location, som kom til at ligge på childFirstName i db;
    Derfor lavede jeg en nye contructer med de input som skulle ligges ind.
    public void createChild() throws SQLException {
        Models.Child child = new Models.Child();
        Scanner sc = new Scanner(System.in);

        System.out.println("Fornavn på barn: ");
        String firstName = sc.nextLine();
        child.setChildFirstName(firstName);

        System.out.println("Efternavn på barn");
        String lastName = sc.nextLine();
        child.setChildFirstName(lastName);

        System.out.println("Fødselsdag på barn");
        String birth = sc.nextLine();
        child.setChildFirstName(birth);

        System.out.println("Stue på barn");
        String location = sc.nextLine();
        child.setChildFirstName(location);

        cs.createChild(child);
    }
*/