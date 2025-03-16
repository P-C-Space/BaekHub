
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int count = 0;
    private static int number = -1;
    private static int K;

    private static void mergeSort(int[] arr, int left, int right) {
        if(left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1;
        int z = 0;

        while(i <= mid && j <= right) {
            if(arr[i] <= arr[j]) {
                temp[z++] = arr[i++];
            }
            else {
                temp[z++] = arr[j++];
            }

        }

        while(i <= mid) {
            temp[z++] = arr[i++];
        }

        while(j <= right) {
            temp[z++] = arr[j++];
        }


        for (int l = 0; l < temp.length; l++) {
            arr[left + l] = temp[l];
            count++;
            if(count == K) {
                number = temp[l];
            }
        }


    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        K = Integer.parseInt(stringTokenizer.nextToken());

        int[] arr = new int[N];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        mergeSort(arr, 0, N - 1);

        System.out.println(number);

    }
}