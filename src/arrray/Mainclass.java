package arrray;

import java.util.Arrays;

public class Mainclass {
	

  public static void main(String[] args) {
	
/*	  
	 int aa[]={1,2,3,5,8,15,-1,2};
	 Arrays.sort(aa);                  //sorting of array
	 for(int i=0;i<aa.length;i++){
		 System.out.print(aa[i]);     
	 }
	System.out.println("");
	 int index=Arrays.binarySearch(aa, 2);
		System.out.println(index);     //   2 element is @3 number index
		
		
	  System.out.println(aa.length);  //   lenght of array is 8
	  */
	  
	  int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
	  
	  int Index_position = 2;
	  int newValue    = 5;                                     // Insert an element in 3rd position of the array (index->2, value->5)
	   
	   
	  

	  System.out.println("Original Array : "+Arrays.toString(my_array));     
	   
	  for(int i=my_array.length-1; i > Index_position; i--){
	    my_array[i] = my_array[i-1];
	   }
	   my_array[Index_position] = newValue;
	   System.out.println("New Array: "+Arrays.toString(my_array));
	 }
	
      
	  



}
