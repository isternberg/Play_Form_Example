package helpers;

public class FormValidator {

    private static final int MIN_INPUT_LENGTH = 2;

    public static boolean validateInputLength(String input, int min){
        if (input.length() >= min){
            return true;
        }
        return false;
    }
    public static boolean validateInputLength(String input){
        return validateInputLength(input, MIN_INPUT_LENGTH);
    }
}
