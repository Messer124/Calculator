public class FromRomeToArab {
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
}
