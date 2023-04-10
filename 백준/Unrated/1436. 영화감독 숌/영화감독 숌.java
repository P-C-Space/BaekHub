import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cnt = 1665;
        int series = 1;
        int tmp = s.nextInt();
        if(tmp == series){
            System.out.println(666);
        }
        else{
            while(series != tmp){
                cnt++;
                if(String.valueOf(cnt).contains("666")){
                    series++; 
                }
            }
            System.out.println(cnt);
        }
        s.close();
    }
}
