import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static ArrayList<Integer> arr = new ArrayList<Integer>();  
    static boolean factor_check(int n){
        for(int j = 2;j<n;j++){
            // 어떤 수라도 나눠지면 소수가 아님
            if(n % j == 0){
                return false;
            }
        }
        arr.add(n);
        return true;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i =M;i<=N;i++){
            // 1보다 큰 자연수
            if(i > 1){
                factor_check(i);
            }
        }

        if(arr.size() == 0)
        {
            System.out.println("-1");
        }
        else{
            int sum = 0;
            for(int i =0;i<arr.size();i++){
                sum += arr.get(i);
            }
            sb.append(sum).append("\n").append(arr.get(0));
            System.out.println(sb);
        }
    }
}
