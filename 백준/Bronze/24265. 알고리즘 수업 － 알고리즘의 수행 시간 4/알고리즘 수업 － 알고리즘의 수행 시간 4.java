import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    // MenOfPassion(A[], n) {
    //     sum <- 0;
    //     for i <- 1 to n - 1
    //         for j <- i + 1 to n
    //             sum <- sum + A[i] x A[j]; # 코드1
    //}
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        n = n-1;
        // int count = 0;
        // for(int i =0;i<n-1;i++){
        //     for(int j = i+1;j<n;j++){
        //         count++;
        //     }
        // }
        // System.out.println(count);
        // n = 5
        // i    j 
        // 0    1 2 3 4
        // 1    2 3 4
        // 2    3 4
        // 3    4
        // n = 1 => 0
        // n = 2 => 1
        // n = 3 => 3
        // n = 4 => 6
        // 삼각수 => n(n+1)/2 차수는 2
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf((n * (n + 1))/2)).append("\n");
        sb.append("2").append("\n");
        System.out.println(sb);
    }
}
