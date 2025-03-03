
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Deque<String> queue = new ArrayDeque<>();
        StringBuilder stringBuilder = new StringBuilder();
        int N = Integer.parseInt(bufferedReader.readLine());


        String[] dataStructureString = bufferedReader.readLine().split(" ");
        String[] valueString = bufferedReader.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            int type = Integer.parseInt(dataStructureString[i]);
            if(type == 0){
                queue.addLast(valueString[i]);
            }
        }

        int M = Integer.parseInt(bufferedReader.readLine());
        String[] addValueString = bufferedReader.readLine().split(" ");

        for (int i = 0; i < M; i++) {
            queue.addFirst(addValueString[i]);
            stringBuilder.append(queue.removeLast()).append(" ");
        }
        System.out.println(stringBuilder);
    }
}