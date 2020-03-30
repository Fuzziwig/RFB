package Controllers;

import Service.AccountService;

import java.sql.SQLException;
import java.util.Scanner;

public class AccountController {

    AccountService as = new AccountService();
    Scanner sc = new Scanner(System.in);

    public void createAccount() throws SQLException{

    }

    public void readAccount() throws SQLException {
        as.readAccount();
    }
}
