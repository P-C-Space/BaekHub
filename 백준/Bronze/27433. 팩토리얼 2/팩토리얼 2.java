import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(factorial(Long.parseLong(br.readLine())));
    }

    static Long factorial(Long n){
        if(n <= 1)
        {
            return 1L;
        }
        return n * factorial(n-1);
    }
}
