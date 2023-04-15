import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);

        String tmp = s.nextLine();

        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i =0;i<tmp.length();i++){
            arr.add(Character.getNumericValue(tmp.charAt(i)));
        }

        Collections.sort(arr,Collections.reverseOrder());

        for(int i : arr){
            sb.append(i);
        }

        System.out.println(sb);
        s.close();
    }
}
