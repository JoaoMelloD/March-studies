package solid.lsp.precondition;

public class SavingsAccount extends BankAccount{

    public SavingsAccount(float balance) {
        super(balance);
    }

    @Override
    public void deposit(float amount) {
        if(amount < 10){
            System.out.println("Deposito minimo de R$10 reais.");
        }
        super.deposit(amount);
    }
}
