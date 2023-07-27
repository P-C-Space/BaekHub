import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> decompose_word = new HashSet<>();
        String word = br.readLine();
        for(int i = 1;i<=word.length();i++){
            for(int j = 0;j<=word.length()-i;j++){
                // System.out.println(word.substring(j, j+i));
                decompose_word.add(word.substring(j, j+i));
            }
        }

        // System.out.println("Hashset");
        // for(String s : decompose_word){
        //     System.out.println(s);
        // }
        System.out.println(decompose_word.size());
    }
}
