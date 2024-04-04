package org.example.hw;

import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println(" ПОИСК ОСВЕЖАЮЩИХ НАПИТКОВ ");
        VendingMachineBottle vmBottle = new VendingMachineBottle();
        List<BottleOfWater> bottleList = new ArrayList<>(Arrays.asList(new BottleOfWater(prod.Cola.toString(),
                new BigDecimal(100), 0.5), new BottleOfWater(prod.Sprite.toString(),
                new BigDecimal(80), 0.45), new BottleOfWater(prod.Fanta.toString(),
                new BigDecimal(60), 0.43), new BottleOfWater("Mineral water",
                new BigDecimal(40), 0.5)));
        vmBottle.initProduct(bottleList);
        System.out.println(vmBottle.getProduct("Mineral water"));
        System.out.println(" ПОИСК ГОРЯЧИХ НАПИТКОВ ");
        VendingMachineHot vmHotDrinks = new VendingMachineHot();
        List<HotDrinks> hotDrinksList = new ArrayList<>(Arrays.asList(new HotDrinks("Coffee", new BigDecimal(100),
                0.3, 90), new HotDrinks("Tea", new BigDecimal(15), 0.4, 80),
                new HotDrinks("Milk", new BigDecimal(30), 1.0, 50)));
        vmHotDrinks.initProduct(hotDrinksList);
        System.out.println("Поиск по названию: " + vmHotDrinks.getProduct("Coffee"));
        PrintStream var10000 = System.out;
        String var10001 = vmHotDrinks.getProduct(new BigDecimal(25));
        var10000.println("Поиск по цене: " + var10001);
        System.out.println("Поиск по температуре: " + vmHotDrinks.getProduct(70));
    }

    static enum prod {
        Cola,
        Sprite,
        Fanta;

        private prod() {
        }
    }
}