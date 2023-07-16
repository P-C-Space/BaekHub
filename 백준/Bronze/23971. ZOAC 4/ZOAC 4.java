import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken()); // H 행 height
        int W = Integer.parseInt(st.nextToken()); // 행마다 W개씩 width

        int N = Integer.parseInt(st.nextToken()); // 세로 칸
        int M = Integer.parseInt(st.nextToken()); // 가로 칸 차이

        System.out.println((((H - 1) / (N + 1)) + 1) * (((W - 1) / (M + 1)) + 1) );
        
        // 해당하는 칸 + 비우고 앉아야하는 칸 => 묶어서 취급
        // 한칸에 최대로 작용 -> 5 / 2 = 2 or 4 / 2 = 2 4칸이든 5칸이든 최대로 작용할 수 있는 것은 두칸 
        // 대각선도 포함 똑같이 한칸으로 취급 -> 일정한 패턴
        // 1 1일때
    }
}
