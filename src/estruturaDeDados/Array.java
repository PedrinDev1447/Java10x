package estruturaDeDados;

public class Array {
    public static void main(String[] args) {
        //arrys sao tipos referencia

        String[] ninja = new String[5];
        ninja[0] = "Naurto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Kakashi Hatake";

        System.out.println("Nome do ninja: " + ninja[2]);
        //array idade
        int[] idade = new int[2];
        idade[0] = 16;
        idade[1] = 13;
        System.out.println("Idade do ninja: " + idade[0]);

        boolean[] trueOrFlase = new boolean[1];
        trueOrFlase[0]= false;
        System.out.println("Passou para proxima missao? " + trueOrFlase[0]);

        double[] flutuante = new double[2];
        flutuante[0] = 0.1;
        System.out.println("Pontos da missão: " +  flutuante[0]);









    /*    String ninja1 = "Naruto";
        String ninja2 = "Sasuke";
        String ninja3 = "Sakura";
        System.out.println(ninja1);
        System.out.println(ninja2);
        System.out.println(ninja3);*/
    }
}
