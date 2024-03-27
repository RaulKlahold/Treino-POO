package CalculadoraS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
     ColetarDados var = new ColetarDados();
     Scanner scan = new Scanner(System.in);

     System.out.print("\nDigite o Primeiro numero: ");
     double primeiroNum = scan.nextDouble();
     var.setNum1(primeiroNum);

     System.out.print("\nDigite o Segundo numero: ");
     double segundoNum = scan.nextDouble();
     var.setNum2(segundoNum);

     try {
      double resultado = FunctionAction.function(var);
      System.out.print("\nO resultado é: " + resultado);
     }
     catch (Numberexception n){
      System.out.print(n.getMessage());
     }



    }
}
