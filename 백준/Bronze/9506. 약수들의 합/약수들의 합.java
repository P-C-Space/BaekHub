import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int n = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            ArrayList<Integer> tmp = new ArrayList<>();
            int sum = 0;

            if(n == -1){
                break;
            }

            sb.append(n);
            for(int i = 1;i<n;i++){
                if(n % i == 0){
                    tmp.add(i);
                    sum += i;
                }
            }


            if(sum != n){
                sb.append(" is NOT perfect.");
            }
            else{
                sb.append(" = ");
                for(int i = 0;i<tmp.size()-1;i++){
                    sb.append(tmp.get(i)).append(" + ");
                }
                sb.append(tmp.get(tmp.size()-1));
            }
            System.out.println(sb);
        }
    }
}
