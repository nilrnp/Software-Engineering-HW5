package Homework5;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestClass {
    @Test
    public void testMenuItem() {
        MenuItem burger = new MenuItem("Burger", 5.99);
        burger.addTopping("Cheese", 1.00);
        burger.addTopping("Lettuce", 0.50);
        assertEquals(7.49, burger.getPrice(), 0.001);
    }

    @Test
    public void testOrder() {
        MenuItem burger = new MenuItem("Burger", 5.99);
        burger.addTopping("Cheese", 1.00);
        burger.addTopping("Lettuce", 0.50);

        MenuItem fries = new MenuItem("Fries", 2.49);
        fries.addTopping("Ketchup", 0.25);

        Order order = new Order();
        order.addItem(burger);
        order.addItem(fries);
        assertEquals(10.23, order.calculateTotalCost(), 0.001);
    }

    @Test
    public void testLoyaltyDiscount() {
        LoyaltyDiscount loyaltyStatus = new LoyaltyDiscount();
        assertEquals(80.0, loyaltyStatus.applyDiscount(100.0), 0.001);
    }

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("Main");
    }
}
