package stack_queue;

import java.util.ArrayList;

public class FunctionDevelopment {
	
	public int[] solution(int[] progresses, int[] speeds) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		int[] arr = new int[progresses.length];
//		for(int i=0;i<progresses.length;i++) {
//			int a=0;
//			int b=0;
//			if(progresses[i]%speeds[i]!=0) {
//				a=1;
//			}
//			b=(100-progresses[i])/speeds[i];
//			arr[i] = a+b;
//		}
		
		   for(int i = 0; i < speeds.length; i++){
	            arr[i] = (100 - progresses[i]) / speeds[i];
	            if ((100 - progresses[i]) % speeds[i] != 0){
	                arr[i] += 1;
	            }
	        }    
	            
	            
	        int prev = arr[0];
	        int count = 1;
	        for (int j = 1; j< arr.length; j++){
	            if (prev < arr[j]){
	                list.add(count);
	                count = 1;
	                prev = arr[j];
	            } else{
	                count++;
	            }
	        }
	        list.add(count);
//		int count;
//		for(int j=0;j<arr.length;j+=count) {
//			count=0;
//			while(true) {
//			int k=1;
//			++count;
//			if(arr[j]<arr[k])break;
//			k++;
//			if(k==arr.length)break;
//			}
//			list.add(count);		
//		}
		
		int listSize = list.size();
		int[] answer = new int[listSize];
		for(int l=0;l<list.size();l++) {
			answer[l]=list.get(l);
		}
		return answer;
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionDevelopment fd = new FunctionDevelopment();
		
		int[] progresses1 = {93, 30, 55};
		int[] speeds1 = {1, 30, 5};
		
		int[] progresses2 = {95, 90, 99, 99, 80, 99};
		int[] speeds2 = {1,1,1,1,1,1};
		
		fd.solution(progresses1, speeds1);
		fd.solution(progresses2, speeds2);
	}

}
