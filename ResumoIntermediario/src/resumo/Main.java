package resumo;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {


        System.out.println("=============== ARRAY ===============");

        //Arrays
        /*Os arrays sao estaticos, e o que isso quer dizer?
        *Sera sempre necessario declarar o quanto de memoriam voce quer alocar
        * */
        String[] nomeNinjaArray = new String[3];
        nomeNinjaArray[0] = "Naruto Uzumaki";
        nomeNinjaArray[1] = "Sasuke Uchiha";
        nomeNinjaArray[2] = "Sakura Haruno";
        /*
        -Quando eu coloco um numero maior de memoria do que a memoria alocada ele da um erro
         no numero de threads e nao
        e nao compila do código:
        nomeNinjaArray[3] = "Sakura Haruno";
        -obs: Caso eu queira colocar mais um valor, terei que realocar mais memoria
        -Quando voce passa memoria, mas nao coloca o valor na memoria, e dar Cntrl+R ele irá
         devolver que a memoria é "null"
         */

        //Esse sout irá printar a referencia da memória ultilizada
        System.out.println("NomeNinjaArray: " + nomeNinjaArray);
        //Quando eu coloco a referencia do indice ele devolve o valor de referencia colocado
        System.out.println("NomeNinjaArray: " + nomeNinjaArray[0]);

        /*
        A List é mais maleavel do que o Array, mas você pergunta, "Por quê?"
        Pois a lista não precisa ficar realocando memória ela pode almentar e diminuir quando for
         necessario
        No List também ganhamos a ferramenta de poder printar a Lista toda, não será necessario
        printar cada elemento
        como no Array, pois nós ganhamos acesso a nós ganhamos acesso ao method ToString
        Comands:
        Adicionar elementos:.add
        Acessar elementos: get(int index):
        Modificar elementos:set(int index, E element)
        Remover elementos:remove(int index);remove(Object o) e clear()
        Verificar informações:size();isEmpty() e contains(Object o)
        Converter para Array: toArray()

        obs : SAO AS MAIS ULTILIZADAS NO DIA A DIA, POR NAO SER NECESSARIO A REALOCACAO DE MEMORIA
        * */
        System.out.println("=============== LISTA ===============");
        List<String> nomeNinjaList = new ArrayList<>();
        nomeNinjaList.add("Naruto Uzumaki");
        nomeNinjaList.add("Sasuke Uchiha");
        nomeNinjaList.add("Sakura Haruno");
        System.out.println(nomeNinjaList);


        /*Stack = Pilha (coloca um em cima do outro)
        * Lembre-se: "O ultimo que entrou é o primeiro a sair"
        * */
        System.out.println("=============== STACKS ===============");
        Stack<String> nomeNinjaStack = new Stack<>();
        nomeNinjaStack.push("Naruto Uzumaki");
        nomeNinjaStack.push("Sakura Haruno");
        nomeNinjaStack.push("Sasuke Uchiha");
        System.out.println("Mostrar Stack: " + nomeNinjaStack);
        System.out.println("Tirar da stack: " + nomeNinjaStack.pop());



    }
}
