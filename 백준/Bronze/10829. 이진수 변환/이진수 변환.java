import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Long m = Long.parseLong(br.readLine());
        
        ArrayList<String> i_binary = new ArrayList<>();

        while(m >= 2){
           i_binary.add(String.valueOf(m%2));
           m =  m / 2;
        }
        sb.append(String.valueOf(m));

        for(int i = i_binary.size()-1;i>=0;i--){
            sb.append(i_binary.get(i));
        }


        
        System.out.println(sb);
    }
}
