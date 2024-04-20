package com.java.exercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayClone {
	
	public static int lengthOfLongestSubstring(String s)
	 {
		 int n = s.length();
		 int maxLen = 0;
		 Map<Character,Integer> charIndexMap = new HashMap<>();
		 for(int start =0, end =0;end<n; end++)
		 {
			 char c = s.charAt(end);
			 if(charIndexMap.containsKey(c)) {
				 
				 start = Math.max(charIndexMap.get(c)+1,start);
				
				// System.out.println(charIndexMap.get(c));
			 }
			 
			 maxLen = Math.max(maxLen,end-start+1);
			 charIndexMap.put(c,end);
		 }
		 return maxLen;
	 }
	

	public static void main(String[] args) {
		
		
		String input = "abcabcadfd";
		int result = lengthOfLongestSubstring(input);
		System.out.println(result);
		// TODO Auto-generated method stub

		
	/*	int originalArray[];
		int cloneArray[];
		int size;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size :");
		size = sc.nextInt();
		
		originalArray = new int[size];
		cloneArray = new int[size];
		
		System.out.println("Enter the Origianl Array Elements");
		for(int i=0;i<size;i++)
		{
			originalArray[i]=sc.nextInt();
		}
		sc.close();
		
		for(int i =0; i<originalArray.length;i++) {
			cloneArray[i]= originalArray[i];
			
		}
		
		//cloneArray = originalArray.clone();
		//cloneArray = Arrays.copyOf(originalArray, size);
		
		cloneArray = Arrays.copyOfRange(originalArray, 1, 4);
		for(int i =0;i<originalArray.length;i++)
		{
			System.out.println( originalArray[i] + " ");
		}
		System.out.println("-------------------");
		
		for(int i =0;i<cloneArray.length;i++) {
			System.out.println(cloneArray[i]+" ");
		}
		*/
		
		 	/*int[] sourceArray = { 1, 2, 3, 4, 5 ,6,7};
	        int[] destinationArray = new int[6];

	        
	       // System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.length);
			destinationArray = Arrays.copyOfRange(sourceArray, 1, 4);
	       
	        System.out.print("A1:");
	        for(int num: sourceArray)
	        {
	        	System.out.print(num + " ");
	        }
	        System.out.println("");
	        System.out.print("A2:");
	        for (int num : destinationArray) {
	            System.out.print(num + " ");
	        }
	        System.out.println();*/
		
		
		
		       /* String sentence = "Hello world  Java";
		        
		        // Split the sentence based on whitespace
		        String words = sentence.split("\\s+");
		        
		        // Print each word
		        for (String word : words) {
		            System.out.println(word);
		        }*/
		
		 
		 
		
		    }
		
		
	}


