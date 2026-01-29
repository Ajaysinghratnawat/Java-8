package com.ajay;
import java.util.function.*;
public class PredicteDemo {
	public static void main(String[] args) {
		//Predicate
		Predicate<Integer> p = n->n%2==0;
		System.out.println(p.test(10));
		
		Predicate<Integer> p1 = n->n>10;
		//and(Both true) -> Default Method 
		System.out.println(p.and(p1).test(16));
		
		//or(Only one true) -> Default Method
		System.out.println(p.or(p1).test(10));
		
		//negate(reverse) -> Default Method
		System.out.println(p.negate().test(10));
		
		//isEqual -> Static Method
		Predicate<String> p2 = Predicate.isEqual("Hello");
		System.out.println(p2.test("Hello"));
		
		//BiPredicate
		BiPredicate<Integer,Integer> p3 = (x,y)->(x+y)%2==0;
		System.out.println(p3.test(10, 20));
	}
}

