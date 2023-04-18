import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static char ch;
    public static void main(String[] args) throws IOException{

        // 선언부
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();

        long N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        ArrayList<Character> num = new ArrayList<Character>(); 

        // 구현
        while(N >= B){
            ch = N%B < 10 ? (char)((N%B) + 48) : (char)((N%B) + 55);
            num.add(ch);
            N /= B;
        }

            ch = N%B < 10 ? (char)((N%B) + 48) : (char)((N%B) + 55);
            num.add(ch);
        // 역으로 정렬
        Collections.reverse(num);
        
        for(int i = 0;i<num.size();i++){
            sb.append(num.get(i));
        }

        System.out.println(sb);

    }
}
