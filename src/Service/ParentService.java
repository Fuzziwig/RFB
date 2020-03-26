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
pr.createParent(parent.getParent_id(), parent.getAdress_id(), parent.getParent_first_name(),parent.getParent_last_name(),parent.getParent_phone(),parent.getParent_email());
    }
    public void readParent () throws SQLException{

        ResultSet rs = pr.readParent();

        while  (rs.next()){
           int  parent_id = rs.getInt(1);
           int parent_adress_id = rs.getInt(2);
           String parent_first_name = rs.getString(3);
           String parent_last_name = rs.getString(4);
           String parent_phone = rs.getString(5);
           String parent_email = rs.getString(6);

            //Display values
            System.out.print("ParentID: " + parent_id);
            System.out.print(", AddressID: " + parent_adress_id);
            System.out.print(", Fornavn: " + parent_first_name);
            System.out.print(", Efternavn: " + parent_last_name);
            System.out.print(", Phone: " + parent_phone);
            System.out.println(", Email: " + parent_email);

        }
    }


    public void updateParent(Parent parent) throws SQLException{
        pr.updateParent(parent.getParent_id(),parent.getAdress_id(),parent.getParent_first_name(),parent.getParent_last_name(),parent.getParent_phone(),parent.getParent_email());
    }
    public void deleteParent (int parent_id)throws SQLException{
        pr.deleteParent(parent_id);
    }

}

