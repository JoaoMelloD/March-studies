package solid.lsp.invariance;

public class CheckingAccount extends BankAccount{
    float overdraftLimit;
    public CheckingAccount(float balance, float overdraftLimit) {
        super(balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(float amount){
        if(amount <= 0){
            System.out.println("O valor do saque deve ser positivo");
        }

        float availableBalance = this.balance + this.overdraftLimit;

        if (amount > availableBalance){
            System.out.println("Saldo suficiente e limite de cheque especial");
        }

        this.balance = this.balance - amount;
    }
}
