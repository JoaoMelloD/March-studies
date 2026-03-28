package solid.lsp.precondition;

public class BankAccount {
    protected float balance = 0;

    public BankAccount(float balance) {
        this.balance = balance;
    }

    public void deposit(float amount){
        if(amount <= 0){
            System.out.println("O valor do deposito deve ser positivo!");
        }
        this.balance = this.balance + amount;
    }

    public float getBalance() {
        return this.balance;
    }
}
