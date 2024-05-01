package TreinoInterface;

public class Cachorro implements Actions {
    public String Nome;

    @Override
    public void correr() {
        System.out.println("O cachorro corre muito");

    }
}
