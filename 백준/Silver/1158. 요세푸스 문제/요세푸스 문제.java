import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.Queue;

public class Main {
    static Queue<Integer> q = new LinkedList();
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        sb.append("<");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for(int i =0 ;i<n;i++){
            q.add(i+1);
        }

        int count = 0;
        while(q.size() > 0){
            for(int i =0;i<k-1;i++){
                int i_tmp = q.poll();
                q.add(i_tmp);
            }
            count++;
            if(n == count){
                sb.append(q.poll()).append(">");
            }
            else{
                sb.append(q.poll()).append(", ");
        
            }
        }
        System.out.println(sb);
    }
}
