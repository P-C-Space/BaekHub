import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();

        int arr[] = new int[N];

        for(int i =0;i<N;i++){
            arr[i] = s.nextInt();
        }

        // 버블 정렬
        for(int i =0;i<N;i++){
            for(int j = i+1;j<N;j++){ // i 의 다음 수부터
                if(arr[i] > arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        for(int i =0;i<N;i++){
            System.out.println(arr[i]);
        }
        s.close();
    }
}
