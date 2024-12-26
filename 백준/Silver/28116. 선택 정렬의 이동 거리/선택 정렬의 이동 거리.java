import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static int[] arr;
    private static int[] numLocations;
    private static int[] moveCounts;

    public static void main(String[] args) {
        try {
            prepre();
            solve();
        } catch (IOException e) {
            System.out.println("IOException Error");
        }
        Arrays.stream(moveCounts).forEach(num -> System.out.print(num + " "));
    }

    private static void prepre() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        arr = new int[N];
        numLocations = new int[N];
        moveCounts = new int[N];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(stringTokenizer.nextToken());
            arr[i] = num - 1;
            numLocations[num - 1] = i;
        }
    }

    private static void solve() {
        for (int i = 0; i < numLocations.length; i++) {
            if(arr[i] != i){
                int distance = numLocations[numLocations[arr[i]]] - i;

                moveCounts[i] += distance;
                moveCounts[arr[i]] += distance;

                arr[numLocations[i]] = arr[i];
                numLocations[arr[i]] = numLocations[i];
            }
        }
    }
}