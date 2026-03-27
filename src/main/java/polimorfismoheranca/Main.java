package polimorfismoheranca;

public class Main {
    public static void main(String[] args) {
        Uchiha sasuke = new Uchiha("Sasuke");
        Uzumaki naruto = new Uzumaki("Naruto");

        System.out.println(naruto);
        System.out.println(sasuke);
        sasuke.ativarSharingan();
    }
}
