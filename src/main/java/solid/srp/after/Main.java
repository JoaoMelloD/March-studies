package solid.srp.after;

public class Main {
    public static void main(String[] args) {
    //Implementação de exemplo sem aplicar o principio de responsabilidade unica
        Order order = new Order("132213123",12 );

        InventoryChecker inventoryChecker = new InventoryChecker();
        OrderCalculator orderCalculator = new OrderCalculator();
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        inventoryChecker.check(order);
        orderCalculator.calculate(order);
        paymentProcessor.process(order);
    }
}
