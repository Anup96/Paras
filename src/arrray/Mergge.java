package arrray;

public class Mergge {
	
	public static void main(String[] args) {
		
		  int z=0;
		  int x=0;
		  int i=0;
	      int[]a = {1,2,3,4};
	      int[]b = {4,16,1,2,3,22};
	      int[]c = new int[a.length+b.length];
	  
	      
	      
	      for( i = 0; i < a.length; i++) { 
	          c[i] = a[i];
	          System.out.print(c[i]);
}
	   System.out.print("");
	      for(int j = 0; j < b.length;j++) { 
	          c[z] = b[j]+c[i];
	          System.out.print(c[z]);
	       } 
	      
	    } 	      
}
/*public static void main(String[] args) {
    int[]a = {1,2,3,4};
    int[]b = {4,16,1,2,3,22};
    int[]c = new int[a.length+b.length];
    int count = 0;
    
    for(int i = 0; i < a.length; i++) { 
       c[i] = a[i];
       count++;
    } 
    for(int j = 0; j < b.length;j++) { 
       c[count++] = b[j];
    } 
    for(int i = 0;i < c.length;i++) System.out.print(c[i]+" ");
 } */