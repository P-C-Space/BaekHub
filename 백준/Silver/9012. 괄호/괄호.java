import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int i_count = 0;
        i_count = Integer.parseInt(br.readLine());

        for(int i = 0;i<i_count;i++){
            sb.append(isVPS(br.readLine())).append("\n");
        }
        System.out.println(sb);
    }

    public static String isVPS(String s){
        Stack<Character> st = new Stack<>();

        for(int i =0 ;i<s.length();i++){
            char c = s.charAt(i);

            if(c == '('){
                st.push(c);
            }
            else{
                if(st.isEmpty()){
                    return "NO";
                }
                st.pop();
            }
        }   

        if(st.isEmpty()){
            return "YES";
        }
        return "NO";
    
    }
}

