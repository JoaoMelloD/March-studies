package solid.ocp.before;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order(200);
        order1.applyFixedDiscount(50);
        System.out.println(order1.getAmount());

        Order order2 = new Order(200);
        order2.applyPercentageDiscount(10);
        System.out.println(order2.getAmount());

    }
}
