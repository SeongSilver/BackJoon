package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//import java.util.Scanner;

public class BJ_Math1_2869 {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int height = Integer.parseInt(st.nextToken());
		
		int day = (height-down)/(up-down);
		if((height-down)%(up-down)!=0) day++;
		
		System.out.println(day);
		 
	}

}

//!!!!동일한 코드 BufferedReader도 실패
//Scanner sc = new Scanner(System.in);
//
//int up = sc.nextInt();
//int down = sc.nextInt();
//int height = sc.nextInt();
//
//int oneday = up-down;
//int day = 0;
//int sum = 0;
//
//while(sum==height) {
//	sum+=oneday;
//	if(sum==height) break;
//	day++;
//}
//System.out.println(day);