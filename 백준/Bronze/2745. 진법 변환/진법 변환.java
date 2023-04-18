import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static long sum = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        String N = st.nextToken();
        long B = Integer.parseInt(st.nextToken());

        for(int i =0;i<N.length();i++){
            int tmp = N.charAt(i);
            if('A'<= tmp && tmp<='Z'){
                tmp -= (65 - 10);
            }
            else{
                tmp -= 48;
            }
            sum += (tmp * Math.pow(B,N.length()-1-i));
        }

        System.out.println(sum);
    }
}
