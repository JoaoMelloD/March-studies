package solid.ocp.before;

public class Order {
    private float amount;


    public Order(float amount) {
        this.amount = amount;
    }

    public void applyFixedDiscount(float discount){
        if(discount > this.amount){
            System.out.println("Desconto não pode ser maior que o valor do pedido");
        }

        this.amount = this.amount - discount;
    }

    public void applyPercentageDiscount(float percentage){
        if(percentage > 100 || percentage <= 0){
            System.out.println("Insira um percentual entre 1% e 100%");
        }

        this.amount = this.amount - (this.amount * percentage / 100);
    }

    public float getAmount() {
        return amount;
    }
}
