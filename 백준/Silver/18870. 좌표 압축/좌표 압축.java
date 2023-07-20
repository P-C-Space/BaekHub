import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n;i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        int [] temp = array.clone(); // 복사

        Arrays.sort(temp); // 복사한 값 정렬

        //  정렬된 숫자에 맞춰 랭크 0순위부터
        HashMap<Integer,Integer> rankMap = new HashMap<>();
        int rank = 0;
        for(int j = 0;j<n;j++){
            if(j > 0 && temp[j] > temp[j-1]){
                rank++;
            }
            rankMap.put(temp[j], rank);
        }

        for(int k =0;k<n;k++){
            sb.append(rankMap.get(array[k])).append(" ");
        }

        System.out.println(sb);
    }
}
