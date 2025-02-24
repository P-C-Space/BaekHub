import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    private static LinkedList<Integer> stack;

    public static void pop(){
        if(stack.isEmpty()){
            return;
        }
        stack.removeLast();
    }

    public static void push(int num){
        stack.addLast(num);
    }

    public static void main(String[] args) throws IOException {
        stack = new LinkedList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < K; i++) {
            int num = Integer.parseInt(bufferedReader.readLine());
            if ( num == 0 ){
                pop();
            } else {
                push(num);
            }
        }

        System.out.println(stack.stream().mapToInt(Integer::intValue).sum());
    }
}