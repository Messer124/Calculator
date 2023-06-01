import java.util.HashMap;
import java.util.Map;

public class CalcUtils {

    public static int convertRomeToArab(String rome) {
        int[] arabs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] romes = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        Map<String, Integer> romeArabPairs = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            romeArabPairs.put(romes[i], arabs[i]);
        }

        return romeArabPairs.get(rome);
    }

    public static String convertArabToRome(int input) {
        String s = "";

        while (input >= 100) {
            s += "C";
            input -= 100;
        }
        while (input >= 90) {
            s += "XC";
            input -= 90;
        }
        while (input >= 50) {
            s += "L";
            input -= 50;
        }
        while (input >= 40) {
            s += "XL";
            input -= 40;
        }
        while (input >= 10) {
            s += "X";
            input -= 10;
        }
        while (input >= 9) {
            s += "IX";
            input -= 9;
        }
        while (input >= 5) {
            s += "V";
            input -= 5;
        }
        while (input >= 4) {
            s += "IV";
            input -= 4;
        }
        while (input >= 1) {
            s += "I";
            input -= 1;
        }
        return s;
    }

    public static boolean isArabic (String numb1, String numb2) {
        try{
            Integer.parseInt(numb1);
            Integer.parseInt(numb2);
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }
}
