package CalculadoraS;

public class FunctionAction {
    public static double function(ColetarDados ColetarDados) throws Numberexception{

        double numeroUm = ColetarDados.getNum1();
        double numeroDois = ColetarDados.getNum2();

        if (numeroUm > 0 && numeroDois > 0) {
            return (((numeroUm - numeroDois) / numeroDois) * 100);
        }
        else throw new Numberexception();


    }


}
