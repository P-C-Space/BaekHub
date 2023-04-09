import java.util.Scanner;

public class Main {
    public static void giveChange(int tmp){
        int q,d,n,p;

        q = tmp / 25;
        tmp = (tmp-q*25);
        d = tmp / 10;
        tmp = tmp - d*10;
        n = tmp / 5;
        p = tmp - n*5;
        
        System.out.println(q+" "+d+" " + n+" "+p);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();

        for(int i =0;i<N;i++){
            int tmp = s.nextInt();

            giveChange(tmp);
        }

        s.close();
    }   
}
