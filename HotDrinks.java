package org.example.hw;

import java.math.BigDecimal;

public class HotDrinks extends Drinkable {
    private final int temp;

    public HotDrinks(String name, BigDecimal cost, Double volume, int temp) {
        super(name, cost, volume);
        this.temp = temp;
    }

    public int getTemp() {
        return this.temp;
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + "температура напитка = " + this.temp;
    }
}
