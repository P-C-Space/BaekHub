import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> words = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int count = 0;
        // 집합
        for(int i =0;i<N;i++){
            words.add(br.readLine());
        }

        // 검사
        for(int i =0;i<M;i++){
            if(words.contains(br.readLine())){
                count++;
            }
        }
        System.out.println(count);
        
    }
}
