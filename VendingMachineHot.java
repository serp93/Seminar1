package org.example.hw;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VendingMachineHot implements VendingMachine {
    List<HotDrinks> hotDrinksList = new ArrayList();
    List<HotDrinks> resultFind = new ArrayList();

    public VendingMachineHot() {
    }

    public void initProduct() {
    }

    public void initProduct(List<HotDrinks> list) {
        this.hotDrinksList = list;
    }

    public String getProduct() {
        return null;
    }

    public String getProduct(String name) {
        this.resultFind.clear();
        Iterator var2 = this.hotDrinksList.iterator();

        while(var2.hasNext()) {
            HotDrinks el = (HotDrinks)var2.next();
            if (el.getName().equals(name)) {
                this.resultFind.add(el);
            }
        }

        return this.resultFind.toString();
    }

    public String getProduct(BigDecimal price) {
        this.resultFind.clear();
        Iterator var2 = this.hotDrinksList.iterator();

        while(true) {
            if (!var2.hasNext()) break;
            HotDrinks el = (HotDrinks)var2.next();
            if (el.getPrice().compareTo(price) <= 0) {
                this.resultFind.add(el);
            }
        }

        return this.resultFind.toString();
    }

    public String getProduct(int temp) {
        this.resultFind.clear();
        Iterator var2 = this.hotDrinksList.iterator();

        while(true) {
            if (!var2.hasNext()) break;
            HotDrinks el = (HotDrinks)var2.next();
            if (el.getTemp() <= temp) {
                this.resultFind.add(el);
            }
        }

        return this.resultFind.toString();
    }
}
