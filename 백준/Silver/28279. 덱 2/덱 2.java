
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    private static Deque<Integer> queue;

    private static int isEmpty(){
        return queue.isEmpty() ? 1 : 0;
    }

    private static void addFirst(int num) {
        queue.addFirst(num);
    }

    private static void addLast(int num) {
        queue.addLast(num);
    }

    private static int size(){
        return queue.size();
    }

    private static int removeFirst() {
        return queue.isEmpty() ? -1 : queue.removeFirst();
    }

    private static int removeLast() {
        return queue.isEmpty() ? -1 : queue.removeLast();
    }

    private static int getFirst() {
        return queue.isEmpty() ? -1 : queue.getFirst();
    }

    private static int getLast() {
        return queue.isEmpty() ? -1 : queue.getLast();
    }


    public static void main(String[] args) throws IOException {
        queue = new ArrayDeque<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer;

        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int command = Integer.parseInt(stringTokenizer.nextToken());

            switch (command) {
                case 1:
                    addFirst(Integer.parseInt(stringTokenizer.nextToken()));
                    break;
                case 2:
                    addLast(Integer.parseInt(stringTokenizer.nextToken()));
                    break;
                case 3:
                    stringBuilder.append(removeFirst() + "\n" );
                    break;
                case 4:
                    stringBuilder.append(removeLast() + "\n" );
                    break;
                case 5:
                    stringBuilder.append(size() + "\n" );
                    break;
                case 6:
                    stringBuilder.append(isEmpty() + "\n" );
                    break;
                case 7:
                    stringBuilder.append(getFirst() + "\n" );
                    break;
                case 8:
                    stringBuilder.append(getLast() + "\n" );
                    break;
            }
        }
        System.out.println(stringBuilder);

    }
}