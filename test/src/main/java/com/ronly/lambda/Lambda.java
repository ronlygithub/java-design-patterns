package com.ronly.lambda;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by duanmenghua on 2017-07-24.
 */
public class Lambda {
    public static void main(String[] args) {

        List<Integer> result = new LinkedList<>();
        result.add(1);
        result.add(3);
        result.add(4);
        result.add(7);
        result.add(5);
        result.add(7);
        List<Integer> collect = result.stream().filter(x -> x > 3).distinct().collect(Collectors.toList());
        System.out.println(collect);


    }
}
