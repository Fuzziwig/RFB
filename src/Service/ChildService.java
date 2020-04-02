package Service;

import Models.Child;
import Repositories.ChildRepository;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ChildService {
    ChildRepository cr = new ChildRepository();

    public void createChild(Child child)  {
        try {
        cr.createChild(child.getCpr_nr(),child.getDate_of_entry(),child.getChild_first_name(),child.getChild_last_name(),child.getLocation(),child.getChildren_info());
        }catch (SQLException e){
            System.out.println("problem med connetion");
            System.out.println(e.getSQLState());
            System.out.println(e.getErrorCode());

        }
    }

    public void readOneChild(int cpr)  throws SQLException {
        ResultSet rs = cr.readOneChild(cpr);

        //Extract data from result set
        while (rs.next()) {
            //Retrieve by column index
            int cprnr = rs.getInt(1); //man kunne også have brugt columnLabel fx: int cpr = rs.getInt("cprNrID);
            int dateOfEntry = rs.getInt(2);
            String firstName = rs.getString(3);
            String lastName = rs.getString(4);
            String location = rs.getString(5);
            String info = rs.getString(6);

            //Display values
            System.out.print("CPR nummer: " + cprnr);
            System.out.print(", Indskrivnings dato: " + dateOfEntry);
            System.out.print(", Fornavn: " + firstName);
            System.out.print(", Efternavn: " + lastName);
            System.out.print(", Stue: " + location);
            System.out.println(", Ekstra info: " + info);
        }
    }

    public void readChildren() throws SQLException {
        ResultSet rs = cr.readChildren();


        //Extract data from result set
        while (rs.next()) {
            //Retrieve by column index
            int cpr = rs.getInt(1); //man kunne også have brugt columnLabel fx: int cpr = rs.getInt("cprNrID);
            int dateOfEntry = rs.getInt(2);
            String firstName = rs.getString(3);
            String lastName = rs.getString(4);
            String location = rs.getString(5);
            String info = rs.getString(6);

            //Display values
            System.out.print("CPR nummer: " + cpr);
            System.out.print(", Indskrivnings dato: " + dateOfEntry);
            System.out.print(", Fornavn: " + firstName);
            System.out.print(", Efternavn: " + lastName);
            System.out.print(", Stue: " + location);
            System.out.println(", Ekstra info: " + info);
        }
    }

    public void updateChild(Child child) throws SQLException {
        cr.updateChild(child.getDate_of_entry(),child.getChild_first_name(),child.getChild_last_name(),child.getLocation(),child.getChildren_info(),child.getCpr_nr());
    }

    public void deleteChild(int cprNrID) throws SQLException {
        cr.deleteChild(cprNrID);
    }
}

