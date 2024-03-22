package CalculadoraS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
     ColetarDados var = new ColetarDados();
     Scanner scan = new Scanner(System.in);

     System.out.print("Digite o primeiro numero");
     double primeiroNum = scan.nextDouble();
     var.setNum1(primeiroNum);

     System.out.print("Digite os segundo numero: ");
     double segundoNum = scan.nextDouble();
     var.setNum2(segundoNum);




    }
}
