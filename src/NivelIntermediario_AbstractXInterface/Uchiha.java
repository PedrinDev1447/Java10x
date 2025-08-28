package NivelIntermediario_AbstractXInterface;

public class Uchiha extends Ninja implements Sharingan{


//Esse metodo vem direto da interface!
    @Override
    public void sharinganAtivado() {
        System.out.println(nome + ": Ativou o Sharingan");
    }

    public Uchiha() {
        super( );
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    public void elementoDominante(){
        System.out.println("Fogo");
    }

    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é " + nome + ". Essa é minha INTELIGENCIA de batalha.");

    }

    //Inteligencia de combate - Sobrecarga de métodos
    @Override
    public void inteligenciaDeCombate(int qi) {
        System.out.println("Meu nome é " + nome + ". Essa é minha INTELIGENCIA de batalha.");
        if (qi > 150){
            System.out.println("Seu QI é: " + qi + " e voce é um gênio!");
        } else if (qi >= 130) {
            System.out.println("Seu QI é: " + qi + " e voce é um ninja promissor!");
        } else {
            System.out.println("Seu QI é: " + qi + " e voce é precisa treinar mais suas estratégias");
        }

    }


}
