package strArr;

import java.util.Scanner;

public class BJ_strArr_1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine().toUpperCase();
		int[] count = new int[26];
		
		int max = 0;
		char result = 'a';
		
		for(int i=0;i<s.length();i++) {
			count[s.charAt(i)-65]++;
			if(max<count[s.charAt(i)-65]) {
				max = count[s.charAt(i)-65];
				result = s.charAt(i);
			} else if(max==count[s.charAt(i)-65]) {
				result = '?';
			}
		}
		System.out.println(result);
		sc.close();
	}
}
