import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String binary = "";
        String binary_tmp = "";
        Long n = Long.parseLong(br.readLine());
        
        while(n > 0){
            binary = n%2 + binary;
            n /=2;
        }
        //System.out.println(binary);

        for(int i =binary.length() - 1;i>=0;i--){
            binary_tmp += binary.charAt(i);
        }

        //System.out.println(binary_tmp);

        int count = 1;
        Long result = 0L;

        for(int j = binary_tmp.length()-1;j>=0;j--)
        {
            result += (long)Character.getNumericValue(binary_tmp.charAt(j)) * count;
            count *= 2;
        }

        System.out.println(result);
    }
}
