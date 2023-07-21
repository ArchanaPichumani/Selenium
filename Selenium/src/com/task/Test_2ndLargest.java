package com.task;

public class Test_2ndLargest {
	
	public static void main(String[] args) {
		
		int a[]= {56, 78, 8, 89, 90, 99, -5};
		
		//int b[]= {-5, -7, 5, 0, 19, -2};
		
		
		int first=0;
		int second=0;
		
	//	int first1=0;
	//	int second1=0;
		
		
		for (int i = 0; i < a.length; i++) { 
			
			if(a[i]>first) {
				
				second=first;
				first=a[i];
				}
			else {
				
				if(a[i]>second) {
				second=a[i];
			}
			
		}
		
						
			
			
	}
		System.out.println(second);
	}	
		

}

