package Math;

import java.util.Scanner;

public class BJ_Math2_3009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int[] count1 = {sc.nextInt(), sc.nextInt()};
		int[] count2 = {sc.nextInt(), sc.nextInt()};
		int[] count3 = {sc.nextInt(), sc.nextInt()};
		
		int x, y;
		
		if(count1[0]==count2[0]) x=count3[0];
		else if(count1[0]==count3[0]) x=count2[0];
		else x=count1[0];
		
		if(count1[1]==count2[1]) y=count3[1];
		else if(count1[1]==count3[1]) y=count2[1];
		else y=count1[1];
		
		System.out.println(x+" "+y);
		sc.close();
		
	}

}
