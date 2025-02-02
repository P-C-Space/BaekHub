import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    private static final LinkedList<Integer> list = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int num = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer;

        String command;

        for (int i = 0; i < num; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            command = stringTokenizer.nextToken();

            if (command.equals("1")) {
                push(Integer.parseInt(stringTokenizer.nextToken()));
            } else if (command.equals("2")) {
                stringBuilder.append(pop())
                        .append("\n");
            } else if (command.equals("3")) {
                stringBuilder.append(list.size())
                        .append("\n");
            } else if (command.equals("4")) {
                stringBuilder.append(isEmpty())
                        .append("\n");
            } else if (command.equals("5")) {
                stringBuilder.append(peek())
                        .append("\n");
            }

        }
        System.out.println(stringBuilder);
    }

    private static int isEmpty() {
        if (list.isEmpty()) {
            return 1;
        }
        return 0;
    }

    private static Integer peek() {
        if (list.isEmpty()) {
            return -1;
        }
        return list.getFirst();
    }

    private static Integer pop() {
        if (list.isEmpty()) {
            return -1;
        }
        return list.removeFirst();
    }

    private static void push(int num) {
        list.addFirst(num);
    }
}