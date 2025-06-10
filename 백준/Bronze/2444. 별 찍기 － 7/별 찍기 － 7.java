import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        // 별찍기
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        
        // 상단
        for(int i =0;i<N;i++){ // 피라미드 모양
            for(int j = N-1;j>i;j--){
                System.out.print(" "); // 4 3 2 1 0 반복 공백 필요
                // 4부터 시작 i = 0 부터 시작
                // i가 증감함에 따라 반복횟수 1씩 감소
                // 4 3 2 1 0
            }
            for(int k = 0;k<2*i+1;k++){
                System.out.print("*"); // 1 3 5 7 9 별 필요
                // k = 0 부터 시작 i = 0 => k < 2*0 + 1 k < 1 1번 반복
                // i = 1 => 2+1 = 3 k < 3 3번 반복
                // 1 3 5 7 9
            }
            System.out.println(); // 줄바꿈
        }
        
        // 하단
        for(int i = 1;i<N;i++){ // 반대모양의 피라미드를 한칸 줄여서 제작
                                // 같은 값으로 역으로 시작하지만 한칸이 불필요
                                // i의 값을 1부터 시작함으로써 첫번째 칸 건너뜀
            for(int j = 0;j<i;j++){ 
                System.out.print(" "); // 1 2 3 4 반복 공백 필요
                // i = 1부터 ~ 4까지 증가
                // 1 2 3 4 반복
            }
            for(int k = 2*N-1;k>2*i;k--){
                System.out.print("*"); // 7 5 3 1
                // 역으로 K값을 2*N-1 => 9 
                // 2 * i 시작은 0이 아니라 i = 1 즉 7번 반복부터 시작
                // 7 5 3 1
            }
         
            System.out.println(); // 줄바꿈
        }


        s.close();
    }
}
