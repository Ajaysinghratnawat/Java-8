package com.ajay;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		//Function 
		Function<Integer,Integer> f = n->2*n;
		System.out.println(f.apply(5));
		
		Function<Integer,Integer> f1 = n->n+n;
		//andThen -> Default Method
		System.out.println(f1.andThen(f).apply(2));
		
		//Compose -> Default Method
		System.out.println(f1.compose(f).apply(2));
		
		//identity -> Static Method
		System.out.println(Function.identity().apply(10));
		
		//BiFunction
		BiFunction<Integer,Integer,Integer> f2 = (x,y)->x+y;
		System.out.println(f2.apply(10, 20));
	}

}
