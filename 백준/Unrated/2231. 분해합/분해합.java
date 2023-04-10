import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int len = String.valueOf(N).length();
        int start = 0;
        int result = 0;
        if(len >= 3){
            start = N - (len * 9);
        }

        for(int i = start;i<N;i++){
            int sum = 0;
            sum += i;

            String tmp = String.valueOf(i);
            for(int j = 0;j<tmp.length();j++){
                sum += Character.getNumericValue((tmp.charAt(j)));    
            }

            if(N == sum){
                result = i;
                break;
            }
        }
        System.out.println(result);
        s.close();
    }
}
