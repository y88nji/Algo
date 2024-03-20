import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int totalAmount = sc.nextInt();
		int types = sc.nextInt();
		int checkTotalAmount = 0;
		
		for(int i = 0; i<types; i++) {
			int amount = sc.nextInt();
			int quantity = sc.nextInt();
			checkTotalAmount += amount * quantity;
		}
		
		if (totalAmount == checkTotalAmount) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}