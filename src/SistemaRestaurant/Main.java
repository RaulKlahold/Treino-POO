package SistemaRestaurant;

import java.util.Scanner;

public class Main {
     public static void main(String[] args){
       Coletarinfos infos = new Coletarinfos();
       Scanner scan = new Scanner(System.in);

       System.out.print("Digite seu nome: ");
       String name = scan.nextLine();
       infos.setNome(name);

       System.out.print("Digite seu CPF: ");
       String Cpf = scan.nextLine();
       infos.setCpf(Cpf);

       System.out.print("Qual o seu pedido?");
       Integer Pedido = scan.nextInt();
       infos.setPedido(Pedido);

       String ficha = Coletarinfos.pedidos(infos);
       System.out.print("------- Ficha do Pedido --------");



     }
}
