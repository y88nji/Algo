import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i =0; i < n; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int sum = A+B;
			System.out.println("Case #" + (i+1) + ": " + A + " + " + B + " = " + sum);
		}
	}

}