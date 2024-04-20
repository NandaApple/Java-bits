package com.java.exercise;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Sample{
	int ranking;
	String teamName;
	String orangeCap;
	String blueCap;

	
	

	


	public Sample(int ranking, String teamName, String orangeCap, String blueCap) {
		super();
		this.ranking = ranking;
		this.teamName = teamName;
		this.orangeCap = orangeCap;
		this.blueCap = blueCap;
	}







	public int getRanking() {
		return ranking;
	}







	public void setRanking(int ranking) {
		this.ranking = ranking;
	}







	public String getTeamName() {
		return teamName;
	}







	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}







	public String getOrangeCap() {
		return orangeCap;
	}







	public void setOrangeCap(String orangeCap) {
		this.orangeCap = orangeCap;
	}







	public String getBlueCap() {
		return blueCap;
	}







	public void setBlueCap(String blueCap) {
		this.blueCap = blueCap;
	}







	public static void main(String[] args)
	{
	
	ArrayList<Sample> iplInfo = new ArrayList<Sample>();
	
	iplInfo.add(new Sample(1,"KKR","null","null"));
	iplInfo.add(new Sample(2,"RR","null","null"));
	iplInfo.add(new Sample(3,"CSK", "null","bluecap"));
	iplInfo.add(new Sample(4,"LSG","null","bluecap"));
	iplInfo.add(new Sample(5,"MI","null","null"));
	iplInfo.add(new Sample(6,"SH","null","null"));
	iplInfo.add(new Sample(7,"DC","null","null"));
	iplInfo.add(new Sample(8,"RB","orangecap","null"));
	
	
	
	
	
	
	
	
	iplInfo.stream().filter(s->s.getRanking()<=4 && s.getBlueCap().
						  equals("bluecap") || s.getOrangeCap().equals("orangecap") )
						  .forEach(s->System.out.println(s.getTeamName()));
	
	/*studnetInfo.stream().filter(e->e.getCityName() =="Bangalore").
	forEach(s->System.out.println(s.getDept()));*/
	
	
	// convert from List into Set 
	
	/*Set<String> studentRollnoList = studnetInfo.stream().filter(s->s.getRoll_NO()>=101)
									.map(s->s.getCityName()).sorted()
									.collect(Collectors.toSet());
			
	
	System.out.println(studentRollnoList);
			
	// Iterate the Student Information

			
			/*List<String> stringList = new ArrayList<>();

	        stringList.add("one");
	        stringList.add("two");
	        stringList.add("three");
	        stringList.add("abcd");
			
			
			Stream<String> stream = stringList.stream();
			stream.sorted().
			forEach(System.out::println);
	
				
			double[] avg = {10.5,12.5,8.5,20.25};
			 Arrays.stream(avg).sorted().forEach(e->System.out.println(e));
			//System.out.println("The avg is :"+ od);
			 
		 Set<String> values = new HashSet<String>();
		 
		 	values.add("John");
		 	values.add("Goshling");
		 	values.add("Mark");
		 	values.add("John");
		 	values.stream().sorted().forEach(e->System.out.println(e));
		 	
		*/
			 
		
	
	}
}