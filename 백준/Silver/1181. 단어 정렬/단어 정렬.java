import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());

            StringBuilder sb = new StringBuilder();
            ArrayList<String> arr = new ArrayList<String>();

            boolean ch = false;

            for(int i = 0;i<N;i++){
                ch = false;

                String tmp = br.readLine();
                
                for(String t : arr){
                    if(t.equals(tmp)){
                        ch = true;
                    }
                }
                if(!ch){
                    arr.add(tmp);
                }
            }
            Collections.sort(arr);
            // String 문자열 :: 길이로 정렬
            Collections.sort(arr,Comparator.comparing(String::length));

            for(int i = 0;i<arr.size();i++){
                sb.append(arr.get(i)).append("\n");
            }

            System.out.println(sb);

    }
}
