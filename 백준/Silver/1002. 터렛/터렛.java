import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int x1, y1, r1, x2, y2, r2; // 좌표 값 및 거리
        
        double distance; // 거리

        int N = s.nextInt();

        for(int i =0;i<N;i++){
            x1 = s.nextInt();
            y1 = s.nextInt();
            r1 = s.nextInt();
            x2 = s.nextInt();
            y2 = s.nextInt();
            r2 = s.nextInt();
            // 제곱
            distance = Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2);
            // 제곱근
            distance = Math.sqrt(distance);

            if((r1 == r2) && (x1 == x2) && (y1 == y2)){    // 완전 일치
                System.out.println("-1");
            }
            // abs 절대값
            else if(distance == (r1 + r2) || Math.abs((r2-r1)) == distance){
                System.out.println("1");
            }
            else if(Math.abs((r2-r1)) < distance && distance < (r1+r2)){
                System.out.println("2");
            }
            else{                       // 만나지 않음
                System.out.println("0"); 
            }
        }


        s.close();

    }
}
