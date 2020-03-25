package Controllers;

import Models.Child;
import Service.ChildService;

import java.sql.SQLException;
import java.util.Scanner;

public class Controller {

    ChildService cs = new ChildService();

    public void createChild() throws SQLException {
        //Models.Child child = new Models.Child();
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
        System.out.println("Hvilket bare vil du gerne slette fra databasen? ");
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