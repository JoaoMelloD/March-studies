package solid.srp.after;

final public class OrderProcessorService {
    private  InventoryChecker inventoryChecker;
    private OrderCalculator orderCalculator;
    private PaymentProcessor paymentProcessor;

    public OrderProcessorService(InventoryChecker inventoryChecker, OrderCalculator orderCalculator, PaymentProcessor paymentProcessor) {
        this.inventoryChecker = inventoryChecker;
        this.orderCalculator = orderCalculator;
        this.paymentProcessor = paymentProcessor;
    }


    public void processOrder(Order order){
        this.inventoryChecker.check(order);
        this.orderCalculator.calculate(order);
        this.paymentProcessor.process(order);
    }
}
