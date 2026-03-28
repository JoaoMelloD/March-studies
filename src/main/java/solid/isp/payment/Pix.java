package solid.isp.payment;

import solid.isp.payment.contracts.QrCodeGenerableInterface;

public class Pix implements PaymentMethodInterface, QrCodeGenerableInterface {
    @Override
    public void pay() {
        // Logica para processar pagamento via pix
    }

    @Override
    public void generateQrCode(){
        // Logica para gerar o QrCode
    }
}
