import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        Map<Integer,Integer> card = new HashMap<>();
        for(int i =0;i<N;i++){
            int temp = Integer.parseInt(st.nextToken());
            if(card.containsKey(temp)){
                card.put(temp,card.get(temp)+1);
            }
            else{
                card.put(temp,1);
            }
        }
        
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int j = 0;j<M;j++){
            int k = Integer.parseInt(st.nextToken());
            if(card.containsKey(k)){
                sb.append(card.get(k)).append(" ");
            }
            else{
                sb.append(0).append(" ");
            }
        }

        System.out.println(sb);

    }
}
