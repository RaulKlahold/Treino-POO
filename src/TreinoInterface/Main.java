package TreinoInterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Cachorro cachorro = new Cachorro();
        Scanner scan =new Scanner(System.in);

         System.out.println("Diga a raça de um cachorro");
         String cachorro1 = scan.nextLine();
         cachorro.setNome(cachorro1);

         String resultante = cachorro.correr();
         System.out.println("O "+cachorro.getNome()+" ele corre?"+resultante);


        
        
    }
    
}
