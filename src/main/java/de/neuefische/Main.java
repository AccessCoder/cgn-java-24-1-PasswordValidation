package de.neuefische;

public class Main {

    /**
     * A method that ensures a password is at least 8 characters long. V
     * With another method, you want to check if the password contains digits. V
     * Additionally, you want to ensure with a method that both uppercase and lowercase letters are used in the password. V
     * And a method should detect commonly used passwords. V
     */

    public static void main(String[] args) {

    }

    public static String[] badPasswords = {"Passwort123", "Unsicher1", "Currywurst25"};

    public static boolean checkPassword(String password) {
        return checkLenght(password) &&
                containsDigit(password) &&
                containsLowerCase(password) &&
                containsUpperCase(password) &&
                !containsBadPassword(password);
    }

    public static boolean checkLenght(String password) {
        return password.length() >=8;
    }


    public static boolean containsDigit(String password) {
        for (char c: password.toCharArray() ) {
            if (Character.isDigit(c)){
                return true;
            }
        }
        return false;
    }

    public static boolean containsUpperCase(String password) {
        return !password.equals(password.toLowerCase()); // Passwort == passwort
    }

    public static boolean containsLowerCase(String password) {
        return !password.equals(password.toUpperCase()); // Passwort == PASSWORT
    }

    public static boolean containsBadPassword(String password) {
        for (String badPassword:badPasswords) {
            if (password.equals(badPassword)){
                return true;
            }
        }
        return false;
    }



//    public static boolean containsDigitRegex(String password) {
//        return password.matches(".*[0-9].*");
//    }
}