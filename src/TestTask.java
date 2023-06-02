import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestTask {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Calculator.calculate(reader.readLine());
    }
}
