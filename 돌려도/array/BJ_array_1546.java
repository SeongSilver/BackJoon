package array;

import java.util.Scanner;

public class BJ_array_1546 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		
		double [] x = new double[sc.nextInt()];
		double M = -10000000;
		
		for(int i=0;i<x.length;i++) {
			x[i] = sc.nextDouble();
				if(x[i]>M) {
					M=x[i];
			}
		}
		
		sc.close();
		
		double sum=0;
		for(int j=0;j<x.length;j++) {
			x[j]=x[j]/M*100;
			sum += x[j];
		}
		
		System.out.println(sum/x.length);	
		
	}

}
