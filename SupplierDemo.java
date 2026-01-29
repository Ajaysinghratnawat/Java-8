package com.ajay;

import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {
		//Supplier
		Supplier<String> s = ()->"Hello";
		System.out.println(s.get());		
	}
}