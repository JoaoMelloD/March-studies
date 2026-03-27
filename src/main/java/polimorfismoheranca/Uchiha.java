package polimorfismoheranca;

public class Uchiha extends Ninja implements Sharingan {
    public Uchiha(String nome) {
        super(nome);
    }

    @Override
    public void ativarSharingan() {
        System.out.println("Sharingan Ativado!" + this.nome);
    }
}
