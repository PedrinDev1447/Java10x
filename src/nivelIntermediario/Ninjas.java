package nivelIntermediario;

public class Ninjas {
    public String nome;
    public String aldeia;
    public int idade;

    //O método VOID nao retorna método nenhum
    public void SharinganAtivado() {
        System.out.println("O Sharingan foi ativado");
    }

    @Override
    public String toString() {
        return "Ninja: " + nome +
                " | Aldeia: " + aldeia +
                " | Idade: " + idade;
    }
    /*
    * O método String tem que retornar uma String
    * */

    public String EuSouUmNinja(){
        return "Hi, I'm Ninja";

    }

    public int anosParaSeTornarHokage(int idadeMinimaParaSeTornarHokage){
        return idadeMinimaParaSeTornarHokage - idade ;
    }
}
