import Repositories.AccountRepository;
import Service.AccountService;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login {
    String user, password;
    Menu menu = new Menu();
    Scanner sc = new Scanner(System.in);
    AccountRepository ar = new AccountRepository();

    public void run() throws SQLException {
        System.out.println("Velkommen til Roskilde Frie Børnehave");
        System.out.println("Skriv venligst dit brugernavn: ");
        user = sc.nextLine();
        System.out.println("Skriv venligst dit password: ");
        password = sc.nextLine();

        ResultSet rs = ar.readAccount();

        while(rs.next()) {
            if (user.equals(rs.getString(1)) && password.equals(rs.getString(2))) {
                menu.adminMenu();
            }

        }
    }
}
