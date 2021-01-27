package arrray;

import java.util.Scanner;

public class Insert {
	
	public static void main(String[] args) {
		//Sayali
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lenght of the array");
		int c=sc.nextInt();
		
		int array[]=new int[c+1];
		System.out.println("enter the element");
		for(int i=0;i<c;i++){
			
			array[i]=sc.nextInt();
			
		}
		
		System.out.println("enter the element you want to inserted");
		int d=sc.nextInt();
		
		array[c]=d;
		System.out.println("After inserting");
		for(int i=0;i<c;i++){
			
			System.out.println(array[i]);
		}
		System.out.println(array[c]);
	}
	
	

}
