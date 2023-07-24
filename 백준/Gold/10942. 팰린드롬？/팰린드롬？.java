import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        // 질문
        boolean Palindrome;
        int q = Integer.parseInt(br.readLine());
        for (int j = 0; j < q; j++) {
            Palindrome = true;
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            a -= 1;
            b -= 1;
            // System.out.println(array[a]);
            // System.out.println(array[b]);
            for (int k = 0; k < (b - a + 1) / 2; k++) {
                if (array[a+k] != (array[b-k])) {
                    Palindrome = false;
                    break;
                }
            }

            int tmp = Palindrome ? 1 : 0;
            sb.append(tmp).append("\n");

        }

        System.out.println(sb);
    }
}