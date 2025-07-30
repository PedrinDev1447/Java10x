package Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {
        /*
        * SwitchCases: Que servem pra gerar casos especificos
        * Objetivo: Pedir pro usuario escolher entre os ninjas
        * switchCases
        * */



        //Pedir para o usuario colocar um determinado dado
        Scanner scanner = new Scanner(System.in);


        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki ");
        System.out.println("2 - Sasuke Uchiha ");
        System.out.println("3 - Sakura Haruno");

        //Pedir para o usuario escolher alguma opcao
        int escolhaDoUsuario = scanner.nextInt();
        System.out.println("Você digitou o numero: " + escolhaDoUsuario);

        //Reacao ao escolher um personagem

        switch (escolhaDoUsuario){
            case 1:
                System.out.println(" O usuario escolheu o Naruto Uzumaki. ");
                break;
            case 2:
                System.out.println(" O usuario escolheu o Sasuke Uchiha o revoltadinho. ");
                break;
            case 3:
                System.out.println(" O usuario escolheu o Sakura Haruno. ");
                break;
            default:
                System.out.println("Você nao digitou uma resposta valida! Tente novamente. ");
        }




        scanner.close();
    }



}
