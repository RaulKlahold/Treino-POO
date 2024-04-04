package SistemaRestaurant;

public class ColetarPedidos {

       public void Pedido(Coletarinfos Coletarinfos){

           Integer NumeroPedido = Coletarinfos.getPedido();



           if (NumeroPedido == 1){

                System.out.print("Pedido 1: Dog duplo com calabresa e bacon + Coca Lata");

            } else if (NumeroPedido == 2) {

               System.out.print("Xfrango Catupiry + Coca");


           } else if (NumeroPedido == 3) {

               System.out.print("Xbacon + Coca lata");

           } else {

               System.out.print("Pedido indisponivel no cardapio");
           }


       }
}
