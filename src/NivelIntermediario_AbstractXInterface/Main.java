package NivelIntermediario_AbstractXInterface;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------- Naruto Uzumaki ---------------");

        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da folha", 16, 15, NivelNinja.GENIN, Bijus.KURAMA);
        System.out.println(naruto.bijus);

    }
}