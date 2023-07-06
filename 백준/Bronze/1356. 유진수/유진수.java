import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int count = 1;
        boolean is_unum = false;
        
        while(count < s.length()){
            //System.out.println("count : " + count + "\ns.length : " + s.length());
            String num1 = s.substring(0, count);
            String num2 = s.substring(count,s.length());
            
            // System.out.println(num1);
            // System.out.println(num2);
            Long sum1 = 1L;
            Long sum2 = 1L;
            for(int i =0;i<num1.length();i++){
                sum1 *= (Character.getNumericValue(num1.charAt(i)));
            }

            for(int j = 0;j<num2.length();j++){
                sum2 *= (Character.getNumericValue(num2.charAt(j)));
            }

            // System.out.println(sum1);
            // System.out.println(sum2);
            // equals 사용 참조객체의 비교 수행
            if(sum1.equals(sum2)){
                is_unum = true;
                break;
            }
        
            count++;
        }

        if(is_unum){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        
    }
}
