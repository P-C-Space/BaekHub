import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a_size = Integer.parseInt(st.nextToken());
        int b_size = Integer.parseInt(st.nextToken());

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0;i < a_size;i++){
            a.add(Integer.parseInt(st.nextToken()));
        }  

        st = new StringTokenizer(br.readLine());
        for(int j = 0;j < b_size;j++){
            b.add(Integer.parseInt(st.nextToken()));
        }

        int a_b = 0;
        int b_a = 0;

        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);

        a_b = a.size() - intersection.size();
        b_a = b.size() - intersection.size();

        System.out.println(a_b+b_a);

    }
}
