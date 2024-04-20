package com.java.exercise;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Spliterator;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.regex.*;
import java.util.stream.Stream;

/*class Sample1{
	int no = 50;
}*/
/*interface Javaocjp {
 static void main(String[] args){
System.out.println("Java Program");

}*/


public class Javaocjp {

public static void main(String[] args) {
	
  System.out.println("this java");

		//Sample1 s = new Sample1();
		//System.out.println(s.no);*/
		
		
		/*ArrayDeque<String> deque = new ArrayDeque<>();
		  deque.offerFirst("one");
		  deque.offerFirst("two");
		  deque.offerLast("three");
		  deque.offerFirst("four");
			//System.out.println(deque);
		 deque.pollFirst();
		  deque.pollLast();
		   
	System.out.println(deque);
			
	/*	Pattern p = Pattern.compile("o[xX] [0-9a-f]");
		Matcher m = p.matcher("41 XAB1 jk x");
		while(m.find())
		{
			System.out.println(m.start()+ " ");
			
		}
		
		System.out.println("Java");*/
		
	/*	String s1 = "Java";
		String s2 = s1;
		s1 = s1+"Programming";
		System.out.println(s1.equals(s2));
		StringBuffer sb1 = new StringBuffer("Python");
		StringBuffer sb2 = sb1;
		sb1.append("Programming");
		System.out.println(sb1.equals(sb2));*/
	/*	String[] number = new String[] {"This is java programming"};
		
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]);
		}*/
		
	/*	Queue<String> pq= new PriorityQueue<>();
		/*city.add("Coimbatore");
		city.add("Bangalore");
		city.add("MySore");
		city.add("Chennai");
		city.add("Hyderabad");
		city.add("Mumbai");
		city.offer("Delhi");
		city.offer("Kolkatta");
		
		System.out.print("The cities are : "+city.contains("bangalore"));
		/*System.out.println("Remove the First Elemenet"+city.remove());
		System.out.println("Now cities are : "+city);
		System.out.println("The Peek Element is:"+city.peek());
		System.out.println("The Pool Element is:"+city.poll());
		
		System.out.println("Now cities are : "+city);/*
		
		// Adding elements to the PriorityQueue
		 * 
		 * 
		 */
		Set<String> pq= new TreeSet<>();
	    pq.add("London");
	    pq.add("Sydney");
	    pq.add("Canada");
	    pq.add("Mumbai");
	    pq.add("Asia");
	    
	    int size = pq.size();
	    String[] cities = new String[size];
	    
	    cities = pq.toArray(cities);
	    System.out.println(Arrays.toString(cities));
	    
	    
	   // List<String> pq1 = new ArrayList<>();
	    
		/*Set<String> pq1 = new TreeSet<>();
	    pq1.add("India");
	    pq1.add("UK");	   
	    pq1.add("US");
	    pq1.add("Russia");
	    pq1.add("China");*/
		
		
	   
	//   boolean t =   pq1.contains("India");
	  // System.out.println(t);
		/*Set<String> pq= new HashSet<>();
		  pq.add("London");
		  pq.add("Sydney");
		  pq.add("Canada");
		  pq.add("Mumbai");
		  pq.add("Canada");
		   
		   
		   
		  Set<String> pq1 = new TreeSet<>();
		  pq1.add("Australia");
		  pq1.add("London");   
		  pq1.add("Mumbai");
		  pq1.add("Sydney");
		  pq1.add("Bejing");*/
		
		  
		   
	//	  pq.retainAll(pq1);
		

		 // System.out.println(pq);
	  // System.out.println(pq1);
	    
	  //  pq.retainAll(pq1);
	 //  System.out.println(pq1);
	     /*Stream<String> cities = pq1.stream();
	     Spliterator<String> s_city = cities.spliterator();
	     s_city.forEachRemaining((s1) ->System.out.println(s1));*/
	   
	   
	       
	   //  pq.stream().forEach(e->System.out.println(e));
	

	/*	Deque<String> pq= new ArrayDeque<>();
        pq.add("London");
        pq.add("Sydney");
        pq.add("Canada");
        pq.add("Moscow");
        pq.offerFirst("Tokiyo");
        pq.offerLast("Bejing");
        pq.add("Zapan");
        System.out.println("The pop is:"+pq.pop());
        System.out.println(pq.getFirst());
        System.out.println(pq.removeLast());*/
        
             
      
		
		/*HashMap<Integer, String> map = new HashMap<>();
		  map.put(1, "one");
		  map.put(2, "one");
		  map.put(3, "two");
		  map.put(4, "three");
		   
		  //get all values in the map
		  Collection<String> values = map.values();

		System.out.print(values);*/
        
        
}
	}

