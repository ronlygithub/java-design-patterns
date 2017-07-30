package com.iluwatar.lambda;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by duanmenghua on 2017-07-24.
 */
public class Lambda {
    public static void main(String[] args) {

//        List<Integer> result = new LinkedList<>();
//        result.add(1);
//        result.add(3);
//        result.add(4);
//        result.add(7);
//        result.add(5);
//        result.add(7);
//        List<Integer> collect = result.stream().filter(x -> x > 3).distinct().collect(Collectors.toList());
//        Collections.sort(collect, (x,y)-> {return y-x;});
//        System.out.println(collect);
//        collect.forEach(System.out::println);
//        System.out.println("predicate");
//        evaluate(collect, n->n<=5);
//        Integer reduce = collect.stream().map(x->x*x).reduce((x,y)->x+y).get();
//        System.out.println(collect);        
    	compare();
    }
    
    public static void evaluate(List<Integer> list, Predicate<Integer> predicate) {        
        list.forEach((x)->{if(predicate.test(x)) System.out.print(x+" ");});
    }
    public static void compare() {        
    	List<Integer> values = new LinkedList<>();
    	for (int i = 0; i < 50000000; i++) {			
			Random random = new Random(System.currentTimeMillis());
			values.add(random.nextInt());
		}
    	int max = Integer.MIN_VALUE;
    	long start =  System.currentTimeMillis();
    	System.out.println("for start ");
    	for (Integer integer : values) {
			if (integer > max) {
				max = integer;
			}
		}
    	long end =  System.currentTimeMillis();
    	
    	System.out.println("max is: "+max);
    	System.out.println("for start "+(end-start)*1.0/1000);    	
    	max = Integer.MIN_VALUE;
    	max = values.stream().reduce(Integer.MIN_VALUE,Math::max);
    	long last =  System.currentTimeMillis();
    	System.out.println("max is: "+max);
    	System.out.println("for start "+(last-end)*1.0/1000);    
    	
    
    }
    
}
