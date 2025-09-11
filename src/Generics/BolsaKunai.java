package Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaKunai extends Main {

    private List<Kunai> kunais;

    public BolsaKunai() {
        this.kunais = new ArrayList<>();
    }

    public void adicionarKunais(Kunai kunai) {
        kunais.add(kunai);

    }

    public List<Kunai> getKunais() {
        return kunais;
    }

    public void setKunais(List<Kunai> kunais) {
        this.kunais = kunais;
    }

    @Override
    public String toString() {
        return "Bolsa de Kunais: " + kunais.toString();
    }
}
