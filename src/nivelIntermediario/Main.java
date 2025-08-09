package nivelIntermediario;

public class Main {
    public static void main(String[] args) {
        Ninjas Narutinho = new Ninjas();
        Narutinho.nome = "Naruto Uzumaki";
        Narutinho.aldeia = "Aldeia da folha";
        Narutinho.idade = 17;


        System.out.println(Narutinho);


        Ninjas Sasuke = new Ninjas();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da folha";
        Sasuke.idade = 18;
        System.out.println(Sasuke);

        int quantoTempoFalta= Sasuke.anosParaSeTornarHokage(70);
        System.out.println("Você tem: " + Sasuke.idade  + " anos, então falta no mínimo: " + quantoTempoFalta + " anos para ser tornar Hokage.");
        Sasuke.EuSouUmNinja();
        Sasuke.SharinganAtivado();

        Ninjas Sakura = new Ninjas();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Aldeia da folha";
        Sakura.idade = 18;

        System.out.println(Sakura);
    }
}
