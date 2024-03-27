package Homework5;

public class OrderRunner {
    public static void main(String[] args) {
        MenuItem birriaTaco = new MenuItem("Birria Taco", 5.99);
        birriaTaco.addTopping("Cheese", 1.00);
        birriaTaco.addTopping("Consome", 1.00);

        MenuItem breakfastBurrito = new MenuItem("Breakfast Burrito", 6.99);
        breakfastBurrito.addTopping("Guacamole", 1.99);

        Order John = new Order();
        John.addItem(birriaTaco);
        John.addItem(breakfastBurrito);

        double total = John.calculateTotalCost();
        System.out.println("Total: " + total);

        LoyaltyDiscount johnRewards = new LoyaltyDiscount();
        total = (double) Math.round(johnRewards.applyDiscount(total) * 100) / 100;
        System.out.println("Total after discount: " + total);
    }
}
