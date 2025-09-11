package Generics;

public class Main {
    public static void main(String[] args) {

        EquipamentosNinjas kunai = new EquipamentosNinjas("Kunais de ferro");
        EquipamentosNinjas shuriken = new EquipamentosNinjas("Shuriekn");
        EquipamentosNinjas pergaminho = new EquipamentosNinjas("Pergaminho de invocação");

        BolsaGenerica<EquipamentosNinjas> bolsaGenerica = new BolsaGenerica<>();
        bolsaGenerica.adicionarEquipamentos(kunai);
        bolsaGenerica.adicionarEquipamentos(shuriken);
        bolsaGenerica.adicionarEquipamentos(pergaminho);

        System.out.println(bolsaGenerica);


    }
}
