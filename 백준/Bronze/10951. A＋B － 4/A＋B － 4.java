import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int sum = A+B;
			System.out.println(sum);
		}
		
	}

}