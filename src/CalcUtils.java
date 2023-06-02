import java.util.HashMap;
import java.util.Map;

public class CalcUtils {

    public static int convertRomeToArab(String rome) {
        int[] arabicValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] romanSymbols = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        Map<String, Integer> romeArabPairs = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            romeArabPairs.put(romanSymbols[i], arabicValues[i]);
        }

        return romeArabPairs.get(rome);
    }

    public static String convertArabToRome(int input) {
        int[] arabicValues = {100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanSymbols = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < arabicValues.length; i++) {
            while (input >= arabicValues[i]) {
                result.append(romanSymbols[i]);
                input -= arabicValues[i];
            }
        }

        return result.toString();
    }

    public static boolean isArabic (String numb1, String numb2) {
        return numb1.matches("\\d+") && numb2.matches("\\d+");
    }
}
