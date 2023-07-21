package com.task;

public class Test_Max_Min {
	
	public static void main(String[] args) {
		
		int a[]= {56, 78, 8, 89, 90, 99, -5};
		
		int b[]= {-5, -7, 5, 0, 19, -2};
		
		int max=0;
		
		int min=0;
		
		int max1=0;
		int min1=0;
		
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]>max) {
				
				max=a[i];
				
			}
			
			else if(a[i]<min) {
				
				min=a[i];
			}
			
		}
		
         for (int i = 0; i < b.length; i++) {
			
			if(b[i]>max1) {
				
				max1=b[i];
				
			}
			
			else if(b[i]<min1) {
				
				min1=b[i];
			}
			
		}
				
							
		System.out.println("Max is:"+max);
		System.out.println("Min is:"+min);
		System.out.println("Max1 is:"+max1);
		System.out.println("Min1 is:"+min1);
		
	}

}
