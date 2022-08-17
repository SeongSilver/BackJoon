package Math;

import java.util.Scanner;

public class BJ_Math2_1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), count=0, sosucount=0;
		
		
		for(int i=0;i<N;i++) {
			int N2 = sc.nextInt();
			sosucount=0;
			for(int j=1;j<=N2;j++) {
				if(N2%j==0) sosucount++;
				
			}
			if(sosucount==2)count++;
		}
		System.out.println(count);
		sc.close();
	}

}
