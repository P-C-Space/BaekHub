
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int callCount;

    private static int recursion(char[] word, int l, int r) {
        callCount++;
        if(l >= r) return 1;
        else if(word[l] != word[r]) return 0;
        else return recursion(word, l + 1, r - 1);
    }

    private static int isPalindrome(char[] str){
        return recursion(str, 0,str.length-1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int N = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < N; i++) {
            callCount = 0;
            String word = bufferedReader.readLine();
            stringBuilder.append(isPalindrome(word.toCharArray()))
                    .append(" ")
                    .append(callCount)
                    .append("\n");
        }

        System.out.println(stringBuilder);
    }
}