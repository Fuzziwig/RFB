package Validator;

public class PhoneNumberValidator {

    //for checking danish phone number (8 digits long)
    public boolean isPhoneNumberValid(String input){
        if(input == null){
            return false;
        }
        return input.matches("\\d{8}");
    }
}