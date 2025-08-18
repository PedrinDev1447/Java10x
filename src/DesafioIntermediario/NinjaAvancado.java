package DesafioIntermediario;

public class NinjaAvancado extends NinjaBasico implements Ninja{
    String especialidade;
    public void executarHabilidade(){
        System.out.println("Eu irei executar minha " +  habilidade + " e minha especialidade é " + especialidade  );

    }

    public NinjaAvancado(String nome, String aldeia, String habilidade, int idade, String especialidade) {
        super(nome, idade, aldeia, habilidade );
        this.especialidade = especialidade;
    }
}
