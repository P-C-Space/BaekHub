import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static StringBuilder stringBuilder;

    private static void drawStarsTop(int N){
        for (int i = 1; i < N; i++) {
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
    }

    private static void drawStarsBottom(int N){
        for (int i = N - 1; i >= 0; i--) {
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
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        stringBuilder = new StringBuilder();

        drawStarsBottom(N);
        drawStarsTop(N);

        System.out.println(stringBuilder);
    }
}