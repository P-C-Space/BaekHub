import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N * 2; j++) {
                if(i < j && j < N * 2 - i - 1) {
                    str.append(' ');
                }
                else {
                    str.append('*');
                }
            }
            str.append('\n');
        }

        for (int i = N - 2; i >= 0; i--) {
            for (int j = 0; j < N * 2; j++) {
                if(i < j && j < N * 2 - i - 1) {
                    str.append(' ');
                }
                else {
                    str.append('*');
                }
            }
            str.append('\n');
        }


        System.out.println(str);
    }
}