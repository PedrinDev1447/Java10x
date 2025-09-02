package NivelIntermediario_AbstractXInterface;

public abstract  class Main {
    public static void main(String[] args) {

        System.out.println("--------------------Naruto Uzumaki--------------------");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da folha",17  );
        System.out.println(naruto.toString());
        System.out.println(naruto.altura);


        System.out.println("--------------------Sasuke Uchiha--------------------");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da folha", 17);
        System.out.println(sasuke.toString());

        System.out.println("--------------------Anbu--------------------");

        Anbu ninjaAnbu = new Anbu();
        ninjaAnbu.nome = "Ninja Aleatório";
        System.out.println(ninjaAnbu);


    }
}
