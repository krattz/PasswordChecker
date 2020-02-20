import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import java.util.regex.*;
public class PasswordChecker {

    public static void main(String[] args) {

        String password = "!12DWEgjdjkbvks";
        passwordIsValid(password);
        passwordIsOk(password);
        passwordIsNeverOk(password);

    }

    public static String passwordIsValid(String password) {
        int check = 0;
        String msg = "";
            if (password.isEmpty()) {

                msg ="password should exist" ;
                System.out.println(msg);
            }
            else
                check+=1;
            if (password.length() > 8) {
                check+=1;
            }
            else{
                msg= "password should be longer than than 8 characters";
                System.out.println( msg);
            }

            if (password.matches(".*[a-z].*")) {
                check+=1;
            }
            else{
                msg="password should have at least one lowercase letter";
                System.out.println( msg);
            }
            if (password.matches(".*[A-Z].*")) {
                check+=1;
            }else {
                msg = "password should have at least one uppercase letter";
                System.out.println(msg);
            }
            if (password.matches(".*[0-9].*")) {
                check+=1;
            }
            else
            System.out.println("password should at least have one digit");

            if (password.matches("[!@#$%^*.,/:;?].*")) {
                check+=1;
            }
            else {
                System.out.println("password should have at least one special character");
            }
            if(check == 6){
                msg = "Password is valid";
            }
        return msg;
    }

    public static String passwordIsOk(String password) {
        String msg = "";
    if ((password.isEmpty() != true) && (password.length() >= 8) && (password.matches(".*[a-z].*"))) {
        msg ="true";
    }
    else {msg= "False";}
        System.out.println(msg);
        return msg;
}
    public static String passwordIsNeverOk(String password) {
        String msg = "";
        if (password.isEmpty() && password.length() <= 8) {
            msg = "Password is not okay";
        }
        System.out.println(msg);
        return msg;
    }
   }