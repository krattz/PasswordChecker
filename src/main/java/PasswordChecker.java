public class PasswordChecker {

    public static void main(String[] args){

        String password = "!12DWEgjdjkbvks";

        try {
            passwordIsValid(password);
        }catch(Exception e){
            System.out.println(e);
        }
        try {
            passwordIsOk(password);
        }catch(Exception e){
            System.out.println(e);
        }
        try {
            passwordIsNeverOk(password);
        }catch(Exception e){
            System.out.println(e);
        }


    }
    public static void passwordIsValid(String password) throws Exception {
        int check = 0;
        String msg;
            if (password.isEmpty()) {
                msg = "password should exist";
                throw new Exception(msg);
            } else {
                check += 1;
            }
            if (password.length() < 8) {
                msg = "password should be longer than than 8 characters";
                throw new Exception(msg);
            } else {
                check += 1;
            }
            if (password.matches(".*[a-z].*")) {
                check += 1;
            } else {
                msg = "password should have at least one lowercase letter";
                System.out.println(msg);
            }
            if (password.matches(".*[A-Z].*")) {
                check += 1;
            } else {
                msg = "password should have at least one uppercase letter";
                System.out.println(msg);
            }
            if (password.matches(".*[0-9].*")) {
                check += 1;
            } else
                System.out.println("password should at least have one digit");

            if (password.matches(".*[!@#$%^*.,/:;?].*")) {
                check += 1;
            } else {
                System.out.println("password should have at least one special character");
            }
            if (check > 5) {
                msg = "Password is valid";
                System.out.println(msg);
            }
        }
    public static String passwordIsOk(String password) throws Exception {
        boolean msg;

            if(password.isEmpty() || password.length() <8 || password.matches(".*[a-z].*")!= true ){
                msg = false;
                throw new Exception(String.valueOf(msg));
            }
            else {
                msg = true;
            }
        System.out.println(msg);
        return password;
    }
    public static String passwordIsNeverOk(String password) throws Exception {
        String msg = "";
        if (password.isEmpty() || password.length() <= 8) {
            msg = "Password is not okay";
            throw new Exception(msg);
        }
        else {msg = "Password is Okay";}
        System.out.println(msg);
        return msg;
    }
   }