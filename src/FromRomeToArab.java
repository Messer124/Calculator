public class FromRomeToArab {
    public static int fromRomeToArab(String numb) {
        String[] arab = new String[]{"10","1","2","3","4","5","6","7","8","9"};
        String[] rome = new String[]{"X","I","II","III","IV","V","VI","VII","VIII","IX"};

        int position = 0;
        for (int i = 0; i < rome.length; i++) {
            if (numb.equals(rome[i])) {
                position = i;
                break;
            }
        }

        return Integer.parseInt(arab[position]);
    }
}
