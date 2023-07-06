import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    // 십진수로 바꾸면되는데 왜 이건 안되냐
    // static String addBinary(String a,String b){
    //     String return_binary = "";
    //     int carry = 0;

    //     // 자릿수
    //     if(a.length() > b.length()){  // a가 길다면
    //         int tmp = a.length() - b.length();
    //         for(int i =0;i<tmp;i++){
    //             b = "0" + b;
    //         }
    //     }
    //     else{ // b가 길다면
    //         int tmp = b.length() - a.length();
    //         for(int j = 0;j<tmp;j++){
    //             a = "0" + a;
    //         }
    //     }

    //     for(int k = a.length()-1;k >= 0 ;k--){
    //         if(a.charAt(k) == '0' && b.charAt(k) == '0'){
    //             if(carry == 1){
    //                 return_binary = "1" + return_binary;
    //                 carry = 0;
    //             }
    //             else{
    //                 return_binary = "0" + return_binary;                    
    //             }
    //         }

    //         else if(a.charAt(k) == '1' && b.charAt(k) == '1'){
    //             if(carry == 1){
    //                 return_binary = "1" + return_binary;
    //             }
    //             else{
    //                 return_binary = "0" + return_binary;                    
    //             }
    //         }

    //         else{
    //             if(carry == 1){
    //                 return_binary = "0" + return_binary;
    //             }
    //             else{
    //                 return_binary = "1" + return_binary;                    
    //             }
    //         }
    //     }
        
    //     if(return_binary.charAt(0) != '1'){
    //         int count = 0;
    //         while(count < return_binary.length()){
    //             if(return_binary.charAt(count) == '1'){
    //                 break;
    //             }
    //             count++;
    //         }
    //         if(count == return_binary.length()){
    //             return "0";
    //         }
    //         return return_binary.substring(count, return_binary.length());
    //     }

    //     return return_binary;
    // }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger a = new BigInteger(st.nextToken(),2);
        BigInteger b = new BigInteger(st.nextToken(),2);

        BigInteger sum = a.add(b);

        String result_binary = sum.toString(2);

        System.out.println(result_binary);
    }
}
