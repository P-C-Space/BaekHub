
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s  =  new Scanner(System.in);
		int size = s.nextInt();
		for(int i =1;i<=size;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		s.close();
	}

}
