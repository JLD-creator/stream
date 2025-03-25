package org.ies.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderItem {
    private int number;
    private String product;
    private int amount;
}