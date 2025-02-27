
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Queue<Integer> queue = new LinkedList<Integer>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<");
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());


        for(int i = 0; i < N; i++) {
            queue.add(i + 1);
        }
        int count = 0;

        while(1 < queue.size()) {
            count++;
            if(count % K == 0){
                stringBuilder.append(queue.remove() + ", ");
                continue;
            }
            queue.add(queue.remove());
        }

        stringBuilder.append(queue.remove() + ">");
        System.out.println(stringBuilder);

    }
}