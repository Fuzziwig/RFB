package Validator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateValidator {

    //for checking dates
    public boolean isDateValid(String dateToValidate, String dateFormat){

        if(dateToValidate == null){
            return false;
        }
        if (dateFormat== null){
            return false;
        }

        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        sdf.setLenient(false);

        try {
            //if not valid, it will throw ParseException
            Date date = sdf.parse(dateToValidate);

        } catch (ParseException e) {
            //e.printStackTrace();
            return false;
        }
        return true;
    }
}
