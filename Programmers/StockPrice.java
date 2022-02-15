package stack_queue;

public class StockPrice {
	
	public int[] solution(int[] prices) {
        int[] answer = {prices.length};
        
        for(int i=0;i<prices.length;i++) {
        	for(int j=1;j<prices.length;j++) {
        		answer[i]++;
        		if(prices[i]>prices[j]) break;
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) {
		
	}

}
