package Enums;

public enum RankDeMissoes {
    //Dias da semana
    // SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA;

    D("Baixo",1),
    C("Médio",2),
    B("Alto",3),
    A("Muito alto",4),
    S("Apenas para Rank S",5);

    private String descricao;
    private int dificuldade;

    RankDeMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }
}
