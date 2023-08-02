import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long S = Long.parseLong(br.readLine());
        int count = 1;
        while(S > 0){
            S -= count;
            if(S < 0){
                break;
            }
            count++;
        }

        System.out.println(count - 1);
    }
}
