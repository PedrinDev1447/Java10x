package Generics;

public class Kunai extends Main{
    private String nome;

    public Kunai(String kunai) {
        super();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Kunai: " + nome;
    }
}
