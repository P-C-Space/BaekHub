import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    private static int[] arr;
    private static StringBuilder stringBuilder = new StringBuilder();

    private static void backTracking(int depth, int M, int N, int start) {
        if (depth == M) {
            for (int i : arr) {
                stringBuilder.append(i).append(" ");
            }
            stringBuilder.append("\n");
            return;
        }

        for (int i = start; i < N; i++) {
            arr[depth] = i + 1;
            backTracking(depth + 1, M, N, i);
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        arr = new int[M];


        backTracking(0, M, N, 0);

        System.out.println(stringBuilder);

    }
}
