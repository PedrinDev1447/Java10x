package NivelIntermediario_AbstractXInterface;

public class Uzumaki extends Ninja implements NinjaInterface{
    public void tacarUmaShuriken(){
        System.out.println("Eu taquei uma shuriken");
    }


   @Override
    public  void nomeDoNinja(){
        System.out.println("Naruto Uzumaki");
    }
    public void elementoDominante(){
        System.out.println("Ar");
    }
}
