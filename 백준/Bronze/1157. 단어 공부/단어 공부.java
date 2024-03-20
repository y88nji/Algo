import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		str = str.toUpperCase();

		char[] alphabet = new char[26];
		int[] arr = new int[26];
		// 배열의 길이만큼 i값 증가
		for (int i = 0; i < alphabet.length; i++) {
			// ASCII Code를 char로 형변환하여 배열에 담기
			alphabet[i] = (char) (65 + i);
		}
		
		
		for (int i = 0; i < str.length(); i++) {
			for(int j = 0; j < alphabet.length; j++) {
				if(str.charAt(i) == alphabet[j]) {
					arr[j] += 1;
				}
			}
		}
		char ch = '?';
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				ch = alphabet[i];
			} else if (max == arr[i]) {
				ch = '?';
			}
		}
		System.out.println(ch);

	}

}