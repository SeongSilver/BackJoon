package Math;

import java.util.Scanner;

public class BJ_Math1_1193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int line = 1;
		int count = 0;
		
		while(count<=x) {
			for(int i=1;i<=line+1;i++) {
				count++;
			}
			line++;
		}
		
		
		if(count%2==0) {System.out.println();}
		else {System.out.println();}
		
		
		
	}

}
