package util;

public class InputValidator {
    public static boolean isEmpyt(String text){
        return text == null || text.trim().isEmpty();
    }
    public static boolean isNumber(String text){
        try{
            Integer.parseInt(text);
            return true;
        } catch (Exception e){
            return false;
        }
    }
}