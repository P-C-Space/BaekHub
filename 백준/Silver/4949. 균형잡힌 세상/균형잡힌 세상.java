
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    private static LinkedList<String> delimStack;

    private static void push(String delim){
        delimStack.addLast(delim);
    }

    private static String pop(){
        return delimStack.isEmpty() ? " " : delimStack.removeLast();
    }


    public static void main(String[] args) throws IOException {
        delimStack = new LinkedList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        boolean isPerfect;
        StringTokenizer stringTokenizer;

        while (true) {
            isPerfect = true;
            delimStack.clear();
            String sentence = bufferedReader.readLine();

            if(sentence.equals(".")) break;

            stringTokenizer = new StringTokenizer(sentence,"([)]",true);


            while(stringTokenizer.hasMoreTokens()) {

                String token = stringTokenizer.nextToken();

                if (token.equals("(") || token.equals("[")) {
                    push(token);
                }
                else if (token.equals(")")) {
                    if (!pop().equals("(")) {
                        isPerfect = false;
                        break;
                    }
                }
                else if (token.equals("]")) {
                    if (!pop().equals("[")) {
                        isPerfect = false;
                        break;
                    }
                }
            }

            if (!delimStack.isEmpty()) isPerfect = false;


            stringBuilder.append(isPerfect ? "yes\n" : "no\n");
        }

        System.out.println(stringBuilder);
    }
}