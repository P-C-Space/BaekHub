import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> arr = new HashSet<>(); 
        ArrayList<String> duplicated = new ArrayList<String>();

        for (int i =0;i<N;i++){
            arr.add(br.readLine());
        }
        for (int i = 0;i<M;i++){
            String tmp = br.readLine();
            if(arr.contains(tmp)){
                duplicated.add(tmp);
            }
        }

        Collections.sort(duplicated);

        for(int i =0;i<duplicated.size();i++){
            sb.append(duplicated.get(i)).append("\n");
        }

        System.out.println(duplicated.size()+"\n"+sb);
        br.close();
    }
}
