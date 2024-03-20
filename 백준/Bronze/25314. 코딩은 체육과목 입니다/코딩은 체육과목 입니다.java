import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int repeat = size / 4;
		
		for(int i = 0; i < repeat; i++) {
			System.out.print("long ");
		}
		System.out.println("int");
	}

}