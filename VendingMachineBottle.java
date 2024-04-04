package org.example.hw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VendingMachineBottle implements VendingMachine {
    List<BottleOfWater> bottleOfWaterList = new ArrayList<>();

    public VendingMachineBottle() {
    }

    public void initProduct() {
    }

    public void initProduct(List<BottleOfWater> bottle) {
        this.bottleOfWaterList = bottle;
    }

    public String getProduct() {
        return null;
    }

    public String getProduct(String name) {
        Iterator var2 = this.bottleOfWaterList.iterator();

        BottleOfWater el;
        do {
            if (!var2.hasNext()) {
                return "Не найдено";
            }

            el = (BottleOfWater)var2.next();
        } while(!el.getName().equals(name));

        return el.toString();
    }
}
