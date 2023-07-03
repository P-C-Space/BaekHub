import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static String sixteen_alpha(int n){
        switch(n){               
            case 10:           
                return "A";                    
            case 11:            
                return "B";                           
            case 12:          
                return "C";
            case 13:             
                return "D";
            case 14:                 
                return "E";
            case 15: 
                return "F";
            default: 
                return String.valueOf(n);
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        ArrayList<String> i_trans = new ArrayList<>();
        if(n >= 11){
            while(m >= n){
                i_trans.add(sixteen_alpha(m % n));
                m = m / n;
            }
            i_trans.add(String.valueOf(sixteen_alpha(m)));
        }

        else{
            while(m >= n){
                i_trans.add(String.valueOf(m % n));
                m = m / n;
            }
            i_trans.add(String.valueOf(m));
        }


        for(int i = i_trans.size() - 1;i >= 0;i--){
            sb.append(i_trans.get(i));
        }

        System.out.println(sb);
    }
}
