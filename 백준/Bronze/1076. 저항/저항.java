import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static String[] color = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
    static String[] m = {"","0","00","000","0000","00000","000000","0000000","00000000","000000000"};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String value = "";
        for(int i = 0;i<3;i++){
            String tmp = br.readLine();
            if(i < 2){
                for(int j=0;j<color.length;j++){
                    if(color[j].equals(tmp)){
                        value += j;
                        break;
                    }
                }
            }
            else{
                if(Integer.parseInt(value) == 0){
                    value = "0";
                    break;
                }
                for(int j=0;j<color.length;j++){
                    if(color[j].equals(tmp)){
                        value = String.valueOf(Integer.parseInt(value));
                        value += m[j];
                        break;
                    }
                }
            }
        }
        
        System.out.println(value);
        br.close();
    }
}
