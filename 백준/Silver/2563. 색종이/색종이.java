import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
        int N = Integer.parseInt(br.readLine());

        int x=0,y=0;
        int colorpaper[][] = new int[101][101]; // 0-100까지 
        int area = 0;

        for(int i =0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");

            x = Integer.parseInt(st.nextToken()); // x 값 저장
            y = Integer.parseInt(st.nextToken()); // y 값 저장

            for(int j = x;j < x+10;j++){
                for(int k = y;k < y+10;k++){
                    colorpaper[j][k] = 1;
                }
            }
        }
        for(int i =0;i<101;i++){
            for(int j = 0;j<101;j++){
                if(colorpaper[i][j] == 1){
                    area++;
                }
            }
        }

        System.out.println(area);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
