import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int find_number(int[] a){
        if(a[0] == a[1]){
            return a[2];
        }
        else if(a[1] == a[2]){
            return a[0];
        }
        else{
            return a[1];
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x[] = new int[3];
        int y[] = new int[3];
        StringTokenizer st;
        for(int i =0;i<3;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            x[i] = a;
            y[i] = b;
        }
        
        System.out.println(find_number(x)+" "+find_number(y));
    }
}
