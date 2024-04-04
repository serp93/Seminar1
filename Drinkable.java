package org.example.hw;

import java.math.BigDecimal;

public class Drinkable extends Product {
    private Double volume;

    public Drinkable(String name, BigDecimal cost, Double volume) {
        super(name, cost);
        this.volume = volume;
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + "объем = " + this.volume + " ";
    }

    public void setVolume(Double volume) {
        if (volume > 0.0) {
            this.volume = volume;
        } else {
            System.out.println("Объем напитка должен быть больше нуля!");
        }

    }
}
