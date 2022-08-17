package Math;

import java.util.Scanner;

public class BJ_Math2_1002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		
		
		for(int i=0;i<test;i++) {
			int x1 =sc.nextInt(), y1=sc.nextInt(), r1=sc.nextInt(), x2=sc.nextInt(), y2=sc.nextInt(), r2=sc.nextInt();
			double d = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
			
			if(x1==x2 && y1==y2 && r2==r1) System.out.println("-1");
			else if(d==r1+r2 || d==Math.abs(r2-r1)) System.out.println("1");
			else if(d>r1+r2 || d<Math.abs(r2-r1) || d==0) System.out.println("0");
			else System.out.println("2");
			}
			
			
		}
	

}
