package solid.lsp.invariance;

public class BankAccount {
    protected float balance = 0;


    public BankAccount(float balance) {
        this.balance = balance;
    }

    public void withdraw(float amount){
        if(amount <= 0){
            System.out.println("O valor do saque deve ser positivo!");
        }

        if(amount > this.balance){
            System.out.println("Saldo Insuficiente. O saldo não pode ficar negativo");
        }

        this.balance = this.balance - amount;
    }

    public float getBalance() {
        return this.balance;
    }

}
