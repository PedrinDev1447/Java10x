package Encapsulamento;

public class Main {
    public static void main(String[] args) {
        System.out.println("============== Naruto Uzumaki ==============");
        Uzumaki naruto = new Uzumaki("Naruto", "aldeia da folha",17,30,1.7 );
        System.out.println("Meu nome é, " + naruto.getNome());
        naruto.setNome("Naruto Uzumaki, com o nome alterado.");
        System.out.println("Meu nome é, " + naruto.getNome());


        System.out.println("============== Sasuke Uchiha ==============");
    }
}
