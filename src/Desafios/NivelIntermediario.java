package Desafios;

import java.util.Scanner;

public class NivelIntermediario {
    public static void main(String[] args) {

        //Entrada de dados
        Scanner scanner = new Scanner(System.in);

        //Fazer o array
        int NUMBER_MAX = 10;
        String[] ninja = new String[NUMBER_MAX];



        //Contadores

        int ninjasRegister = 0;
        int option = 0;

        while (option != 3) {

            // Menu
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();

            switch (option){
                case 1:
                    if (ninjasRegister < NUMBER_MAX){
                        System.out.println("Digiste o nome do ninja para cadastro: ");
                        String nameNinjas = scanner.nextLine();
                        ninja[ninjasRegister] = nameNinjas;
                        ninjasRegister++;
                        System.out.println("Ninja cadastrado com sucesso!");
                    }else  {
                        System.out.println("A lista de ninjas está cheia, impossivel cadastrar um novo ninja.");
                    }
                    break;
                case 2:
                    if (ninjasRegister == 0){
                        System.out.println("Nenhum ninja foi encontrado ");
                    }else {
                        System.out.println("\n===== Lista de Ninjas =====");
                        for (int i = 0; i < ninja.length; i++) {
                            System.out.println(ninja[i]);
                        }
                    }
                    break;
                case 3:
                        System.out.println("Obrigado pelo cadastro! Estamos terminando o programa...Aguarde");
                        break;
                default:
                    System.out.println("Esta opção não é valida");
                    break;




            }
        }

    }
}
