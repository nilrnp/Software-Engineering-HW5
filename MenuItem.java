package Homework5;

import java.util.ArrayList;
import java.util.List;

class MenuItem implements FoodItem {
    private String name;
    private double basePrice;
    private List<String> toppings;
    private List<Double> additionalCosts;

    public MenuItem(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
        this.toppings = new ArrayList<>();
        this.additionalCosts = new ArrayList<>();
    }

    public void addTopping(String topping, double additionalCost) {
        toppings.add(topping);
        additionalCosts.add(additionalCost);
    }

    @Override
    public double getPrice() {
        double totalPrice = basePrice;
        for (Double additionalCost : additionalCosts) {
            totalPrice += additionalCost;
        }
        return totalPrice;
    }

    public String getName() {
        return name;
    }
}
