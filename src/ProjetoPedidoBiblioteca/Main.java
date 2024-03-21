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


    }
}