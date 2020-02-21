import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calc {
    public static void main(String[] args) throws Exception {
        int number1 = 0;
        int number2 = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String parts[] = input.split(" ");

        if(AllConditionsRight.allConditionsRight(parts[0], parts[2])){
            if (IsArabic.isArabic(parts[0], parts[2])) {
                number1 = Integer.parseInt(parts[0]);
                number2 = Integer.parseInt(parts[2]);
            } else {
                number1 = FromRomeToArab.fromRomeToArab(parts[0]);
                number2 = FromRomeToArab.fromRomeToArab(parts[2]);
            }

            if (parts[1].equals("+")) System.out.println(number1+number2);
            else if (parts[1].equals("-")) System.out.println(number1-number2);
            else if (parts[1].equals("*")) System.out.println(number1*number2);
            else if (parts[1].equals("/")) System.out.println(number1/number2);
        } else throw new Exception();
    }
}
