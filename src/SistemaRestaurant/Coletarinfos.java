package SistemaRestaurant;

public class Coletarinfos {
    private String Nome;
    private String Cpf;
    private Integer pedido;

    public ColetarPedidos pedidos;

    public Coletarinfos() {
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    public Integer getPedido() {
        return pedido;
    }

    public void setPedido(Integer pedido) {
        this.pedido = pedido;
    }
}
