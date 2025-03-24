package org.ies.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        List<String> stringList = List.of("Bob", "Peppa", "George");
        stringList
                .stream()
                .forEach(System.out::println);
       Optional<String> primero = fist(stringList);
        System.out.println(primero);
    }
    public static <T> Optional<T> fist(List<T> list){
        return list
                .stream()
                .findFirst();
    }
    public static <T> Optional<T> second(List<T> list){
        return list
                .stream()
                .skip(1)
                .findFirst();
    }
    public static <T> Optional<T> last(List<T> list){
        return list
                .stream()
                .skip(list.size()-1)
                .findFirst();
    }
}
