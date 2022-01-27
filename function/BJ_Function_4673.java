package function;

public class BJ_Function_4673 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] check = new boolean[10001];
		
		for(int i=1;i<10001;i++) {
			int x = d(i);
			if(x<10001) {
				check[x]=true;
			}
			if(!check[i]) {
				System.out.println(i);
			}
		}
		
		
	}
	public static int d(int n) {
		int sum = n;
		
		while(n!=0) {
			sum= sum+n%10;
			n = n/10;
		}
		return sum;
	}
}
