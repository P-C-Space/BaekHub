
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        StringBuilder stringBuilder = new StringBuilder();

        int T = Integer.parseInt(bufferedReader.readLine());
        int N, K;
        BigInteger result;

        for (int i = 0; i < T; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            N = Integer.parseInt(stringTokenizer.nextToken());
            K = Integer.parseInt(stringTokenizer.nextToken());

            if (N < K) {
                int temp = N;
                N = K;
                K = temp;
            }

            result = factorial(N).divide(factorial(K).multiply(factorial(N - K)));
            stringBuilder.append(result).append("\n");
        }

        System.out.println(stringBuilder);
    }
}