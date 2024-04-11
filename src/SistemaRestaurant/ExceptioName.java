package SistemaRestaurant;

public class ExceptioName extends Exception{
    public ExceptioName(){
        super("O nome deve conter mais que 3 caracteres");
    }

}
