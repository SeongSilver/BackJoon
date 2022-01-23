package basicMath;

import java.util.Scanner;

//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;


public class BJ_Math1_2292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//육각형으로 이루어진 벌집
		//중앙의 방 1부터 시작해서 이웃하느 방에돌아가면서 1씩 증가하는 번호를 주소로 매김
		//숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지
		//1(1) 6(2~7) 12(8~19) 18(20~37) 24(38~61) 일때 지나가는 칸의 수는 1, 2, 3, 4, 5 
		//숫자가 6씩 늘어날 때 마다 범위가 1씩 늘어난다.
	
		int honeycomb = sc.nextInt();
		int route = 1;
		int range = 2;
		
		if(honeycomb==1) {
			System.out.println(1);
		}
		else {
			while(range<=honeycomb) {
				range = range+(route*6);
				route++;
			}
			System.out.println(route);	
		}
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int honeycomb = Integer.parseInt(br.readLine());
//		int route = 1;
//		int range = 2;
//		
//		if(honeycomb==1) {
//			System.out.println(1);
//		}
//		else {
//			while(range<=honeycomb) {
//				range = range+(route*6);
//				route++;
//			}
//			System.out.println(route);	
//		}
//		
		
	}
}

