public class PasswordChecker {

    public static void main(String[] args){

        String password = "!12DWEgjdjkbvks";
        passwordIsOk(password);
        try {
            passwordIsValid(password);
        }catch(Exception e){
            System.out.println(e);
        }

        passwordIsNeverOk(password);

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
    public static void passwordIsValid(String password) throws Exception {
        int check = 0;
        String msg;
            if (password.isEmpty()) {
                msg = "password should exist";
                throw new Exception(msg);
//                 ;
//                System.out.println(msg);
            } else {
                check += 1;
            }
            if (password.length() < 8) {
                msg = "password should be longer than than 8 characters";
                throw new Exception(msg);

            } else {
                check += 1;
//                System.out.println( msg);
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
            if (check > 4) {
                msg = "Password is valid";
                System.out.println(msg);
            }
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