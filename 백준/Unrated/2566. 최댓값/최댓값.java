import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[][] = new int[9][9];
        int max = 0;
        int x=0,y=0;
        for(int i =0;i<9;i++){
            for(int j = 0;j<9;j++){
                int tmp = s.nextInt();
                if(tmp>=max){
                    max = tmp;
                    x = i+1;
                    y = j+1;
                }
                arr[i][j] = tmp;
            }
        }
        System.out.println(max);
        System.out.println(x + " " + y);
        s.close();
    }
}
