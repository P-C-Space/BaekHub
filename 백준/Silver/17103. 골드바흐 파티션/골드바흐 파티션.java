
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static boolean[] isPrime;

    public static void main(String[] args) throws IOException {
        solve();
    }

    private static void solve() throws IOException {
        
        sieveOfEratosthenes(1000000);
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int N = Integer.parseInt(bufferedReader.readLine());

        for(int i = 0;i<N;i++){
            int num = Integer.parseInt(bufferedReader.readLine());
            String result = String.valueOf(findGBPartitions(num));
            stringBuilder.append(result)
                    .append("\n");
        }

        System.out.println(stringBuilder);
    }


    private static void sieveOfEratosthenes(int num) {
        isPrime = new boolean[num + 1];

        for (int i = 2; i <= num; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (!isPrime[i]) continue;
            for (int j = i + i; j <= num; j += i) {
                isPrime[j] = false;
            }
        }
    }

    private static int findGBPartitions(int evenNum) {
        if(evenNum < 4 || evenNum % 2 != 0) {
            throw new IllegalArgumentException(" 4이상의 짝수만 입력 가능합니다. ");
        }

        int count = 0;

        for (int i = 2; i <= evenNum / 2; i++) {
            if(isPrime[i] && isPrime[evenNum - i]) {
                count++;
            }
        }
        return count;
    }
}