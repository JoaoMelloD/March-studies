package solid.srp.before;

public class Order {
    private String uuid;
    private float amount;

    public Order(String uuid, float amount) {
        this.uuid = uuid;
        this.amount = amount;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
