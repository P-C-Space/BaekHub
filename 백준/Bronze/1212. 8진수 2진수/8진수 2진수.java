import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            String binaryDigit = Integer.toBinaryString(Character.getNumericValue(c));
            
            // 이후의 숫자는 0추가
            if (i != 0) {
                while (binaryDigit.length() < 3) {
                    binaryDigit = "0" + binaryDigit;
                }
            }
            
            sb.append(binaryDigit);
        }
        
        System.out.println(sb);
    }
}