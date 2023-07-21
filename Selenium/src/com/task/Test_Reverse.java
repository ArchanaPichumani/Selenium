package com.task;

public class Test_Reverse {
	
	public static void main(String[] args) {
		
		String T="NITIN";
		String U="MALAYALAM";
		String V="LONDON";
		
		String Rev="";
		String Rev1="";
		String Rev2="";
		
		for(int i=T.length()-1;i>=0;i--) {
			
			Rev=Rev+T.charAt(i);
					
		}
		
     for(int i=U.length()-1;i>=0;i--) {
			
			Rev1=Rev1+U.charAt(i);
					
		}
		
     for(int i=V.length()-1;i>=0;i--) {
			
			Rev2=Rev2+V.charAt(i);
					
		}
       
				
		System.out.println(Rev);	
		System.out.println(Rev1);
		System.out.println(Rev2);
	}

	
	
}
