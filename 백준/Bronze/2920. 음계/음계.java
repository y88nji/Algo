import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String result = str.replace(" ", "");
		if (result.equals("12345678"))
			System.out.println("ascending");
		else if(result.equals("87654321"))
			System.out.println("descending");
		else
			System.out.println("mixed");
	}

}