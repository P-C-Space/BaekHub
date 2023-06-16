import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        // 시험장의 개수 N
        // 각 시험장 응시자 수 A
        // 총 감독관 감시 B
        // 부 감독관 감시 C
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        int A[] = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i =0;i<N;i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        st  = new StringTokenizer(br.readLine());

        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        long l_superior = N;

        for(int i =0;i<N;i++){
            A[i] -= B;
            if(A[i] <= 0){ // 만약 A수가 작다면
                continue;
            }
            l_superior += (A[i]/C);
            
            if(A[i]%C != 0){
                l_superior++;
            }
            
        }

        System.out.println(l_superior);
    }
}
