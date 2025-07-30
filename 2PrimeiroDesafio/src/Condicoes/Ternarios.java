package Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        /*
        * usados para reduzir os códigos
        * variavel = (consdição) ? valorSeForVerdadeiro : valorSeForFalso
        * */

        short numeroDeMissoes = 11;
        String nivelDoNinja = (numeroDeMissoes >= 10) ? "Esse ninja está com mais de 10 missões" : "Esse ninja tem menos de 10 missoes";
        System.out.println(nivelDoNinja);


    }
}
