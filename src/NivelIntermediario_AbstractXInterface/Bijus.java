package NivelIntermediario_AbstractXInterface;

public enum Bijus {

    SHUKAKU(1,"Shukaku","Gaara"),
    MATATABI(2, "Matatabi", "Yugito Nii"),
    ISOBU(3, "Isobu", "Yagura"),
    SON_GOKU(4, "Son Goku", "Roshi"),
    KOKUO(5, "Kokuo", "Han"),
    SAIKEN(6, "Saiken", "Utakata"),
    CHOMEI(7, "Chomei", "Fuu"),
    GYUKI(8, "Gyuki", "Killer Bee"),
    KURAMA(9, "Kurama", "Naruto Uzumaki");

    int numeroDeCaldas;
    String nomeBiju;
    String jinchuriki;

    Bijus() {
    }

    Bijus(int numeroDeCaldas, String nomeBiju, String jinchuriki ) {
        this.numeroDeCaldas = numeroDeCaldas;
        this.nomeBiju = nomeBiju;
        this.jinchuriki = jinchuriki;

    }
}
