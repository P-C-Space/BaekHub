import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // MenOfPassion(A[], n) {
        //     sum <- 0;
        //     for i <- 1 to n
        //         for j <- 1 to n
        //             sum <- sum + A[i] × A[j]; # 코드1
        //     return sum;
        // }
        // N * N => O(N^2)의 시간 복잡도 => 차수 2
        Scanner s = new Scanner(System.in);
        long n = s.nextInt();
        System.out.println(n*n);
        System.out.println("2");
        s.close();
    }
}
