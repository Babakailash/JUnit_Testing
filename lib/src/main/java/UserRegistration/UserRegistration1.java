package UserRegistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration1 {

    public boolean CheckFirstName(String firstName) {

        boolean result  = Pattern.compile("^[A-Z][A-Za-z]{2,}").matcher(firstName).matches();
        if(result) {
            System.out.println("Valid First Name");
        }
        else {
            System.out.println("Invalid First Name");
        }
        return result;
    }

    public boolean CheckLastName(String lastName) {

        boolean result  = Pattern.compile("^[A-Z][A-Za-z]{2,}").matcher(lastName).matches();
        if(result) {
            System.out.println("Valid Last Name");
        }
        else {
            System.out.println("Invalid Last Name");
        }
        return result;
    }

    public boolean Email(String email) {

        boolean result = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$").matcher(email).matches();
        if(result) {
            System.out.println("Valid Email");
        }
        else {
            System.out.println("Invalid Email");
        }
        return result;
    }

    public boolean PhoneNumber(String phoneNumber) {

        boolean result  = Pattern.compile("^(\\+?\\d{1,4}[\\s-])?(?!0+\\s+,?$)\\d{10}\\s*,?$").matcher(phoneNumber).matches();
        if(result) {
            System.out.println("Valid Phone Number");
        }
        else {
            System.out.println("Invalid Phone Number");
        }
        return result;
    }

    public boolean Password(String password) {

        boolean result  = Pattern.compile("^(?=.*[A-Z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-])[A-Za-z0-9!@#$%^&*?]{8,}$").matcher(password).matches();
        if(result) {
            System.out.println("Valid Password ");
        }
        else {
            System.out.println("Invalid Password");
        }
        return result;
    }
}

