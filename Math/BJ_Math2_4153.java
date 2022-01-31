package Math;

import java.util.Scanner;

public class BJ_Math2_4153 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
			int a = sc.nextInt(), b = sc.nextInt(), c=sc.nextInt();

			if(a==0 && b==0 && c==0) break;
			
			int max = Math.max(Math.max(a,  b), c);
			
			if(max==a && a*a==(b*b+c*c)) 	System.out.println("right");
			else if(max==b && b*b==(a*a+c*c))	System.out.println("right");
			else if(max==c && c*c==(a*a+b*b)) System.out.println("right");
			else System.out.println("wrong");
			
		}
		
		sc.close();
	}

}
