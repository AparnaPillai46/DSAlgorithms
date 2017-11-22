package sorting;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MergeKElements {
	
	
	public static void main(String[] args) {
	int[][] multi = new int[][]{
			  {1,2,3,4},
			  {10,20,40,80},
			  {15,25,78,90},
			  {67,78,79,81}
			};
		
		/*int[][] multi = new int[][]{
			  {-1, -3 ,-5 ,-7 },
			  {-2, -6 ,-8 ,-10},
			
			};*/
			System.out.println(Arrays.toString(merge(multi)));
			
	}

	private static class QueueNode implements Comparable<QueueNode> {

		// array is the index of array
		int array, index, value;
		//to retain ascending or descending order
		boolean isAsc ;

		public QueueNode(int array, int index, int value,boolean isAsc) {
			super();
			this.array = array;
			this.index = index;
			this.value = value;
			this.isAsc = isAsc;
		}

		@Override
		public int compareTo(QueueNode o) {
			//to retain ascending or descending  order
			if(o.isAsc){
				if (value < o.value)
					return 1;
				if (value > o.value)
					return -1;	
			}
			if (value > o.value)
				return 1;
			if (value < o.value)
				return -1;
			return 0;
		}

	}

	public static int[] merge(int[][] arrays) {
		PriorityQueue<QueueNode> pq = new PriorityQueue<>();

		int size = 0;
		boolean isAsc = false;
		//Assuming min size = 1
		if(arrays.length>1){
		if(arrays[0][0]>arrays[0][1]){
			isAsc= true;
		}
		for (int i = 0; i < arrays.length; i++) {
			size += arrays.length;
			if (arrays[i].length > 0) {
				pq.add(new QueueNode(i, 0, arrays[i][0],isAsc));
			}

		}
		int[] result = new int[arrays[0].length*arrays.length];
		for (int i = 0; !pq.isEmpty(); i++) {
			QueueNode n = pq.poll();
			result[i] = n.value;
			
			int newIndex = n.index +1;
			 if (newIndex < arrays[n.array].length) {
		            pq.add(new QueueNode(n.array, newIndex, 
		            arrays[n.array][newIndex],isAsc));
		        }
		}
		return result;
		}
		
		else{
			//if array is just of size 1 
			return arrays[0];
		}
	}

}
