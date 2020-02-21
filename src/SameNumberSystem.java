public class SameNumberSystem {
    public static boolean sameNumberSystem (String numb1, String numb2){
        int number1 = 0;
        int number2 = 0;
        boolean firstCaseException = false;
        boolean secondCaseException = false;
        try{
            number1 = Integer.parseInt(numb1);
        } catch (NumberFormatException e) {
            firstCaseException = true;
        }
        try {
            number2 = Integer.parseInt(numb2);
        } catch (NumberFormatException e) {
            secondCaseException = true;
        }

        return firstCaseException==secondCaseException ? true : false;
    }
}
