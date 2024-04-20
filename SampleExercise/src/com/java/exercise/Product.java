package com.java.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//class Test{

	/*static void arrayDisplay(int[] a)
	{
		//a =null;
		int b[] =a;
		b[0]=50;
		*/
	
	


/*public class Product {
	
	/*private final String name;
	private final boolean vegetarian;
	private final int calories;
	private final Type type;
	
	public Product(String name, boolean veg, int calories, Type type)
	{
		this.name=name;
		this.vegetarian=veg;
		this.calories=calories;
		this.type=type;
	}
	public String getName()
	{
		return name;
	}
	public boolean isVeg()
	{
		return vegetarian;
	}
	public int getCalories()
	{
		return calories;
	}
	public Type getType()
	{
		return type;
	}
	@Override
	public String toString()
	{
		//System.out.println(getName());
		return name;
	}
	
	enum Type{MEAT,FISH,OTHER}
	
	

	
	*/
 class Trader{
	 private String name;
	private String city;
		

	public Trader(String name, String city) {
			super();
			this.name = name;
			this.city = city;
		}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}


@Override
public String toString() {
	return "Trader [name=" + name + ", city=" + city + "]";
}


 }
		

	public class Product {
		
				
			
		private Trader trader;
		private int year;
		private int value;



	public Product(Trader trader, int year, int value) {
			super();
			this.trader = trader;
			this.year = year;
			this.value = value;
		}
	public Trader getTrader() {
		return trader;
	}

	public void setTrader(Trader trader) {
		this.trader = trader;
	}
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}


	@Override
	public String toString() {
		return "Product [trader=" + trader + ", year=" + year + ", value=" + value + "]";
	}



	public static void main(String[] args) {
		
		Trader raoul  = new Trader ("Raoul","Cambridge");
		Trader mario = new Trader ("Mario","Milan");
		Trader alan= new Trader ("Alan","Cambridge");
		Trader brain = new Trader ("Brain","Cambridge");
		
		
		List<Product> products = Arrays.asList
								(new Product(brain,2011,300),
								new Product(raoul,2012,1000),
								new Product(raoul,2011,400),
								new Product(mario,2012,710),
								new Product(mario,2012,700),
								new Product(alan,2012,950)
										);
		
	//	List<Product> year_2011= products.stream().filter(year -> year.getYear() >=2012).
									//sorted().
								//	collect(Collectors.toList());
	//	System.out.println(year_2011);
		//List<Product> l = products.stream().sorted(Comparator.comparing(p->p.getTrader().getName()))
						//	.collect(Collectors.toList());
				
								
		//System.out.println(l);
		/*String traderNames= products.stream().map(p->p.getTrader().getName()).sorted()
									.reduce("",(n1,n2)->n1+" "+n2);
		
		System.out.println(traderNames);*/
		
		
	//		products.stream().filter(p->p.getValue()<550).forEach(System.out::println);
		
		
		//System.out.println(max);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	String input = "hello";
		
		Map<Character,Integer> charCounts = new HashMap();
		for(char c: input.toCharArray())
		{
			charCounts.put(c, charCounts.getOrDefault(c, 0)+1);
		}
			for(Map.Entry<Character, Integer> entry: charCounts.entrySet())
			{
			System.out.println("Character :"+entry.getKey() +":"+"Count :"+entry.getValue());
		}*/
		
		/*List<Integer> minValue= Arrays.asList(2,5,1,18,1,0);
		//Optional<Integer> value = minValue.stream().reduce((n,n1) -> n>n1? n:n1);
		int sum = minValue.stream().parallel().reduce(2,Integer::sum);
		
		System.out.println(sum);*/
	}
	}
		
		//List<String> products = Arrays.asList("Smartphone","Clothes","Jewellery","Appliances");
		
		// products.stream().reduce((p1,p2)-> p1.length() >p2.length()? p1:p2).
		 			//		ifPresent(System.out::println);
	//	values.ifPresent(System.out::println);
	/*	products.stream().filter((a ->a.length()>3)).sorted((b1,b2)->b2.compareTo(b1))
		.limit(2).forEach(System.out::println);*/
		/*String[] values = {"Java","Python","JavaScript","Scala"};
		List<String> l = Arrays.asList(values);
		System.out.println(l);*/
		
		
		 //products.stream().map(String :: toUpperCase).forEach(System.out::println);
	
		/*String[] arrayOfWords = {"Java","Hello","Program"};
		
		List<String> l1 = Arrays.asList(arrayOfWords);
		l1.stream().map(word->word.split("")).flatMap(Arrays::stream).distinct()
		.forEach(System.out::print);*/
		
		/*List<Integer> values = Arrays.asList(1,2,3);
		
		
		List<Integer> values1 = Arrays.asList(6,7);
		
		List<int[]> result = 
				values.stream().flatMap(s ->values1.stream().
								
								map(k ->new int[] {s,k})).
								
								collect(Collectors.toList());
Arrays.asList(result).forEach(System.out::println);*/
		 //   Integer[] array1 = {3,5};
	       /// Integer[] array2 = {6,8,7};

	        // Pair each element of array1 with each element of array2
	      /*  Stream<String> pairedStream = Arrays.stream(array1)
	                .flatMap(a -> Arrays.stream(array2)
	                		.filter(b ->(a+b)%3 ==0)
	                        .map(b -> "(" + a + ", " + b + ")"));

	        // Print the paired elements
	        pairedStream.forEach(System.out::println);*/
	        
	        
	      /*  Stream<Integer> numbers1 = Stream.of(2, 4, 6, 8, 7,10);
	        boolean allEven = numbers1.noneMatch(num -> num<1? true:false);
	        System.out.println("Are all numbers even? " + allEven); // Output: true

	        // Example 2: Check if all strings have length greater than 3
	        Stream<String> words = Stream.of("apple", "banana", "orange", "grape");
	        boolean allLongEnough = words.noneMatch(word -> word.length() > 3);
	        System.out.println("Are all words longer than 3 characters? " + allLongEnough); 
	        
	        // Output: true

	     // Example 3: Check if all elements are positive
	        Stream<Integer> numbers2 = Stream.of(1, 2, 3, 14, 5);
	        boolean allPositive = numbers2.noneMatch(num -> num < 0);
	        System.out.println("Are all numbers positive? " + allPositive);    */
	        
	     /*   Stream<Integer> numbers = Stream.of(1,2,4,5,8,10);
	        Optional<Integer> anyThreeModuls = numbers.filter(n -> n%3==0).findAny();
	        
	        if(anyThreeModuls.isPresent())
	        {
	        	System.out.println("The Three Moduls is: "+anyThreeModuls.get());
	        }
	        else {
	        	System.out.println("Sorry not found");
	        }
	        
	        Stream<String> fruits = Stream.of("OApple","OPineapple","Orange","OGrapes","Orange123");
	        boolean findFruits=  fruits.allMatch(f -> f.startsWith("O"));
	        
	        /*findFruits.ifPresentOrElse(value-> System.out.println(value),
	        		
	        		()->System.out.println("No O is found"));
	        System.out.println(findFruits);*/
	/*	List<Integer> numbers =Arrays.asList(2,6 ,13,16);
		/*Optional<Integer> result=numbers.stream().map(n ->n*n).filter( n -> n%8==0).findFirst();
										//forEach(System.out::println);
		System.out.println(result);*/
		
		/*int sum = numbers.stream().reduce(0+1+2, (n1,n2)->n1+n2);
		
		System.out.println(sum);*/
	        
	        
	        
	
		
		
		
	




/*int[] myArray = {1,2,3,4,5};
Test.arrayDisplay(myArray);
for(int j=0; j<myArray.length;j++)
{
	System.out.print(myArray[j]+"");
}*/
/* List<Integer> values = Arrays.asList(10,-12,8,25,-14,25);
 
 values.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);*/

		/*List<Product> menu = new ArrayList<>();
		
		menu.add(new Product("Pork",false,800,Product.Type.MEAT));
		menu.add(new Product("beef",false,700,Product.Type.MEAT));
		menu.add(new Product("Chicken",false,400,Product.Type.MEAT));
		menu.add(new Product("RIce",true,350,Product.Type.OTHER));
		menu.add(new Product("Pizza",true,450,Product.Type.OTHER));*/

	
	
		/*char[] item = {'a','b','c'};
		String item1 = "This is Java Programming";
		
		productItem(item, item1);
	}
		private static void productItem(char[] z, String item1)
		{
			if(z.length < item1.length())
			return;
			for(int j =0; j<item1.length();j++)
			{
				z[j]+= item1.charAt(j);		
				System.out.println("Char is :"+z[j]);
		}
			//System.out.println("Char is :"+z[j]);
	}*/


