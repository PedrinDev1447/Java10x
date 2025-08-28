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
        System.out.println("Meu nome é " + nome + ". Essa é minha ESTRATEGIA de batalha.");

    }

    //Sobrecarga de métodos - Método padrão

  @Override
  public void inteligenciaDeCombate() {
    System.out.println("Meu nome é " + nome + ". Essa é minha INTELIGENCIA de batalha.");

  }

  //Inteligencia de combate - Sobrecarga de métodos
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
 //método sem override
  public void metodoProvisorio(){
    System.out.println("Teste na classe uchiha");
  }


}
