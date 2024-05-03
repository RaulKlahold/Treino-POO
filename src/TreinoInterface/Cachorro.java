package TreinoInterface;

public class Cachorro implements Actions {
    private String Nome;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    @Override
    public String correr() {
        var s = "O cachorro corre muito";
        return s;


    }
}
