package estruturaDeDados;

public class Array {
    public static void main(String[] args) {
        //arrays sao tipos referencia

        String[] ninja = new String[6];
        ninja[0] = "Naurto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Kakashi Hatake";

       // System.out.println("Nome do ninja: " + ninja[2]);

        //Redeclarar
        ninja =  new String[7];
        ninja[0] = "Hashirama Senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Hiruzen Sarutobi";
        ninja[3] = "Minato Namikaze";
        ninja[4] = "Tsunade";
        ninja[5] = "Kakashi Hatake";
        ninja[6] = "Naruto Uzuamaki";
       // System.out.println("Nome do ninja: " + ninja[2]);

        //For para fazer um LOOP no array
        for (int i = 0; i < 7; i++) {
            System.out.println(ninja[i]);
        }



        //array idade
        int[] idade = new int[2];
        idade[0] = 16;
        idade[1] = 13;
        //System.out.println("Idade do ninja: " + idade[0]);


        boolean[] trueOrFlase = new boolean[1];
        trueOrFlase[0]= false;
        //System.out.println("Passou para proxima missao? " + trueOrFlase[0]);

        double[] flutuante = new double[2];
        flutuante[0] = 0.1;
        //System.out.println("Pontos da missão: " +  flutuante[0]);










    /*    String ninja1 = "Naruto";
        String ninja2 = "Sasuke";
        String ninja3 = "Sakura";
        System.out.println(ninja1);
        System.out.println(ninja2);
        System.out.println(ninja3);*/
    }
}
