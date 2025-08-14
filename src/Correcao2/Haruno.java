package Correcao2;

public class Haruno extends Ninja{
    public void CuraAtivada(){
        System.out.println("Meu nome é " + nome + ". A minha cura foi ativada!");
    }
    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade );
        System.out.println("Nome da missão: " + missao);
        System.out.println("Nível de difuculdade: " + nivelDeDificuldade);
        System.out.println("Status da missão: " + statusDaMissao );
    }
}
