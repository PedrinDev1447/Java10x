package Correcao2;

import nivelIntermediario.Hyuga;

public class Main {
    public static void main(String[] args) {


    //Inicializar o objeto
    Uchiha sasuke = new Uchiha();
    sasuke.nome = "Sasuke Uchiha";
    sasuke.idade = 18;
    sasuke.missao = "Recuperar o amuleto";
    sasuke.nivelDeDificuldade = "Alta" ;
    sasuke.statusDaMissao = "Em andamento";
    sasuke.habilidadeEspecial = "Sharingan";
    sasuke.mostrarInformacoes();

    //Inicializar objeto
        Haruno sakura = new Haruno();
        sakura.nome = "Sakura Haruno";
        sakura.idade = 18;
        sakura.missao = "Curar Hokage";
        sakura.nivelDeDificuldade= "Alta";
        sakura.statusDaMissao = "Em andamento";
        sakura.habilidadeEspecial = "Byakugou";
        sakura.mostrarInformacoes();

    }
}
