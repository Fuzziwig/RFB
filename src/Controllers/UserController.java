package Controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.text.ParseException;
import java.util.Scanner;
import Validator.*;

public class UserController {

    public int readCPR(String msg, String errmsg) {
        Scanner reader = new Scanner(System.in);
        CPRValidator v = new CPRValidator();
        while (true) {
            try {
                System.out.println(msg);
                String input = reader.nextLine();
                if (v.isCPRValid(input)){
                    return Integer.parseInt(input);
                }
                else throw new InputMismatchException();
            } catch (InputMismatchException e) {
                System.out.println(errmsg);
            }
        }
    }

    public java.sql.Date readDate(String msg, String errmsg) {
        Scanner reader = new Scanner(System.in);
        DateValidator v = new DateValidator();
        String dateformat = "dd/MM/yyyy";
        while (true) {
            try {
                System.out.println(msg);
                String input = reader.nextLine();
                if (v.isDateValid(input, dateformat)){
                    SimpleDateFormat sdf = new SimpleDateFormat(dateformat);
                    try {
                        Date myDate = sdf.parse(input);
                        return new java.sql.Date(myDate.getTime());
                    } catch (ParseException e) {
                        System.out.println(errmsg);
                    }
                }
                else throw new InputMismatchException();
            } catch (InputMismatchException e) {
                System.out.println(errmsg);
            }
        }
    }

    public String readName(String msg, String errmsg) {
        Scanner reader = new Scanner(System.in);
        NameValidator v = new NameValidator();
        while (true) {
            try {
                System.out.println(msg);
                String input = reader.nextLine();
                if (v.isNameValid(input)){
                    return input;
                }
                else throw new InputMismatchException();
            } catch (InputMismatchException e) {
                System.out.println(errmsg);
            }
        }
    }

    public String readLocation(String msg, String errmsg) {
        Scanner reader = new Scanner(System.in);
        LocationValidator v = new LocationValidator();
        while (true) {
            try {
                System.out.println(msg);
                String input = reader.nextLine();
                if (v.isLocationValid(input)){
                    switch (input) {
                        case "r":
                            return "RØD STUE";
                        case "b":
                            return "BLÅ STUE";
                        case "v":
                            return "VENTELISTE";
                        default :
                            throw new InputMismatchException();
                    }
                }
                else throw new InputMismatchException();
            } catch (InputMismatchException e) {
                System.out.println(errmsg);
            }
        }
    }




}
