package SistemaRestaurant;

public class ExceptioNumeroPedido extends Exception{

    public ExceptioNumeroPedido(){
        super("Só é permitido um pedido por vez! ");
}}
