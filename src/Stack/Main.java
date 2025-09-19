package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        //Array
        //Arrays sao estaticos e tem referencia de memoria
        String [] ninjasArray = new String[3];
        ninjasArray[0] = "Nauro Uzumaki";

        //Listas
        //Lista sao dinamicas e tamanho pode ser aumentado e diminuido quando necessario
        List<String> ninjaList = new ArrayList<>();
        ninjaList.add("Naurto Uzumaki");

        //Stack
        //O ultimo elemento que entrou é o primeiro a sair
        Stack<String> ninjaStack = new Stack<>();
        ninjaStack.add("Naruto Uzumaki");
        ninjaStack.push("Sakura Haruno");
        ninjaStack.push("Sasuke Uchiha");
        ninjaStack.push("Kakashi Hatake");
        ninjaStack.push("Pedrao monstro de konoha");
        System.out.println("Minha stack atual = " + ninjaStack);
        ninjaStack.pop();
        System.out.println("Stack atualizada com pop = " + ninjaStack);
        System.out.println("Stack atualizada com peek = " + ninjaStack.peek());
        System.out.println("Tamanho da stack = " + ninjaStack.size() + " elementos");


    }
}
