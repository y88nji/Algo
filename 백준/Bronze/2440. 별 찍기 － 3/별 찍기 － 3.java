import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			int num = sc.nextInt();
			for (int j = 0; j < num; j++) {
				for(int i = num-j; i >= 1; i--) {
					System.out.print("*");
				}
				System.out.println();
			}		
	}

}