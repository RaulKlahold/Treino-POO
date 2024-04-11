package SistemaRestaurant;

public class ExceptioNumeroPedido extends Exception{

    public ExceptioNumeroPedido(){
        super("Só é possível um pedido por vez! ");
}}
