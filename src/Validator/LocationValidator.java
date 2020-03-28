package Validator;

public class LocationValidator {

    public boolean isLocationValid(String input){
        if(input == null){
            return false;
        }
        switch (input) {
            case "r":
                //  s = Stue.RØD;
                return true;
            case "b":
                //   s = Stue.BLÅ;
                return true;
            case "v":
                //    s = Stue.VENTELISTE;
                return true;
        }
        return false;
    }
}
