import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int hour = scanner.nextInt();
		int minute = scanner.nextInt();
		
		if(minute < 45) {
			hour = hour - 1;
			if(hour < 0) {
				hour = 23;
			}
			minute = (60 - 45) + minute;
			if (minute == 60) {
				minute = 0;
				hour = hour + 1;
			}
			System.out.println(hour + " " + minute);
		} else {
			minute = minute - 45;
			System.out.println(hour + " " + minute);
		}
		
	}
}