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

    public String readName(String msg, String errmsg, int maxlen) {
        Scanner reader = new Scanner(System.in);
        NameValidator v = new NameValidator();
        while (true) {
            try {
                System.out.println(msg);
                String input = reader.nextLine();
                if (input.length()>maxlen){
                    throw new IndexOutOfBoundsException(Integer.toString(input.length()));
                }
                if (v.isNameValid(input)){
                    return input;
                }
                else throw new InputMismatchException();
            } catch (InputMismatchException e) {
                System.out.println(errmsg);
            } catch (IndexOutOfBoundsException e){
                System.out.println("Du har indtastet "+e.getMessage()+" karakterer. Der understøttes kun "+maxlen+".");
            }
        }
    }

    public String readEmail(String msg, String errmsg, int maxlen) {
        Scanner reader = new Scanner(System.in);
        EmailValidator v = new EmailValidator();
        while (true) {
            try {
                System.out.println(msg);
                String input = reader.nextLine();
                if (input.length()>maxlen){
                    throw new IndexOutOfBoundsException(Integer.toString(input.length()));
                }
                if (v.isEmailValid(input)){
                    return input;
                }
                else throw new InputMismatchException();
            } catch (InputMismatchException e) {
                System.out.println(errmsg);
            } catch (IndexOutOfBoundsException e){
                System.out.println("Du har indtastet "+e.getMessage()+" karakterer. Der understøttes kun "+maxlen+".");
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

    public String readText(String msg, int maxlen) {
        Scanner reader = new Scanner(System.in);
        while (true) {
            try {
                System.out.println(msg);
                String input = reader.nextLine();
                if (input.length()>maxlen){
                    throw new IndexOutOfBoundsException(Integer.toString(input.length()));
                }
                return input;
            } catch (IndexOutOfBoundsException e){
                System.out.println("Du har indtastet "+e.getMessage()+" karakterer. Der understøttes kun "+maxlen+".");
            }
        }
    }

    public int readPhoneNumber(String msg, String errmsg) {
        Scanner reader = new Scanner(System.in);
        PhoneNumberValidator v = new PhoneNumberValidator();
        while (true) {
            try {
                System.out.println(msg);
                String input = reader.nextLine();
                if (v.isPhoneNumberValid(input)){
                    return Integer.parseInt(input);
                }
                else throw new InputMismatchException();
            } catch (InputMismatchException e) {
                System.out.println(errmsg);
            }
        }
    }

    public int readZipCode(String msg, String errmsg) {
        Scanner reader = new Scanner(System.in);
        ZipCodeValidator v = new ZipCodeValidator();
        while (true) {
            try {
                System.out.println(msg);
                String input = reader.nextLine();
                if (v.isZipCodeValid(input)){
                    return Integer.parseInt(input);
                }
                else throw new InputMismatchException();
            } catch (InputMismatchException e) {
                System.out.println(errmsg);
            }
        }
    }



}
