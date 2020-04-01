import Controllers.ChildController;
import Controllers.EmployeeController;
import Controllers.ParentController;
import Models.Employee;

import java.sql.SQLException;
import java.util.Scanner;

public class RFBSystem {

    public static void main(String[] args) throws SQLException {
        boolean isRunning = true;
        ChildController childController = new ChildController();
        ParentController pc = new ParentController();
        EmployeeController ec = new EmployeeController();

        //bare en kommentar

        while(isRunning) {


            System.out.println("\n 1. Opret barn \n 2. Indlæs alle børn \n 3. " +
                    "redigere barn \n 4. slet barn \n 5. Afslut");

            Scanner sc = new Scanner(System.in);
            int menuChoice = sc.nextInt();

            //Start menuen
            switch(menuChoice) {
                case 1:
                    //childController.createChild();
                    //ec.createEmployee();
                    pc.createParent();
                    break;
                case 2:
                    //childController.readChildren();
                    ec.readEmployee();
                    //pc.readParent();
                    break;
                case 3:
                    //childController.updateChild();
                    ec.updateEmployee();
                    //pc.updateParent();
                    break;
                case 4:
                    //childController.deleteChild();
                    ec.deleteEmployee();
                    //pc.deleteParent();
                    break;
                case 5:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Der skete en fejl.");
                    isRunning = false;
                    break;
            }
        }
    }
}