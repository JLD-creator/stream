package org.ies.stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {
        List<String> stringList = List.of("Bob", "Peppa", "George");
        List<Integer> intList = List.of(23, 78, 89);
        List<Double> dolist = List.of(55.4, 45.90, 12.98);
        stringList
                .stream()
                .forEach(System.out::println);
       Optional<String> primero = fist(stringList);
        System.out.println(primero);
        List<Integer> newList = par(intList);
        System.out.println(newList);
        Optional<Double> suma = avg(dolist);
        System.out.println(suma);
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
}

