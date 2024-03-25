package ProjetoPedidoBiblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      ColetarDados dados = new ColetarDados();
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite Seu nome: ");
        String nome = scan.next();
        dados.setNome(nome);

        System.out.print("Digite Seu Telefone: ");
        String telefone = scan.next();
        dados.setTelefone(telefone);

        System.out.print("Digite o nome do livro que queira alugar: ");
        String nomeLivro = scan.next();
        dados.setNomeLivro(nomeLivro);
        scan.close();

        System.out.print("\n----- Ficha tecnica -----");
        System.out.print("\n Olá "+dados.getNome()+" tudo bem?");
        System.out.print("\n Seu Numero de telefone para contato é: "+dados.getTelefone());
        System.out.print("\n Você está levando o livro: "+dados.getNomeLivro());



    }
}