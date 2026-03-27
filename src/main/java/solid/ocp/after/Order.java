package solid.ocp.after;

public class Order {
    private float amount;
    private DiscountInterface discount = null;


    public Order(float amount) {
        this.amount = amount;
    }

    public void setDiscount(DiscountInterface discount) {
        this.discount = discount;
    }

    public float getAmount() {
        if(this.discount != null) {
            this.amount = this.discount.apply(this.amount);
        }
        return amount;
    }
}
