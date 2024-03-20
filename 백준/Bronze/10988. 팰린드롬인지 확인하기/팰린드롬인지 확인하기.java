import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int result = 0;
		int i = 0;
		while (i <= str.length()/2) {
			if (str.charAt(i) == str.charAt(str.length()-1-i))
				result = 1;
			else {
				result = 0;
				break;
			}
				
			i++;
		}
		
		System.out.println(result);
	}
}