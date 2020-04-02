import java.sql.SQLException;
import java.util.Scanner;
import Controllers.ChildController;
import Controllers.EmployeeController;
import Controllers.ParentController;

public class Menu {

    //ChildController cc = new ChildController();
    //EmployeeController ec = new EmployeeController();
    //ParentController pc = new ParentController();
    //Login login = new Login();
    Scanner sc = new Scanner(System.in);
    int menu;
    int valg;
    int valg2;

    public void adminMenu() throws SQLException {
        System.out.println("Velkommen Sandra");
        System.out.println("1: Børn");
        System.out.println("2: Medarbejdere");
        System.out.println("3: Telefonliste");
        System.out.println("4: Log ud");
        menu = inputInt(1,4);

        switch (menu){
            case 1:
                ChildController cc = new ChildController();
                System.out.println("1: Indskriv nyt barn");
                System.out.println("2: Se liste over børn");
                System.out.println("3: Tilbage til hovedmenu");
                valg = inputInt(1,3);
                switch (valg){
                    case 1:
                        cc.createChild();
                        adminMenu();
                        break;
                    case 2:
                        cc.readChildren();

                        System.out.println("1: Opdater information om barn");
                        System.out.println("2: Se specifikt barn indtast cpr nr");
                        System.out.println("3: Slet barn");
                        System.out.println("4: Tilbage til hovedmenu");
                        valg2 = inputInt(1,4);
                        switch (valg2) {
                            case 1:
                                cc.updateChild();
                                break;
                            case 2:
                                cc.readOneChild();
                            case 3:
                                cc.deleteChild();
                                break;
                            case 4:
                                adminMenu();
                                break;
                        }
                        cc.readChildren();
                        break;
                    case 3:
                        adminMenu();
                }
                break;
            case 2:
                EmployeeController ec = new EmployeeController();
                System.out.println("1: Se liste over medarbejdere");
                System.out.println("2: Opret ny medarbejder");
                System.out.println("3: Vagtplan");
                valg = inputInt(1,3);
                switch (valg){
                    case 1:
                        ec.readEmployee();
                        System.out.println("1: Opdater information om medarbejder");
                        System.out.println("2: Slet medarbejder");
                        System.out.println("3: Tilbage til hovedmenu");
                        valg2=inputInt(1,3);
                        switch (valg2) {
                            case 1:
                                ec.updateEmployee();
                                break;
                            case 2:
                                ec.deleteEmployee();
                                break;
                            case 3:
                                adminMenu();
                                break;
                        }

                        break;
                    case 2:
                        ec.createEmployee();
                        adminMenu();
                        break;
                    case 3:
                        //vagtplan
                        break;
                }
                break;
            case 3:
                ParentController pc = new ParentController();
                pc.readParent();
                break;
            case 4:
                //return;
        }
    }
    public void employeeMenu()throws SQLException {
            System.out.println("Velkommen Medarbejder");
            System.out.println("1: Børn");
            System.out.println("2: Medarbejdere");
            System.out.println("3: Telefonliste");
            System.out.println("3: Log ud");
            menu = inputInt(1,4);

            switch (menu) {
                case 1:
            }
    }
    private int inputInt(int minValue, int maxValue) {
        int input = -1;
        while (input < minValue || input > maxValue) {
            //System.out.print("Indtast dit valg:\n");
            try {
                input = sc.nextInt();
            } catch (NumberFormatException ex) {
            }
            if (input < minValue || input > maxValue) {
                System.out.println("Ugyldigt input.\nIndtast et tal mellem " + minValue +" og " + maxValue + ".");
            }
        }
        return input;
    }
}
