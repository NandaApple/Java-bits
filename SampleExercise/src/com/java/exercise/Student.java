package com.java.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student {
	public static void main(String... args)
	{
	/*List<Integer> l1 = Arrays.asList(10,20,45,55,105);
	
	 
	Integer sum =  l1.stream().reduce(0, Integer::sum);
	System.out.println(sum);
	 
	 /*int x =5;
	 x = x++ -1;
	 int result = x > 5 ? x * 2 : x / 2;
	 System.out.println(result);*/
		
		/*String s = "Java World ProgramS";
		
		for(int i = s.length()-1;i>=0;i=i-2)
		{
			
			
			System.out.print(s.charAt(i));
		}*/
		
		
		
	/*	int number = 000150445;
		int count =1;
		while(number !=0)
		{
			number /=10;
			++count;
		}
			System.out.println(count);
	*/
		
		int a = 4;
		int n =3;
		for(int i=0;i<n;i++)
	     {	    	
	    	 for(int j=0;j<=i;j++)
	    	 
	    	 {
	    		 System.out.print(a);	    		 
	    	 }	    	
	    	 System.out.println(a+"*");
	     }
}
}
