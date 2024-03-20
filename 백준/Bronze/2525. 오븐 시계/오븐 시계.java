import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int cooking = sc.nextInt();
		
		int sum = minute + cooking;
		if (sum >= 60) {
			int temp = 0;
			temp = sum / 60;
			hour += temp;
			if (hour >= 24) {
				hour = hour - 24;
			}
			minute = sum - 60 * temp;
			System.out.println(hour + " " + minute);
		} else {
			minute = sum;
			System.out.println(hour + " " + minute);
		}
		
		
	}

}