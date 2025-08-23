package NivelIntermediario_AbstractXInterface;

public abstract class Ninja implements EstrategiaDeBatalha {
  //Caso eu de um "extends" em uma classe já extendida de outra, não é necessario da o extends na classe objeto
    String nome;
    String aldeia;
    int idade;

    //metodos abstratos

    public abstract void nomeDoNinja();
    //nao tem corpo

    public void tacarKunai(){
        System.out.println("Eu taquei uma Kunai");
    }

    //Sobreescrevendo o método da interface
    @Override
    public void estrategiaDeBatalha() {
        System.out.println("Meu nome é " + nome + ". Essa é minha estrategia de batalha.");

    }
}
