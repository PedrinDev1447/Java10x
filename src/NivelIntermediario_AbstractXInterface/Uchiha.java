package NivelIntermediario_AbstractXInterface;

public class Uchiha extends Ninja{

    public Uchiha() {
        super( );
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }



    @Override
    public  void nomeDoNinja(){
        System.out.println("Nome: Sasuke Uchiha");
    }

    public void elementoDominante(){
        System.out.println("Fogo");
    }
}
