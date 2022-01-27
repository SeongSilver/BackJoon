package strArr;

import java.util.Scanner;

public class BJ_strArr_2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] croatia ={"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		String test = sc.next();
		int count = 0;
		for(int i=0; i<croatia.length;i++) {
			if(test.contains(croatia[i])) {
				test= test.replace(croatia[i], "a");
			}
		}
		System.out.println(test.length());
	
	}

}
