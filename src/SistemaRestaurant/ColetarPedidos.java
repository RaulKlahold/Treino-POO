package SistemaRestaurant;

public class ColetarPedidos {

       public static String Pedido(Coletarinfos Coletarinfos) throws ExceptioNumeroPedido {

           String NumeroPedido = String.valueOf(Coletarinfos.getPedido());

           String PedidoRetorno;
           if (NumeroPedido.length() == 1) {
               if (NumeroPedido.equals("1")) {

                   PedidoRetorno = "Pedido 1: Dog duplo com calabresa e bacon + Coca Lata";

               } else if (NumeroPedido.equals("2")) {

                   PedidoRetorno = "Xfrango Catupiry + Coca";


               } else if (NumeroPedido.equals("3")) {

                   PedidoRetorno = "Xbacon + Coca lata";

               } else {

                   PedidoRetorno = "Pedido indisponivel no cardapio";
               }
           } else throw new ExceptioNumeroPedido();


           return PedidoRetorno;
       }
}
