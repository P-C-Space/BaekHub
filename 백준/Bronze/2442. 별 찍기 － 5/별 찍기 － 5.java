import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < N; i++) {
            for (int j = 1; j <= N + i; j++) {
                if(j < N - i) {
                    stringBuilder.append(' ');
                }
                else {
                    stringBuilder.append('*');
                }
            }
            stringBuilder.append('\n');
        }

        System.out.println(stringBuilder);
    }
}