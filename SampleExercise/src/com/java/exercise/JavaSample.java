package com.java.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;


interface system{
public void display();
}

public class JavaSample{
	
	/*PrintStream out;
	Scanner in;
	
	JavaSample()
	{
		out = new PrintStream(System.out);
		in = new Scanner(System.in);
	}
	void start() {
		
		out.print("Seconds");
		int totalsec = in.nextInt();
		
		int hours = totalsec/3600;
		int minutes = (totalsec % 3600)/60;
		int seconds = totalsec % 60;
		
		out.printf("%02d:%02d:%02d", hours, minutes, seconds);
	}
	
	
	
	
		
		new JavaSample().start();
		
		*/
	public static void main(String[] args) {
		
	
	    /* int[] array = {10,20,2,40,50,1};
	     
	     int value = array[array.length-1];
	     
	     if((array[0] & value) > 2) {
	    	 
	    	 System.out.println("True");
	     }
	     else
	     
	     {
	    	 System.out.println("False");
	     }
	     }
	    */
	
		
		/*String[] arr = new String[] {"Anbus","Baskars","Marks","Devis","Ciyan","Elons","Marks"};
		
		Set<String> values =  Arrays.stream(arr).map(a -> a.toUpperCase()).collect(Collectors.toSet());
		System.out.println(values);*/
		 ArrayList list = new ArrayList();
		ArrayList<String> collection =  (ArrayList<String>) Arrays.asList("John","Elonmusk","James");
		System.out.println(collection);
		
		
		JavaSample js = (JavaSample) new Object();
	
		
		
		// System.out.println("count is:"+i);*/
			
		
		/*List<Integer> productsList = Arrays.asList(60);
			int discountPrice= 80;
			
			int reduced = productsList.stream().reduce(discountPrice, (a,b) -> a - b);
			System.out.println(reduced);*/
		
		/*List<String> uris = new ArrayList<>();
		uris.add("E:\\sample.txt");
		uris.stream().map(e -> Paths.get(e)).forEach(e ->System.out.println(e));*/
	
		
					
			 
		
	}
	    
	   
			/*long [] values = {0,10,20,15,25,35,12,20};
			{
			long l =Arrays.stream(values).filter(e->e%2==0).distinct().count();
			//System.out.println("The Ans is : "+l);	
			}
			List<Integer> l1 = new ArrayList<>();			
			l1.add(25);
			l1.add(45);
			l1.add(15);
			l1.add(35);
			l1.add(18);
			l1.parallelStream().forEach(System.out::print);*/
		
		/*HashMap<String,Integer> values = new HashMap<String,Integer>();
		
		values.put("John", 102);
		values.put("Steve", 103);
		values.put("Ratan", 101);
		values.put("Mark", 104);
		
		values.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		
		//Comparing BY Value Pairs
		System.out.println("---------------------------");
		
		values.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);*/
		
			}

