import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int arr[][] = new int[n][2];


        for(int i = 0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }


        // 람다식
        // arr 배열에 arr1, arr2에 대해 정렬
        // ex)  arr1 -> arr[0][]
        //      arr2 -> arr[1][]
        //      x라인이 같으면 y값 정렬
        //      아니면 x라인 정렬
        Arrays.sort(arr, (arr_1, arr_2) -> {

			if(arr_1[0] == arr_2[0])  {
				return arr_1[1] - arr_2[1];
			}
			else {
				return arr_1[0] - arr_2[0];	
			}
		});

        for(int i =0;i<n;i++){
            sb.append(arr[i][0] + " " + arr[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}
