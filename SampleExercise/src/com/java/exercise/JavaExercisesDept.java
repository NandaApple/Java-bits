package com.java.exercise;

import java.util.Scanner;
import java.util.*;
public class JavaExercisesDept {
	public static void main(String... args) {
		
	
		int i = Integer.valueOf("50");
		System.out.println(i);
		
		refMethodCall(10);
	}
		
		private static void refMethodCall(Object obj)
		{
			System.out.println("This is object creation");
		}
		private static void refMethodCall(String s)
		{
			System.out.println("This is String Objects");
	}
		
		private static void refMethodCall(int i)
		{
			System.out.println("This is integer Objects");
	}
	/*private static int counter = 10;
	   void InterviewbitTest() {
	       counter = 20;
	   }
	   JavaExercisesDept(){
		   
	   }
	   JavaExercisesDept(int x){
	       counter = x;
	   }

	public static void main(String[] args) {
		JavaExercisesDept jd = new JavaExercisesDept();
	System.out.println(jd.counter);*/
		
		
		
		/*int j = 4;
		int i = 6;
		int k1 = i++ - ++i;
		System.out.println(k1);		*/

				
		
		 /*	Integer num1 = 135, num2 = 135;  
	       System.out.println(num1 == num2);
	       Integer num3 = 20, num4 = 20;  
	       System.out.println(num3 == num4);*/
	   

			
		/*int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {3, 4, 5, 6, 7};

		Set<Integer> set1 = new HashSet<>(Arrays.asList(Arrays.stream(arr1).boxed().toArray(Integer[]::new)));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(Arrays.stream(arr2).boxed().toArray(Integer[]::new)));

		set1.retainAll(set2);

		System.out.println(set1);/*
	///	}
		//}/
		// TODO Auto-generated method stub
		
		/*Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the First Number :");
		int a = input.nextInt();
		if(a>10)
		{
			System.out.println("A is greater than 10");
		}
		else
		{
			System.out.println("A is Less than 10");
		}*/
		
		
	/*for(int i =0; i<=5;i++)
	{
		for(int j =5-1; j>1;j--)
		{				
			System.out.print(" ");
			
		}
		for(int j=0;j<=i;j++)
		{
		System.out.print("* ");
		}
		System.out.println();
	}
		/*for(int i =0; i<=5;i++)
		{
			for(int j =0; j<i;j++)
			{
				if(j<i) {
					System.out.print("*");
				//	break;
					continue;
				}
				else {
				System.out.print(" ");
				}
			}
			System.out.println("*");
	}*/
		
		
		
		
	}

