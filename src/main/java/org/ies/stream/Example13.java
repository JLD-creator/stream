package org.ies.stream;

import org.ies.model.Order;
import org.ies.model.OrderItem;
import org.ies.model.Product;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Example13 {
    public static void main(String[] args) {
        var orders = List.of(
                new Order(LocalDate.now(), 34, List.of(
                        new OrderItem(1, "Tornillo", 2),
                        new OrderItem(2, "Tuercas", 2),
                        new OrderItem(3, "Destornillador", 2)
                )),
                new Order(LocalDate.now(), 343, List.of(
                        new OrderItem(1, "Clavo", 2),
                        new OrderItem(2, "Martillo", 2)
                ))
        );
        System.out.println(prices(orders));
        System.out.println(totalPrice(orders));
        System.out.println(allItems(orders));
    }
    public static List<Double> prices (List<Order> orders){
        return orders
                .stream()
                .map(order -> order.getPrice())
                .toList();
    }
    public static Double totalPrice(List<Order> orders){
        return orders
                .stream()
                .map(Order:: getPrice)
                .reduce(0d, Double:: sum);
    }
    public static  List<OrderItem> allItems(List<Order> orders){
        return orders
                .stream()
                .flatMap(order -> order.getItems().stream())
                .toList();
    }
}
