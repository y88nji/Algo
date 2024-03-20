import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			String str = sc.next();
			
			for(int i = 0; i<str.length(); i++) {
				for(int j = 0; j < N; j++) {
					System.out.print(str.charAt(i));
				}			
			}
			System.out.println();
		}
		
	}

}