package dfs_bfs;

public class TargetNumber {
	int answer = 0;
	
	public void solution(int[] numbers, int target) {
		
		dfs(numbers, target, 0,0);
	   System.out.println(answer);
	}
	
	public void dfs(int[] numbers, int target, int depth, int sum) {
		if(depth==numbers.length) {
			if(target==sum) answer++;
		}else {
			dfs(numbers, target, depth+1, sum+numbers[depth]);
			dfs(numbers, target, depth+1, sum-numbers[depth]);
		}
		
	}

	public static void main(String[] args) {
		int[] numbers1 = {1,1,1,1,1};
		int[] numbers2 = {4,1,2,1};
		
		TargetNumber tn = new TargetNumber();
		
		tn.solution(numbers1, 3);
		tn.solution(numbers2, 4);
	}

}
