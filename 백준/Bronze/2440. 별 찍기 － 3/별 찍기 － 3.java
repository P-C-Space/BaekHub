import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++) {

            for(int j = N - i + 1; j > 0; j--) {
                str.append("*");
            }
            str.append("\n");
        }

        System.out.println(str);
    }
}