
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        HashMap<String,Integer> wordList = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String word = bufferedReader.readLine();
            if(word.length() >= M ) {
                if(wordList.containsKey(word)) {
                    wordList.put(word, wordList.get(word)+1);
                    continue;
                }
                wordList.put(word, 1);
            }
        }

        List<Map.Entry<String,Integer>> entryList = new ArrayList<>(wordList.entrySet());
        entryList.sort(Comparator.comparing(Map.Entry<String,Integer>::getValue,Comparator.reverseOrder())
                .thenComparing(entry -> entry.getKey().length(), Comparator.reverseOrder())
                .thenComparing(Map.Entry::getKey));

        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String,Integer> entry : entryList) {
            stringBuilder.append(entry.getKey())
                    .append("\n");
        }

        System.out.println(stringBuilder);
    }
}