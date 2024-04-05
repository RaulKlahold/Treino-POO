package SistemaRestaurant;

public class ColetarPedidos {

       public static String Pedido(Coletarinfos Coletarinfos){

           Integer NumeroPedido = Coletarinfos.getPedido();
           String PedidoRetorno;


           if (NumeroPedido == 1){

                PedidoRetorno = "Pedido 1: Dog duplo com calabresa e bacon + Coca Lata";

            } else if (NumeroPedido == 2) {

               PedidoRetorno = "Xfrango Catupiry + Coca";


           } else if (NumeroPedido == 3) {

               PedidoRetorno ="Xbacon + Coca lata";

           } else {

               PedidoRetorno = "Pedido indisponivel no cardapio";
           }


           return PedidoRetorno;
       }
}
