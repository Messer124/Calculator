import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calc {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CalcUtils.calculate(reader.readLine());
    }
}
