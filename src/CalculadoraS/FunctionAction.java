package CalculadoraS;

public class FunctionAction {
    public static double function(ColetarDados ColetarDados){

        double numeroUm = ColetarDados.getNum1();
        double numeroDois = ColetarDados.getNum2();

        return (((numeroUm - numeroDois) / numeroDois) * 100);



    }


}
