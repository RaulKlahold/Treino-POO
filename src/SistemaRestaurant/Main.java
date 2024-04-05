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






     }
}
