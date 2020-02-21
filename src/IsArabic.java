public class IsArabic {
    public static boolean isArabic (String numb1, String numb2) {
        int number1 = 0;
        int number2 = 0;
        try{
            number1 = Integer.parseInt(numb1);
            number2 = Integer.parseInt(numb2);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
