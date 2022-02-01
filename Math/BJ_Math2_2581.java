package Math;

import java.util.Scanner;

public class BJ_Math2_2581 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt(), N=sc.nextInt(), sum=0, min=N;
		
		x: for(int i=M;i<=N;i++) {
			if(i==1) continue;	//1은 소수가 아니라서 continue
			for(int j=2;j<i;j++) {	
				// 밖의 for문을 x :로 두면 continue x했을 때 바깥의 x for문에 대한 continue가 실행됌
				if(i%j==0) continue x;	//M이 M아래의 수로 나누었을 때 나머지가 없다면 소수가 아니라서 continue
			}
			sum+=i;
			if(min>i) min=i;
		
		}
		if(sum==0) System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}

