package org.example.hw;

import java.math.BigDecimal;

public abstract class Product {
    private String name;
    private BigDecimal price;

    public Product() {
    }

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        if (price.compareTo(BigDecimal.valueOf(0L)) > 0) {
            this.price = price;
        } else {
            System.out.println("Стоимость не может быть равна или меньше нуля!");
        }

    }

    public String toString() {
        String var10000 = this.name;
        return "\"" + var10000 + "\" стоит: " + String.valueOf(this.price) + " у.е. ";
    }
}
