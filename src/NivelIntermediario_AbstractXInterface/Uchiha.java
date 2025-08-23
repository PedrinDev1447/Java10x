package NivelIntermediario_AbstractXInterface;

public class Uchiha extends Ninja{
    public  void estrategiaDeBatalha(){
        System.out.println("Essa é minha estratégia de batalha");
    }

    @Override
    public  void nomeDoNinja(){
        System.out.println("Nome: Sasuke Uchiha");
    }
}
