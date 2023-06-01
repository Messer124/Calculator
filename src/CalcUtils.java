public class CalcUtils {

    public static int fromRomeToArab(String numb) {
        String[] arab = new String[100];
        for (int i = 0; i < arab.length; i++) {
            arab[i] = String.valueOf(i+1);
        }
        String[] rome = new String[]{"I","II","III","IV","V","VI","VII","VIII","IX","X"};

        int position = 0;
        for (int i = 0; i < rome.length; i++) {
            if (numb.equals(rome[i])) {
                position = i;
                break;
            }
        }

        return Integer.parseInt(arab[position]);
    }

    public static String getInteger(int input) {
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
