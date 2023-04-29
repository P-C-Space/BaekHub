import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    // MenOfPassion(A[], n) {
    //     sum <- 0;
    //     for i <- 1 to n - 2
    //         for j <- i + 1 to n - 1
    //             for k <- j + 1 to n
    //                 sum <- sum + A[i] × A[j] × A[k]; # 코드1
    //     return sum;
    // }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        n = n-2;
        // int count = 0;
        // for(int i =0;i<n-2;i++){
        //     for(int j = i+1;j<n-1;j++){
        //         for(int k = j+1;k<n;k++){
        //             count++;
        //         }
        //     }
        // }
        // System.out.println(count);

        // n = 1 => 0
        // n = 2 => 0
        // n = 3 => 1   1
        // n = 4 => 4   2
        // n = 5 => 10  3
        // n = 6 => 20  4
        // n = 7 => 35  5
        // 사면체수 => n(n+1)(n+2)/6 => 3차수
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf((n*(n+1)*(n+2))/6)).append("\n");
        sb.append("3").append("\n");
        System.out.println(sb);
    }
}
