import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int entryNumber = 1;

        boolean canEat = true;

        for(int i = 0;i < N;i++){
            int num = Integer.parseInt(stringTokenizer.nextToken());

            if(num == entryNumber) {
                entryNumber++;
            } else {
                while (!stack.isEmpty() && stack.peek() == entryNumber) {
                    stack.pop();
                    entryNumber++;
                }
                stack.push(num);
            }
        }

        while(!stack.isEmpty()) {
            if (stack.pop() != entryNumber++) {
                canEat = false;
                break;
            }
        }
        System.out.println(canEat ? "Nice" : "Sad");

    }


}
