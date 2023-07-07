import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s_binary = br.readLine();
        StringBuilder result_ob = new StringBuilder();
        boolean check_zero = false;

        if(s_binary.length() % 3 == 1){
            result_ob.append(Character.getNumericValue(s_binary.charAt(0)) * 1);
        }

        else if(s_binary.length() % 3 == 2){
            int temp = Character.getNumericValue(s_binary.charAt(0)) * 2 
                        + Character.getNumericValue(s_binary.charAt(1)) * 1;
            result_ob.append(temp);    
            if(temp > 0){
                check_zero = true;
            }
        }

        for(int i = s_binary.length()%3;i<s_binary.length();i+=3){
            int temp = Character.getNumericValue(s_binary.charAt(i)) * 4 
                        + Character.getNumericValue(s_binary.charAt(i+1)) * 2
                        + Character.getNumericValue(s_binary.charAt(i+2)) * 1;
            result_ob.append(temp);
            if(temp > 0){
                check_zero = true;
            }
        }
        if(check_zero){
            System.out.println(result_ob);
        }
        else{
            System.out.println("0");
        }

    }
} 