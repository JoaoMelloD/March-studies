package solid.srp.before;

public class OrderProcessorService {
    public void processOrder(Order order){
        this.checkInventory(order);
        this.calculateTotal(order);
        this.processPayment(order);
    }
    public void checkInventory(Order order){
        //Logica de checar Inventario
    }
        public void calculateTotal(Order order){
        //Logica de calcular Valor Total
    }
    public void processPayment(Order order){
        //Logica de processar pagamento
    }
}
