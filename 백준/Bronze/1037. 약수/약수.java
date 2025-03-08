import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        StringBuilder stringBuilder = new StringBuilder();
        int N = Integer.parseInt(bufferedReader.readLine());

        if(N == 1) {
            int num = Integer.parseInt(bufferedReader.readLine());
            stringBuilder.append(num * num);
        } else {
            int max = 0;
            int min = Integer.MAX_VALUE;

            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int i = 0; i < N; i++) {
                int num = Integer.parseInt(stringTokenizer.nextToken());
                if(num > max) {
                    max = num;
                }
                if(num < min) {
                    min = num;
                }
            }

            stringBuilder.append(max * min);
        }

        System.out.println(stringBuilder);

    }
}