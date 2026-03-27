package solid.srp.before;

public class Main {
    public static void main(String[] args) {
    //Implementação de exemplo sem aplicar o principio de responsabilidade unica
        Order order = new Order("132213123",12 );
        OrderProcessorService orderProcessorService = new OrderProcessorService();
        orderProcessorService.processOrder(order);

    }
}
