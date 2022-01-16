import java.util.Scanner;

public class BJ_for6_11021 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=1;i<=N;i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.println("Case #"+i+": "+(A+B));
		}
		sc.close();
	}
}
