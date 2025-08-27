package NivelIntermediario_AbstractXInterface;

public abstract class Ninja implements EstrategiaDeBatalha {
  //Caso eu de um "extends" em uma classe já extendida de outra, não é necessario da o extends na classe objeto

  //TODO: Incluir 2 novos atributos: numeroDeMissoesConcluidas, Rank
  //TODO: Rank: Gennin, Chunnin, Jounnin, Hokage
    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;


  public Ninja() {
  }

  public Ninja(String nome, String aldeia, int idade) {
    this.nome = nome;
    this.aldeia = aldeia;
    this.idade = idade;
  }

  //TODO: Sobrecarga do construtor chamado os novos atributos
  //Sobrecarga de métodos, voce precisa redeclarar os construtores usados junto aos novos

  public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
    this(nome,aldeia,idade);
    this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
    this.rank = rank;
  }

  //metodos abstratos
    public void tacarKunai(){
        System.out.println("Eu taquei uma Kunai");
    }

    //Sobreescrevendo o método da interface
    @Override
    public void estrategiaDeBatalha() {
        System.out.println("Meu nome é " + nome + ". Essa é minha estrategia de batalha.");

    }


}
