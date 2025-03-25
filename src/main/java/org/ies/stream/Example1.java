package org.ies.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {
        List<String> stringList = List.of("Bob", "Peppa", "George");
        List<Integer> intList = List.of(23, 78, 89);
        List<Double> dolist = List.of(33.99, 45.90, 12.98);
        List<Double> dolist2 = List.of(45.25, 45.90, 89.33);
        stringList
                .stream()
                .forEach(System.out::println);
       Optional<String> primero = fist(stringList);
        System.out.println(primero);
        List<Integer> newList = par(intList);
        System.out.println(newList);
        System.out.println(juction(dolist, dolist2));
    }
    //1
    public static <T> Optional<T> fist(List<T> list){
        return list
                .stream()
                .findFirst();
    }
    //2
    public static <T> Optional<T> second(List<T> list){
        return list
                .stream()
                .skip(1)
                .findFirst();
    }
    //3
    public static <T> Optional<T> last(List<T> list){
        return list
                .stream()
                .skip(list.size()-1)
                .findFirst();
    }
    //4
    public static List<Integer> sum10( List<Integer> list){
        return list
                .stream()
                .map(n -> n +10)
                .collect(Collectors.toList());
    }
    //7
    public static List<Integer> par (List<Integer> list){
        return list
                .stream()
                .filter(n -> n % 2 == 0)
                .toList();
    }
    //8
    public static Double sum(List<Double> doubleList){
        return doubleList
                .stream()
                .reduce(0d,(a,b)-> a+b);
    }
    //9
    public static Optional<Double> avg(List<Double> doubleList){
       return doubleList
               .stream()
               .reduce((a, b) -> a + b)
               .map(suma -> suma /doubleList.size());
    }
    //10
    public static Optional<Double> maximum(List<Double> doubleList){
        Optional<Double> max = doubleList
                .stream()
                .max(Double::compareTo);
        return max;
    }
    //11
    public static Optional<Double> minimum(List<Double> doubleList){
        Optional<Double> min = doubleList
                .stream()
                .min(Double::compareTo);
        return min;
    }
    //12
    public static List<Double> juction (List<Double> list1, List<Double> list2){
        List<Double> union = new LinkedList<>();
        Set<Double> list2Set = new HashSet<>();
        return list1
                .stream()
                .filter(list2Set::contains)
                .toList();
    }
}

