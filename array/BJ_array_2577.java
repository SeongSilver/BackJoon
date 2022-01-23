package array;
import java.util.Scanner;

public class BJ_array_2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		String str = A*B*C+" ";
		
		int[] count = new int[10];
		
		
		for(int i=0;i<count.length;i++) {
			count[i]=0;
			for(int j=0;j<str.length();j++) {
				if((str.charAt(j)-'0')==i)
					count[i]++;
			}
			System.out.println(count[i]);
		}
		sc.close();		
		}
	}


