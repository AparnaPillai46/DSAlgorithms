package sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class TopK {
	
	public static int[] topK(int[] input,int k){
		
		PriorityQueue<Integer> queue = new PriorityQueue<>(input.length,Collections.reverseOrder());
		
		for (int i = 0; i < input.length; i++) {
			queue.add(input[i]);
		}
		int[] topK = new int[k];
		for (int i =0; i<k ;i++ ){
			topK[i] = queue.poll();
		}
		
		return topK;
	}

	
	public static void main(String[] args) {
		
		int[] elem = {20,30,80,1,34,500,100,70,8};
		int k = 3;
		
		int [] ans = topK(elem, k);
		
		System.out.println(Arrays.toString(ans));
		
	}
}
