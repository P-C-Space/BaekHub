import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    static ArrayList<Integer> arr = new ArrayList<>();

    static void Factorization(int n){
        if(n > 1){
            for(int i =2;i<=n;i++){
                if(n % i == 0){
                    arr.add(i);
                    Factorization(n /= i);
                    break;
              }
            }
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        Factorization(n);
        
        for(var i : arr){
            sb.append(i).append("\n");
        }
        System.out.print(sb);
    }
}
