import java.util.HashMap;
import java.util.Map;

public class Calculator {

    public static void calculate(String input) throws Exception {
        int number1;
        int number2;
        String[] parts = input.split(" ");
        String regex = "(([1][0]|[1-9]) (\\+|\\-|\\*|\\/) ([1][0]|[1-9]))|((I?X|I{1,3}|I?VI{0,3}) (\\+|\\-|\\*|\\/) (I?X|I{1,3}|I?VI{0,3}))";
        boolean correctString = input.matches(regex);
        boolean isRome = false;
        int result = 0;

        if(correctString){
            if (Calculator.isArabic(parts[0], parts[2])) {
                number1 = Integer.parseInt(parts[0]);
                number2 = Integer.parseInt(parts[2]);
            } else {
                number1 = Calculator.convertRomeToArab(parts[0]);
                number2 = Calculator.convertRomeToArab(parts[2]);
                isRome = true;
            }

            switch (parts[1]) {
                case "+": result = number1 + number2; break;
                case "-": result = number1 - number2; break;
                case "*": result = number1 * number2; break;
                case "/": result = number1 / number2; break;
            }

            if (isRome) {
                System.out.println(Calculator.convertArabToRome(result));
            } else
                System.out.println(result);

        } else
            throw new Exception("Incorrect input");
    }

    private static int convertRomeToArab(String rome) {
        int[] arabicValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] romanSymbols = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        Map<String, Integer> romeArabPairs = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            romeArabPairs.put(romanSymbols[i], arabicValues[i]);
        }

        return romeArabPairs.get(rome);
    }

    private static String convertArabToRome(int input) {
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

    private static boolean isArabic (String numb1, String numb2) {
        return numb1.matches("\\d+") && numb2.matches("\\d+");
    }

}
