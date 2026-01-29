package com.ajay;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		//Consumer
		Consumer<Integer> c = n->System.out.println(n);
		c.accept(10);
		
		Consumer<Integer> c1 = n->System.out.println(n+10);
		//andThen -> Default Method
		c.andThen(c1).accept(10);
		
		//BiConsumer
		BiConsumer<Integer,Integer> c2 = (x,y)->System.out.println(x+y);
		c2.accept(10, 20);
	}
}