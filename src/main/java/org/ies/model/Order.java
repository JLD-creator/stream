package org.ies.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

@Data
@AllArgsConstructor
public class Order {
    private LocalDate date;
    private double price;
    private List<OrderItem> items;
}