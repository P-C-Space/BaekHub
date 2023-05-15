import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static long gcd(long a, long b){
        if(a % b == 0){
            return b;
        }
        return gcd(b,a%b);
    }

    // 유클리드 호제법를 이용
    // 두수의 곲 / 최대 공약수 => 최소 공배수
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
    
        long gcd_n = a > b ? gcd(a, b) : gcd(b, a);
            
        sb.append(a*b / gcd_n).append("\n");
        System.out.println(sb);
    }    
}
