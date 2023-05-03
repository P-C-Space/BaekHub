import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int arr[] = new int[3];
            int max = 0;
            int sum = 0;
            
            for(int i = 0;i<3;i++){
                arr[i] = Integer.parseInt(st.nextToken());
                if(arr[i] > max){
                    max = arr[i];
                }
                sum += arr[i];
            }

            // 삼각형 세변의 합 - 가장 큰값 => 두변의 합
            sum -= max;

            if(arr[0] == 0 && arr[1] == 0 && arr[1]== arr[2]){
                break;
            }  

            if(sum <= max){ // 삼각형 불가능
                System.out.println("Invalid");
            }
            else{ // 삼각형 가능
                if(arr[0]==arr[1] && arr[1] == arr[2]){
                    // 세변이 같음
                    System.out.println("Equilateral");
                }
                else if(arr[0] == arr[1] || arr[1] == arr[2] || arr[2] == arr[0]){
                    // 두변만 같음
                    System.out.println("Isosceles");
                }
                else{
                System.out.println("Scalene");
                }
            }
        }
    }
}