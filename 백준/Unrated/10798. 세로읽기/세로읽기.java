import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String word[] = new String[5];
        int maxLine = 0;
        for(int i =0;i<5;i++){
            word[i] = s.nextLine();
            if(maxLine <= word[i].length()){
                maxLine = word[i].length();
            }
        }

        // for(int i =0;i<5;i++){
        //     System.out.println(word[i]);
        // }

        for(int i =0;i<maxLine;i++){
            for(int j = 0;j<5;j++){
                if(i<word[j].length()){
                    System.out.print(word[j].charAt(i));
                }
            }
        }
        
        s.close();
    }
}
