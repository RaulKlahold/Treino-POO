package SistemaRestaurant;

public class ExceptioName extends Exception{
    public ExceptioName(){
        super("O nome precisa conter mais que 3 caracteres, e o CPF precisa conter 11 numeros!");
    }

}
