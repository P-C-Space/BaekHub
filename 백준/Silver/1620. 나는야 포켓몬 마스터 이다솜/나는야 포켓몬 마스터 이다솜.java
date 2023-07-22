import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        Map<String,Integer> poket = new HashMap<>();
        String []poket2 = new String[N];
        for(int i = 0;i<N;i++){
            String dictionary = br.readLine();
            poket.put(dictionary,i+1);
            poket2[i] = dictionary;
        }

        StringBuilder sb = new StringBuilder();
        for(int j = 0;j<q;j++){
            String input = br.readLine();
            if(isNumber(input)){
                sb.append(poket2[Integer.parseInt(input)-1]);
            }
            else{
                sb.append(poket.get(input));
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
    static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}