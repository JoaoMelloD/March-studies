package solid.ocp.after;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order(200);
        order1.setDiscount(new FixedDiscount(10));

        System.out.println(order1.getAmount());

        Order order2 = new Order(200);
        order2.setDiscount(new PercentageDiscount(10));
        System.out.println(order2.getAmount());

    }
}
