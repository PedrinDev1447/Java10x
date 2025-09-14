package Records;

public class Main {
    public static void main(String[] args) {

        //Todos os atributos sao Final por deafult
        //Records nao tem SETTER

        NinjaRecord cadastroUsandoRecords = new NinjaRecord("Naruto","narutin@gmail.com",999999999);
        System.out.println("CadastroRecords: " +cadastroUsandoRecords.emailEmCaixaAlta());




    }
}
