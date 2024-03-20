import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String str = sc.next();
			if(str.equals("0")) break;
			
			boolean check = true;
			for(int i =0; i < str.length()/2; i++) {
				if(str.charAt(i) !=  str.charAt(str.length()-1-i)) {
					check = false;
					break;
				}
			}
			
			if(check == false) {
				System.out.println("no");
			} else {
				System.out.println("yes");
			}
		}
	}

}