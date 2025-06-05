
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s  =  new Scanner(System.in);
		int size = s.nextInt();
		for(int i = 0;i<size;i++) {
			for(int j = 0;j<size;j++) {
				
				if(j<size-i-1) {
					System.out.print(" ");
				}
				else
					System.out.print("*");
			}
			System.out.println();
		}
		
		s.close();
	}

}
