package Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {


        /*
        * Laços de repeticao: irao repetir infinitamente até voce atingir o parametro desejado
        *WHILE = FOR
        * */

        //WHILE
        //while (condicao) {Tudo aqui vai acontecer};

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        while (numeroDeClones <= numeroMaximoDeClones) {
            numeroDeClones++;
            System.out.println("O naruto fez um clone das sombras" + numeroDeClones);

            //For

            for (int i = 0; i <= numeroMaximoDeClones; i++) {
                System.out.println("O naruto esta se clonando e ja se aclonou " + i);

            }
        }
    }
}
