package DesafioIntermediario;

public class NinjaBasico implements Ninja{
    String nome;
    int idade;
    String aldeia;
    String habilidade;


    public void mostrarInformacoes(){
        System.out.println("Este é meu nome: " + nome + " eu tenho " + idade + " anos, eu sou da " + aldeia + " minha habilidade é " + habilidade );
    }

    @Override
    public void executarHabilidade() {

    }

    //metodo construtor cheio
    public NinjaBasico(String nome, int idade, String aldeia, String habilidade ) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
        this.habilidade = habilidade;

    }

}
