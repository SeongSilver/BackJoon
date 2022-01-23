package strArr;

import java.util.Scanner;

public class BJ_strArr_10809 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		int[] alphabet = new int[26];
		
		for(int i=0;i<alphabet.length;i++) {
			alphabet[i] = -1;
		}
		String text = sc.next();
//		
		for(int j=0;j<text.length();j++) {
			int num = (int)text.charAt(j)-97;
			
			if(alphabet[num]==-1)
			 alphabet[num]=j;
		}
		
		for(int k=0;k<alphabet.length;k++) {
			System.out.print(alphabet[k]+" ");
		}
}
}
	//개쩌는 풀이...
	/*
	 *  Scanner sc = new Scanner(System.in);
             String input = sc.next();
             
             for (char c = 'a' ; c <= 'z' ; c++)
                    System.out.print(input.indexOf(c) + " ");*/
