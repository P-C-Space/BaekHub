import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static ArrayList<Integer> arr = new ArrayList<Integer>();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int sum = 0;
        for(int i = 0;i<5;i++){
            arr.add(Integer.parseInt(br.readLine()));
            sum += arr.get(i);
        }

        Collections.sort(arr);

        sb.append((int)sum/5).append("\n").append(arr.get(2));
        System.out.println(sb);
    }
}
