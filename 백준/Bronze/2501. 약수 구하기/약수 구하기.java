import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int divisor_check(int a,int k){
        int count = 0;
        for(int i = 1;i<=a;i++){
            if(a % i == 0){
                count++;
                if(count == k){
                    return i; // 존재시 i
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        System.out.println(divisor_check(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
    }
}
