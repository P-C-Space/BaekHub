import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // 0 -> 1 -> 2 -> 3 -> 4 -> 5
        // 4 -> 9 -> 25 -> ? -> ? -> 1089
        // 2 -> 3 -> 5  -> ? -> ? -> 33
        //   1    2     4    8    16
        Scanner s = new Scanner(System.in);
        int start = 2;
        int n = s.nextInt();
        
        for(int i = 0;i<n;i++){
            start += Math.pow(2,i);
        }
        

        System.out.println((int)Math.pow(start,2));
        s.close();
    }
}
