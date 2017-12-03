package sorting;



public class DutchFlag {
	
	// SORT RGB ORDER
	
	public static void main(String[] args) {

		System.out.println(dutch_flag_sort("RRGGBBRRBBGGG"));
		
	}
	
	 static String dutch_flag_sort(String balls) {

		 char[] a = balls.toCharArray();
		 
		 int lo = 0;
	        int hi = a.length - 1;
	        int pointer = 0;
		 char temp;
		 
		 
		 while(pointer <= hi){
		 switch (a[pointer])
         {
		 
         case 'R':
         {
             temp   =  a[lo];
             a[lo]  = a[pointer];
             a[pointer] = temp;
             lo++;
             pointer++;
             break;
         }
         case 'G':
             pointer++;
             break;
         case 'B':
         {
             temp = a[pointer];
             a[pointer] = a[hi];
             a[hi] = temp;
             hi--;
             break;
         }
         }
		 
	    }
		return new String(a);
	 }

}
