package Generics;

public class Main {
    public static void main(String[] args) {


    BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
    bolsaNinja.adicionarFerramenta(new Kunai("Kunai explosiva"));
    bolsaNinja.adicionarFerramenta(new Kunai(20));

        System.out.println();

    }
}
