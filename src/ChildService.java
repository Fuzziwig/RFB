import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ChildService {
    ChildRepository cr = new ChildRepository();

    public void createChild(Child child) throws SQLException {
        cr.createChild(child.getCprNrID(),child.getDateOfEntry(),child.getChildFirstName(),child.getChildLastName(),child.getLocation(),child.getChildrenInfo());
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
        cr.updateChild(child.getDateOfEntry(),child.getChildFirstName(),child.getChildLastName(),child.getLocation(),child.getChildrenInfo(),child.getCprNrID());
    }

    public void deleteChild(int cprNrID) throws SQLException {
        cr.deleteChild(cprNrID);
    }
}

