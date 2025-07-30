package Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {


        Scanner caixaDeTexto = new Scanner(System.in);
        System.out.println("Escreve o nome do ninja aqui:");

        String nomeDoInja = caixaDeTexto.nextLine();

        System.out.println("O nome do ninja: " + nomeDoInja);
        caixaDeTexto.close();

    }
}
