import java.util.Scanner;

public class BJ_while_1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		sc.close();
		int a = N;
		int count=0;
		
		while(true) {
			N=(N%10)*10+(N%10+(N/10))%10;
			count++;
			
			if(a==N) break;
		}
		System.out.println(count);
		
	}

}
