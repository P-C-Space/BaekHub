import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static void can(char[] arr, int start, int size) {
        if(size <= 1 ) {
            return;
        }

        int onePerThird = size / 3;

        for(int i = start + onePerThird; i < start + 2 * onePerThird; i++) {
            arr[i] = ' ';
        }

        can(arr, start, onePerThird);
        can(arr, start + 2 * onePerThird, onePerThird);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            String input = br.readLine();
            if (input == null || input.isBlank()) {
                break;
            }

            int n = Integer.parseInt(input);
            if(n == 0) {
                stringBuilder.append("-\n");
                continue;
            }

            int size = (int) Math.pow(3, n);

            char[] result = new char[size];

            for (int i = 0; i < size; i++) {
                result[i] = '-';
            }

            can(result,0, size);
            stringBuilder.append(result).append('\n');
        }

        System.out.println(stringBuilder);
    }
}