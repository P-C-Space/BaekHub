import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int min = 1000;
        int position[] = new int[4];
        // x y w h 순
        for (int i =0;i<4;i++){
            position[i] = Integer.parseInt(st.nextToken());
        }
        position[2] -= position[0];
        position[3] -= position[1];
        
        for(int i =0;i<4;i++){
            min = position[i] < min ? position[i] : min;
        }
        System.out.println(min);
    }
}
