import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int N = s.nextInt();
        int M = s.nextInt();
        int max = 0;
        int num[] = new int[N];
        for(int i =0;i<N;i++){
            num[i] = s.nextInt();
        }

        for(int i = 0;i<N-2;i++){
            for(int j = i+1;j<N-1;j++){
                for(int k = j+1;k<N;k++){
                    int tmp = num[i] + num[j] + num[k];
                    if(tmp <= M && tmp > max){
                        max = tmp;
                    }
                }
            }
        }
        System.out.println(max);
        s.close();
    }
}
