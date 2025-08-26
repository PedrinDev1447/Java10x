package NivelIntermediario_AbstractXInterface;

public class Hatake extends Ninja implements Sharingan, AmbuInterface, HokageInterface{

    public void boasVindas(){
        System.out.println(nome + ": Eu sou um Hatake");
    }

    @Override
    public void sharinganAtivado() {

    }

    @Override
    public void ninjasDeElite() {
        System.out.println(nome + ": Eu sou um ninja de elite da Ambu");
    }

    @Override
    public void hokageAtivo() {
        System.out.println(nome + ": Eu sou um Hokage");
    }
}
