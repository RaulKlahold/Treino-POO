package SistemaRestaurant;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) throws ExceptioNumeroPedido{
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

       try {
         String ficha = ColetarPedidos.Pedido(infos);

         System.out.print("\n------- Ficha do Pedido --------\n");
         System.out.print("\n Olá," + infos.getNome() + "Seja bem vindo!");
         System.out.print("\nUsuário do CPF: " + infos.getCpf());
         System.out.print("\nSua pedido foi : \n" + ficha);
         System.out.print("\nObrigado pela preferência! \n");

       } catch (ExceptioNumeroPedido e){
         System.out.print(e.getMessage());
       }







     }
}
