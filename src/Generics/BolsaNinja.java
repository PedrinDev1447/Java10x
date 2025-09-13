package Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {

    //Inicizalizar nosso array
    private List<T> ferramentas;

    public BolsaNinja(){
        this.ferramentas = new ArrayList<>();
    }



    //Colocar ferramentas  no nosso array

    public void adicionarFerramenta(T ferramenta){
        ferramentas.add(ferramenta);
    }

    //Mostrar a lista de ferramentas
    public void mostrarFerramentas(){
        for (T ferramenta : ferramentas){
            System.out.println(ferramenta);

        }
    }
}

