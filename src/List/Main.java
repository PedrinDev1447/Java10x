package List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Array
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto Uzumaki";
        ninjasArray[1] = "Sasuke Uchiha";
        ninjasArray[2] = "Sakura Haruno";
        System.out.println("Printando Array = " + ninjasArray[1]);

        //Listas
        //adicionar Lista com add
        List <String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");//index 0
        ninjasList.add("Sasuke Uchiha ");//index 1
        ninjasList.add("Sakura Haruno");//remove

        System.out.println("Printando Listas : " + ninjasList);

        //remover da lista
        //Remove da lista com remove
        ninjasList.remove("Sakura Haruno");
        System.out.println("Printando Listas : " + ninjasList);

        //Trocar
        ninjasList.set(1, "Hashirama Senju");
        System.out.println("ninjaList = " + ninjasList);

        //Tamanho da lista com size
        System.out.println("Tamanho da lista : " + ninjasList.size());
    }
}
