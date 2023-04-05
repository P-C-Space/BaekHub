import java.util.Scanner;

public class Main {
    public static int N[] = new int[41]; // 0으로 초기화
    public static int fibonacci(int n){
        if(n == 0){
            return N[n]; // 배열 0 리턴
        } 
        else if(n == 1){
            if(N[n] == 0){
                N[n] = 1; // 1 저장후
            }
            return N[n]; // 배열 1 리턴
        } else{
            if(N[n] == 0){ // 배열에 비어있다면
                N[n] = fibonacci(n-1) + fibonacci(n-2); // 배열 저장후
            }
            return N[n]; // 리턴
        }

    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for(int i =0 ;i<T;i++){
            int tmp = s.nextInt();
            if(tmp == 0)
                System.out.println(1+" "+0);
            else
                System.out.println(fibonacci(tmp-1)+" "+fibonacci(tmp));
        }

        s.close();
    }
}
