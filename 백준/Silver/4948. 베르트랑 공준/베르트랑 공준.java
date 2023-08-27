import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static boolean[] isPrime = new boolean[123456*2+1]; // 주어진 최대 값의 두배
    
    // ex) 11 ^ 2 > 120 이기때문에 11까지만해당
    // -> 역으로 총 개수의 제곱근만 사용
    // 에라토스테네스의 체
    // n의 배수 삭제
    // 생성시 false 기본값 => 소수가 아니면 true
    public static void setPrime() {
        isPrime[0] = isPrime[1] = true; // 0 = 1은 소수가 아님
        
        for(int i = 2;i <= Math.sqrt(isPrime.length);i++){ // 2부타 시작
            if(isPrime[i]){ // 이미 소수 판별 후면 건너 뛰기
                continue;
            }

            for(int j = i * i; j < isPrime.length; j += i){
                isPrime[j] = true;
            }
        }
        
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        setPrime();

        int number = 0;
        int count;
        while(true){
            number = Integer.valueOf(br.readLine());
            if(number == 0)
                break;
            count = 0;
            for(int i = number+1;i<=number*2;i++){
                if(!isPrime[i]){
                    count++;
                }
            }
            sb.append(count).append("\n");

        }

        System.out.println(sb);
    }

}
