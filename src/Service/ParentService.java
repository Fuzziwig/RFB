package Service;

import Models.Child;
import Models.Employee;
import Models.Parent;
import Repositories.ParentRepository;

import java.sql.ResultSet;
import java.sql.SQLException;
public class ParentService {
    ParentRepository pr =  new ParentRepository ();



    public void createParent(Parent parent) throws SQLException {
        pr.createParent(parent.getParent_id(), parent.getParent_first_name(),parent.getParent_last_name(),parent.getParent_phone(),parent.getParent_email(), parent.getAddress_id());
    }

    public void readParent () throws SQLException{

        ResultSet rs = pr.readParent();

        while  (rs.next()){
           int  parent_id = rs.getInt(1);
           String parent_first_name = rs.getString(2);
           String parent_last_name = rs.getString(3);
           String parent_phone = rs.getString(4);
           String parent_email = rs.getString(5);
            int parent_address_id = rs.getInt(6);

            //Display values
            System.out.print("ParentID: " + parent_id);
            System.out.print(", Fornavn: " + parent_first_name);
            System.out.print(", Efternavn: " + parent_last_name);
            System.out.print(", Phone: " + parent_phone);
            System.out.print(", Email: " + parent_email);
            System.out.println(", AddressID: " + parent_address_id);

        }
    }

    public void updateParent(Parent parent) throws SQLException{
        pr.updateParent(parent.getParent_first_name(),parent.getParent_last_name(),parent.getParent_phone(),parent.getParent_email(),parent.getAddress_id(),parent.getParent_id());
    }
    public void deleteParent (int parent_id)throws SQLException{
        pr.deleteParent(parent_id);
    }

}

