import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

    static int biSearch(int[] arr,int s,int e,int check){ // 배열 , 첫번째, 끝값, 찾을 값

        if(s<= e){
            int mid = (s+e)/2;

            if(arr[mid] == check){ // 탐색 성공
                return 1;
            }

            if(arr[mid] < check){
                return biSearch(arr, mid+1, e, check);
            }
            else{
                return biSearch(arr, s, mid-1, check);
            }
        }
        else{
            return 0;
        }

    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        // 첫번째 카드 생성
        int N = Integer.parseInt(br.readLine());
        int card1[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i =0;i<N;i++){
            card1[i] = Integer.parseInt(st.nextToken());
        }

        // 두번째 카드 생성 및 비교
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        
        // 이진 정렬을 위해 정렬
        Arrays.sort(card1);

        for(int i =0;i<M;i++){
            sb.append(biSearch(card1,0,N-1,Integer.parseInt(st.nextToken()))).append(" ");
        }

        System.out.println(sb);
        br.close();
    }
}
