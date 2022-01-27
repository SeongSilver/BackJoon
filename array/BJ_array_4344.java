import java.util.Scanner;

public class BJ_array_4344 {

	public static void main(String[] args) {
		//첫줄에는 테스트 케이스 개수 C
		
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		
		for(int i=0;i<C;i++) {
			int students = sc.nextInt();
			int[] arr = new int[students];
			
			double sum = 0;
			
			for(int j=0;j<students;j++) {
				arr[j] = sc.nextInt();
				sum+=arr[j];
			}
			
			double average = sum/students;
			double averageOverCount=0;
			
			for(int k=0;k<students;k++) {
				if(arr[k]>average)
				averageOverCount++;
			}
			
			System.out.printf("%.3f%%\n",(averageOverCount/students)*100);
		}
		
		
	}

}
