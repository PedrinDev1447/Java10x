package NivelIntermediario_AbstractXInterface;

public abstract class Ninja  {

    String nome;
    String aldeia;
    int idade;

    //metodos abstratos

    public abstract void nomeDoNinja();
    //nao tem corpo

    public void tacarKunai(){
        System.out.println("Eu taquei uma Kunai");
    }

}
