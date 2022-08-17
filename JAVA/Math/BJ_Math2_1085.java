package Math;

import java.util.Scanner;

public class BJ_Math2_1085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(), y=sc.nextInt(), w=sc.nextInt(), h=sc.nextInt();
		int[] comparison = {x, y, w-x, h-y};
		
		if((w>=1 && w<=1000) && (h>=1 && h<=1000)) {
			sort(comparison);
			System.out.println(comparison[0]);
		}
	}
	
	public static void sort(int[] comparison) {
		int min = 1000;
		int max = 0;
		
		for(int i=0;i<comparison.length;i++) {
			for(int j=0;j<comparison.length;j++) {
				if(comparison[i]<comparison[j]) {
					int tmp;
					tmp = comparison[i];
					comparison[i] = comparison[j];
					comparison[j] = tmp;
				}
			}
		}
	
	}

}
