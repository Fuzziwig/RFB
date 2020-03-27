package Controllers;

import Models.Employee;
import Service.EmployeeService;

import java.sql.SQLException;
import java.util.Scanner;


public class EmployeeController {

    EmployeeService es = new EmployeeService();

    public void createEmployee() throws SQLException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Medarbejdernummer: ");
        int employee_id = sc.nextInt();

        System.out.println("Fornavn på medarbejder: ");
        String employee_first_name = sc.nextLine();

        /*
        Skal måske bruge dette også - Son
        //Har sat en ekstra sc.nextLine() her da der en bug i java som gør den ellers
        //ville have spruget "Fornavn på barn" over.
        sc.nextLine();
        */

        System.out.println("Efternavn på medabejder: ");
        String employee_last_name = sc.nextLine();
        //child.setChildFirstName(firstName);

        System.out.println("Jobstilling: ");
        String employee_title = sc.nextLine();
        //child.setChildFirstName(lastName);

        System.out.println("Telefonnummer: ");
        String employee_phone_number = sc.nextLine();
        //Stue s;

        System.out.println("Email: ");
        String employee_email = sc.nextLine();

        System.out.println("Vagtplannummer: ");
        int workplan_id = sc.nextInt();

        System.out.println("Adresse: ");
        int address_id = sc.nextInt();

        Employee employee = new Employee(employee_id, employee_first_name, employee_last_name,employee_title, employee_phone_number, employee_email,workplan_id, address_id);
        es.createEmployee(employee);
    }

    public void readEmployee() throws SQLException {
        es.readEmployee();
    }

    public void updateEmployee() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nyt nummer på medarbejder: ");
        int employee_id = sc.nextInt();

        System.out.println("Fornavn på medarbejder: ");
        String employee_first_name = sc.nextLine();

        System.out.println("Efternavn på medabejder: ");
        String employee_last_name = sc.nextLine();
        //child.setChildFirstName(firstName);

        System.out.println("Jobstilling: ");
        String employee_title = sc.nextLine();
        //child.setChildFirstName(lastName);

        System.out.println("Telefonnummer: ");
        String employee_phone_number = sc.nextLine();
        //Stue s;

        System.out.println("Email: ");
        String employee_email = sc.nextLine();

        System.out.println("Vagtplannummer: ");
        int workplan_id = sc.nextInt();

        System.out.println("Adresse: ");
        int address_id = sc.nextInt();
        Employee employee = new Employee(employee_id, employee_first_name, employee_last_name,employee_title, employee_phone_number, employee_email,workplan_id, address_id);
        es.updateEmployee(employee);
    }
    public void deleteEmployee() throws SQLException {
        System.out.println("Hvilket medarbejder vil du gerne slette fra databasen? ");
        System.out.println("indtast medarbejdernummer på ansatte for at slette medarbejder");
        Scanner sc = new Scanner(System.in);
        int employee_id = sc.nextInt();
        System.out.println("Du har nu slettet medarbejder fra databasen");
        es.deleteEmployee(employee_id);
    }
}

//resultsets
//preparedstatement
