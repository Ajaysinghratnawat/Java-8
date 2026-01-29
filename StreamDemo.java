package com.ajay;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String[] args) { 
		//Stream Life Cycle
		//Source->Pipeline->Intermediate Operation->Termination Operation
		
		//asList
		List<Integer> l = Arrays.asList(1,2,3,3,4,5);
		
		//toList(),toSet,toMap(),Counting(),joining()
		Set<Integer> s = l.stream().collect(Collectors.toSet());
		System.out.println(s);
		
		//method Reference
		l.stream().forEach(System.out::print);

		//IllegalStateException -> When stream consumed already
//		Stream<Integer> st = l.stream();
//		st.forEach(System.out::println);
//		st.count();
		
		//Methods -> 
		//Intermediate Operation -> map(),filter(),distinct(),sorted(),limit(),skip(),generate()
		//Terminal Operation -> count(),forEach(),reduce(),min(),max()
		//Method Chaining
		l.stream().map(n->2*n).forEach(n->System.out.println(n));
	}

}
