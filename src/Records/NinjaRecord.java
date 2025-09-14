package Records;

public record NinjaRecord(String nome, String email, int telefone) {

    public String emailEmCaixaAlta(){
        return email.toUpperCase();
    }
}
