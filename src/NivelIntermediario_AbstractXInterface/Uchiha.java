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


}
