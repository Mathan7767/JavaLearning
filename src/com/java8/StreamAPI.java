package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6);
		Predicate<Integer> predicate=new Predicate<Integer>() {

			@Override
			public boolean test(Integer n) {
				
				return n%2==0;
			}
			
		};
		
		/*
		 * Stream<Integer> data=list.stream(); Stream<Integer>
		 * sortedStream=data.sorted(); // From now on data becomes inaccessible
		 * Stream<Integer> mapData=sortedStream.map(n->n*2); // SortedStream becomes
		 * inaccessible Stream<Integer> filterData=mapData.filter(n->n%2==0);
		 * filterData.forEach(n->System.out.println(n));
		 */
		
		
		list.stream().sorted().filter(predicate).map(n->n*2).forEach(n->System.out.println(n));
		
		long count=list.stream().count();
		System.out.println("total Count:"+count);
	}
}
