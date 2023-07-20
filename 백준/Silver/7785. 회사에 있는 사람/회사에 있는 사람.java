import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        // 역순기준으로 TreeMap 생성
        // TreeMap 은 정렬보장
        Map<String,String> attendance = new TreeMap<>(Comparator.reverseOrder());

        for(int i = 0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            attendance.put(st.nextToken(), st.nextToken());
        }
        

        for(String s : attendance.keySet()){
            // System.out.println(s);
            if(attendance.get(s).equals("leave")){
                continue;
            }
            sb.append(s).append("\n");
        }

        System.out.println(sb);
    }
}
