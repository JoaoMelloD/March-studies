package solid.dip;

public class OrderProcessorService {
    final private GatewayPaymentInterface paymentGateway;

    public OrderProcessorService(GatewayPaymentInterface paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void processOrder(Order order){
        // Logica para o processamento do pedido
        this.paymentGateway.pay(order);
    }
}
