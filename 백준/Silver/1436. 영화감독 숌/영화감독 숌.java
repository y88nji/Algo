import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int count = 0;
		
		for(int i = 0; i <= Integer.MAX_VALUE; i++) {
			String number = i + "";
			
			if(number.contains("666")) {
				count++;
			}
			
			if(count == N) {
				System.out.println(number);
				break;
			}
		}

	}

}