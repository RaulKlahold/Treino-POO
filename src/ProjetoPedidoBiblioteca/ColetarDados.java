package ProjetoPedidoBiblioteca;

public class ColetarDados {
    private String nome;
    private String telefone;
    private String NomeLivro;


    public ColetarDados(){}



    public void setNome(String nome) {
        this.nome = nome;
    }



    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    @Override
    public String toString() {
        return "ColetarDados{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", NomeLivro='" + NomeLivro + '\'' +
                '}';
    }

    public void setNomeLivro(String nomeLivro) {
        NomeLivro = nomeLivro;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeLivro() {
        return NomeLivro;
    }

    public String getTelefone() {
        return telefone;
    }
}
