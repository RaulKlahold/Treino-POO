package CalculadoraS;

public class Numberexception extends Exception{
    public Numberexception() {
        super("Só é permitido apenas 1 pedido por vez!");
    }

    public Numberexception(String message) {
        super(message);
    }
}
