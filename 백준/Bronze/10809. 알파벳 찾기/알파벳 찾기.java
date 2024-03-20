import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int[] indexNum = new int [alphabet.length];
		Arrays.fill(indexNum, -1);

		
		for(int i = 0; i<str.length(); i++) {
			for(int j = 0; j < alphabet.length; j++) {
				if(indexNum[j] == -1 && str.charAt(i) == alphabet[j]) {
					indexNum[j] = i;
				}
			}
		}
		
		for(int i = 0; i < indexNum.length; i++) {
			System.out.print(indexNum[i] + " ");
		}
	}
}