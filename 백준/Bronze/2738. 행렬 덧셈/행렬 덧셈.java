import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int N = s.nextInt();
        int M = s.nextInt();
        
        int A[][] = new int[N][M];
        int B[][] = new int[N][M];
        
        for(int i =0;i<N;i++){
            for(int j = 0;j<M;j++){
                A[i][j] = s.nextInt();
            }
        }
        
        for(int i =0;i<N;i++){
            for(int j = 0;j<M;j++){
                B[i][j] = s.nextInt();
                System.out.print((A[i][j]+B[i][j]) + " ");
            }
            System.out.println();
        }
        
        s.close();
    }   
}
