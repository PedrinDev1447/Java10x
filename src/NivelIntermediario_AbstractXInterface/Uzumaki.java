package NivelIntermediario_AbstractXInterface;

public class Uzumaki extends Ninja implements NinjaInterface{

    Bijus bijus;

    public Uzumaki() {
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void sharinganAtivado() {

    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank, Bijus bijus) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
        this.bijus = bijus;
    }

    public void tacarUmaShuriken(){
        System.out.println("Eu taquei uma shuriken");
    }



    public void elementoDominante(){
        System.out.println("Ar");
    }

    public Uzumaki(String narutoUzumaki, String aldeiaDaFolha, int i) {
    }




}
