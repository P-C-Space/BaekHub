import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int gcd(int a, int b){
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
        int a[] = new int[2];
        int b[] = new int[2];

        StringTokenizer st = new StringTokenizer(br.readLine());
        a[0] = Integer.parseInt(st.nextToken()); // 분자
        a[1] = Integer.parseInt(st.nextToken()); // 분모
    
        st = new StringTokenizer(br.readLine());
        b[0] = Integer.parseInt(st.nextToken()); // 분자
        b[1] = Integer.parseInt(st.nextToken()); // 분모


        int moleculea = a[0] * b[1] + b[0] * a[1]; 

        int gcd_n = gcd((a[1]*b[1]),  moleculea);
        
        sb.append(moleculea / gcd_n + " " + (a[1]*b[1]) / gcd_n);

        System.out.println(sb);
    }    
}
