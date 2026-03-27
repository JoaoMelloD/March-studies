package polimorfismoheranca;

public class Ninja {
    String nome;


    public Ninja(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome:" + nome;
    }
}
