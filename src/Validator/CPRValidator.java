package Validator;

public class CPRValidator {

    //for checking number
    public boolean isCPRValid(String input){
        if(input == null){
            return false;
        }
        if (input.matches("\\d{10}")){
            DateValidator d = new DateValidator();
            return d.isDateValid(input.substring(0,5), "ddMMyy");
        }
        return false;
    }

}
