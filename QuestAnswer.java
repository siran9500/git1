package org.java;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.print.attribute.IntegerSyntax;

public class QuestAnswer {

	
	public static void main(String[] args) {
		
	
		List <Integer> li = new ArrayList<>();  
		
		li.add(15);
		li.add(25);
		li.add(35);
		li.add(45);
		li.add(55);
		li.add(65);
		li.add(75);
		li.add(88);
		li.add(99);
		li.add(76);
		li.add(56);
		li.add(123);
		
		System.out.println(li);
	
		// for loop
		
	for (int i = 0; i < li.size(); i++) {
		
		Integer y = li.get(i);
		System.out.println(y);
			
	}
		
	System.out.println("enchanced for loop ");
	
	for (Integer k : li) {
		System.out.println(k);
	}
	
	
		
	
	
	}
		
	}
	
	
	
	
	

