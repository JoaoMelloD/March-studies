package solid.isp.payment;

import solid.isp.payment.contracts.DocumentGenerableInterface;

public class Boleto implements PaymentMethodInterface, DocumentGenerableInterface {
    @Override
    public void pay() {

    }

    @Override
    public void generateDocument(){
        // Logica para gerar documento do boleto
    }
}
