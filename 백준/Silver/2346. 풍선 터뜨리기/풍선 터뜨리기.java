
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(input.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(input.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        Deque<Integer> indexQueue = new ArrayDeque<Integer>();

        int[] move = new int[N];
        for (int i = 0; i < N; i++) {
            move[i] = Integer.parseInt(stringTokenizer.nextToken());
            indexQueue.add(i);
        }

        int removeIndex = indexQueue.removeFirst();
        stringBuilder.append(removeIndex + 1).append(" ");

        while(!indexQueue.isEmpty()) {
            int step = move[removeIndex];

            if(step < 0) {
                for(int j = 0; j < -step - 1; j++) {
                    indexQueue.addFirst(indexQueue.removeLast());
                }
                removeIndex = indexQueue.removeLast();

            } else {
                for(int j = 0; j < step - 1; j++) {
                    indexQueue.addLast(indexQueue.removeFirst());
                }
                removeIndex = indexQueue.removeFirst();
            }
            stringBuilder.append(removeIndex + 1).append(" ");
        }
        System.out.println(stringBuilder);
    }
}