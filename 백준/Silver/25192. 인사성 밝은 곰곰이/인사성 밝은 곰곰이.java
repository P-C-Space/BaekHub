import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int recordCount = Integer.parseInt(bufferedReader.readLine());

        int bearGreetCount = 0;

        HashSet<String> nickNames = new HashSet<>();

        for (int i = 0; i < recordCount; i++) {

            String line = bufferedReader.readLine();

            if(line.equals("ENTER")) {
                nickNames = new HashSet<>();
                continue;
            }
            
            if(!nickNames.contains(line)){
                nickNames.add(line);
                bearGreetCount++;
            }
        }

        System.out.println(bearGreetCount);
    }
}
