import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<Integer> arr = new ArrayList<>();
        int result = 0;
        for (int i =0;i<3;i++){
            arr.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(arr);

        if( arr.get(0) + arr.get(1) > arr.get(2)){
            for(int i =0;i<3;i++){
                result += arr.get(i);
            }
        }

        else{
            result = (arr.get(0) + arr.get(1)) * 2 - 1;
        }
        System.out.println(result);
    }
}
