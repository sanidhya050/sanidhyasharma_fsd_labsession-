package driver_java;

import java.util.Scanner;
class Trasaction {
	
	public static void main(String []args) throws Exception {
		
		Scanner s = new Scanner(System.in);
		 
		 System.out.print("Enter size of transaction array:: ");
		 
		 int size = s.nextInt();
		 
		 int arr[] = new int [size];
		 
		 long a = 10 ;
		 
		 System.out.println("Enter the values of and array::  ");
		 
		 for (int i = 0 ; i < size ; i++)
			 arr[i] = s.nextInt();
		 
		 System.out.println("Enter the total numebr of targets that need to be achieved  ");
		 int targetno = s.nextInt();
		 
		 while (targetno-- !=0) {
			  int flag=0;
			  
			  long target;
			  
			  System.out.println("Enter the value of the target ");
			  
			  target=s.nextInt();
			  
			  long sum = 0 ;
			  
			  for ( int i=0;i<size;i++) {
				  sum+= arr [i];
				  if (sum>=target) {
					  
					  System.out.println ("Target achieved after "+(i+1)+"transactions");
					  
					  flag =1;
					  
					  break ;
					  
				  }
			  }
			   if (flag == 0) {
				    
			
				   System.out.println("Given target is not achieved");
				   
			   }
			  
			 
		 }
		 
	}
	
}