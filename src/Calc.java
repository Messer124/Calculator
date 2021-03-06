import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calc {
    public static void main(String[] args) throws Exception {
        int number1 = 0;
        int number2 = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String parts[] = input.split(" ");
        String regex = "(([1][0]|[1-9]) (\\+|\\-|\\*|\\/) ([1][0]|[1-9]))|((I?X|I{1,3}|I?VI{0,3}) (\\+|\\-|\\*|\\/) (I?X|I{1,3}|I?VI{0,3}))";
        boolean correctString = input.matches(regex);
        boolean isRome = false;
        int result = 0;

        if(correctString){
            if (IsArabic.isArabic(parts[0], parts[2])) {
                number1 = Integer.parseInt(parts[0]);
                number2 = Integer.parseInt(parts[2]);
            } else {
                number1 = FromRomeToArab.fromRomeToArab(parts[0]);
                number2 = FromRomeToArab.fromRomeToArab(parts[2]);
                isRome = true;
            }
            if (parts[1].equals("+"))      result = number1+number2;
            else if (parts[1].equals("-")) result = number1-number2;
            else if (parts[1].equals("*")) result = number1*number2;
            else if (parts[1].equals("/")) result = number1/number2;

            if (isRome) {
                System.out.println(GetIntegerFromRoman.getInteger(result));
            } else System.out.println(result);
        } else throw new Exception();
    }
}
