package DesafioIntermediario;

public class Main {
    public static void main(String[] args) {
        NinjaBasico naruto = new NinjaBasico("Naurto",18,"Aldeia da folha "," Hazengan");
        naruto.mostrarInformacoes();
        naruto.executarHabilidade();


        NinjaBasico sakura = new NinjaBasico("Sakura",18,"AAldeia da folha","Cura");
        sakura.mostrarInformacoes();
        sakura.executarHabilidade();

        NinjaBasico sasuke = new NinjaBasico("Sasuke",18,"Aldeia da folha","Jutsu Bola de fogo");
        sasuke.mostrarInformacoes();
        sasuke.executarHabilidade();

        NinjaBasico pedro = new NinjaBasico("Pedro",23,"aldeia de sao paulo","Programacao");
        pedro.mostrarInformacoes();
        pedro.executarHabilidade();

    }

}
