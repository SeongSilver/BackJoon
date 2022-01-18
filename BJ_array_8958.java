package array;

import java.util.Scanner;

public class BJ_array_8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		String[] ox = new String[t];
		
		for(int i=0;i<t;i++) {
			int count=0;
			int sum = 0;
			ox[i] = sc.next();
			for(int j=0;j<ox[i].length();j++) {
				if(ox[i].charAt(j)=='O') {
					count++;
					sum += count;
				}else if(ox[i].charAt(j)=='X'){
					count = 0;
				}
			}
			System.out.println(sum);
		}
		sc.close();
	}

}
