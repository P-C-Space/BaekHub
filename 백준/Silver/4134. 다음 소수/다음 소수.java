import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0;i<n;i++){
            long tmp = Long.parseLong(br.readLine());
            var bi = new BigInteger(String.valueOf(tmp));

            if(bi.isProbablePrime(10)){
                System.out.println(tmp);
            }
            else{
                System.out.println(bi.nextProbablePrime());
            }
        }
    }
}
