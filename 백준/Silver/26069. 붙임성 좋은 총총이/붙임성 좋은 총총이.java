
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        int N = Integer.parseInt(bufferedReader.readLine());

        HashSet<String> rainbowDanceHumans = new HashSet<>();

        rainbowDanceHumans.add("ChongChong");
        for (int i = 0; i < N; i++) {
           stringTokenizer = new StringTokenizer(bufferedReader.readLine());
           String firstPerson = stringTokenizer.nextToken();
           String secondPerson = stringTokenizer.nextToken();

           if(rainbowDanceHumans.contains(firstPerson) || rainbowDanceHumans.contains(secondPerson)) {
               rainbowDanceHumans.add(firstPerson);
               rainbowDanceHumans.add(secondPerson);
           }
        }

        System.out.println(rainbowDanceHumans.size());

    }
}