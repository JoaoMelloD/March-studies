package solid.dip;

public class StrypePaymentGateway implements GatewayPaymentInterface {
    @Override
    public void pay(Order order){
        // Vai ter a logica de pagar
        StripeClient stripe = new StripeClient();
    }
}
