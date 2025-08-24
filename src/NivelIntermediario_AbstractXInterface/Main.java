package NivelIntermediario_AbstractXInterface;

public abstract  class Main {
    public static void main(String[] args) {


    //obj Naruto
         Uzumaki Naruto = new Uzumaki();
         Naruto.nome = "Naruto Uzumaki";
         Naruto.tacarUmaShuriken();
         Naruto.estrategiaDeBatalha();
         Naruto.elementoDominante();

        System.out.println("=================================================================================");
    //Onjeto sasuke
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.estrategiaDeBatalha();
        Sasuke.elementoDominante();
        System.out.println("=================================================================================");

    }
}
