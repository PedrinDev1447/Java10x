package nivelIntermediario;

public class Sarada extends Haruno implements UchihaHaruno{
    @Override
    public void AtivarCura() {
        System.out.println("Eu sou uma Uchiha Haruno, meu Byakugou foi ativado!");
    }

    @Override
    public void AtivarSharingan() {
        System.out.println("Eu sou uma Uchiha Haruno, meu Sharingan foi ativado!");
    }
}
