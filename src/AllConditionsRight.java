public class AllConditionsRight {
    public static boolean allConditionsRight(String numb1, String numb2){
        boolean sameNumberSystem;
        boolean isNumbersCorrect = false;
        boolean isWholeNumbers = false;
        boolean isArabic = IsArabic.isArabic(numb1, numb2);
        int number1 = 0;
        int number2 = 0;

        sameNumberSystem = SameNumberSystem.sameNumberSystem(numb1, numb2);

        if (isArabic) {
            number1 = Integer.parseInt(numb1);
            number2 = Integer.parseInt(numb2);
        } else {
            number1 = FromRomeToArab.fromRomeToArab(numb1);
            number2 = FromRomeToArab.fromRomeToArab(numb2);
            isArabic = true;
        }

        if (number1 >0 && number1 <=10 && number2 >0 && number2 <=10){
            isNumbersCorrect = true;
        }

        if (number1%1==0 && number2%1==0) isWholeNumbers = true;

        return (sameNumberSystem && isArabic && isNumbersCorrect && isWholeNumbers);
    }
}
