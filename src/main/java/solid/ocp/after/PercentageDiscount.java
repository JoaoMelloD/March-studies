package solid.ocp.after;

public class PercentageDiscount implements DiscountInterface{
    private float percentage;
    public PercentageDiscount(float percentage) {
        this.percentage = percentage;
        if(this.percentage > 100 || this.percentage <= 0){
            System.out.println("Insira um percentual entre 1% e 100%");
        }
    }

    @Override
    public float apply(float orderAmount) {


        return orderAmount = orderAmount - (orderAmount * this.percentage / 100);
    }
}
