import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static String chess_board1[] = {"WBWBWBWB",
                                        "BWBWBWBW",
                                        "WBWBWBWB",
                                        "BWBWBWBW",
                                        "WBWBWBWB",
                                        "BWBWBWBW",
                                        "WBWBWBWB",
                                        "BWBWBWBW"};
    static String chess_board2[] = {"BWBWBWBW",
                                        "WBWBWBWB",
                                        "BWBWBWBW",
                                        "WBWBWBWB",
                                        "BWBWBWBW",
                                        "WBWBWBWB",
                                        "BWBWBWBW",
                                        "WBWBWBWB"};
    static ArrayList<String> chess;
    static int count_1;
    static int count_2;
    static void compare_chess_board(int a, int b){
        for(int i = 0;i<8;i++){
            for(int j = 0;j<8;j++){

                // 첫 번째 경우 비교
                if(chess.get(i+a).charAt(j+b) != chess_board1[i].charAt(j)){
                    count_1++;
                }
                
                // 두 번째 경우 비교
                if(chess.get(i+a).charAt(j+b) != chess_board2[i].charAt(j)){
                    count_2++;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int min = 64;

        chess = new ArrayList<String>();

        for(int i = 0;i<N;i++){
            chess.add(br.readLine());
        }

        for(int i =0;i < N-7;i++){
            for(int j = 0;j< M-7;j++){
                int temp;
                count_1 = 0;
                count_2 = 0;
                compare_chess_board(i, j);
                
                temp = count_1 <= count_2 ? count_1 : count_2;
                min = min <= temp ? min : temp;
            }
        }

        System.out.println(min);
        
    }
}
