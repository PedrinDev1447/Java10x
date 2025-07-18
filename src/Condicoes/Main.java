package Condicoes;

public class Main {
    public static void main(String[] args) {

        // Ninja 1
        String nomeNinja1 = "Naruto Uzumaki";
        int idade1 = 14;
        String missao1 = "Econtrar o bandido";
        String statusDamissao1 = "Em andamento";
        char nivelDaMissao1 = 'A';

        //Verificar nível da missao e idade do ninja
        if(idade1 < 15){
            if (nivelDaMissao1 == 'C'|| nivelDaMissao1 == 'D'){
                statusDamissao1= "Concluida";
            } else {
                statusDamissao1= "Missão falhou";
            }

        } else {
            statusDamissao1= "Concluida";
        }
        System.out.println(statusDamissao1);




        System.out.println("Nome do ninja: " + nomeNinja1);
        System.out.println("Idade do ninja: " + idade1);
        System.out.println("Nome da missão: " + missao1);
        System.out.println("Status da missão: " + statusDamissao1);
        System.out.println("Nível da missão: " + nivelDaMissao1);

        System.out.println("--------------------------------------");

        // Ninja 2
        String nomeNinja2 = "Sasuke Uchiha";
        int idade2 = 16;
        String missao2 = "Reconhecimento da aldeia";
        String statusDamissao2 = "Em andamento";
        char nivelDaMissao2 = 'S';

        System.out.println("Nome do ninja: " + nomeNinja2);
        System.out.println("Idade do ninja: " + idade2);
        System.out.println("Nome da missão: " + missao2);
        System.out.println("Status da missão: " + statusDamissao2);
        System.out.println("Nível da missão: " + nivelDaMissao2);

        System.out.println("--------------------------------------");

        // Ninja 3
        String nomeNinja3 = "Sakura Haruno";
        int idade3 = 16;
        String missao3 = "Curar feridos da guerra";
        String statusDamissao3 = "Concluído";
        char nivelDaMissao3 = 'D';


        System.out.println("Nome do ninja: " + nomeNinja3);
        System.out.println("Idade do ninja: " + idade3);
        System.out.println("Nome da missão: " + missao3);
        System.out.println("Status da missão: " + statusDamissao3);
        System.out.println("Nível da missão: " + nivelDaMissao3);

        System.out.println("--------------------------------------");

        System.out.println("Verificação");

    }
}
