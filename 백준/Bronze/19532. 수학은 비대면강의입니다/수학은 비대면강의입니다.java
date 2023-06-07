import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int a,b,c,d,e,f;
    
    static boolean equation(int x,int y){
        if( ((a * x + b * y) == c) && ((d * x + e * y) == f) ){
            return true;
        } 
        return false;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        f = Integer.parseInt(st.nextToken());



        for(int i = -999;i<=999;i++){
            for(int j = -999;j<=999;j++){
                if(equation(i, j)){
                    System.out.println(i + " " + j);
                    break;
                }
            }
        }

    }
}
