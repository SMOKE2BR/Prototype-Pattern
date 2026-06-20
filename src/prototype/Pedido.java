package prototype;

public class Pedido implements Cloneable {
    private int codigo;
    private String descricao;
    private EnderecoEntrega enderecoEntrega;
    private String nomeCliente;

    public Pedido(int codigo, String descricao, EnderecoEntrega enderecoEntrega, String nomeCliente) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.enderecoEntrega = enderecoEntrega;
        this.nomeCliente = nomeCliente;
    }

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public EnderecoEntrega getEnderecoEntrega() { return enderecoEntrega; }
    public void setEnderecoEntrega(EnderecoEntrega enderecoEntrega) { this.enderecoEntrega = enderecoEntrega; }

    public String getNomeCliente() { return nomeCliente; }
    public void setNomeCliente(String nomeCliente) { this.nomeCliente = nomeCliente; }

    @Override
    public Pedido clone() {
        try {
            Pedido clone = (Pedido) super.clone();
            clone.enderecoEntrega = enderecoEntrega.clone(); // clone profundo
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Erro ao clonar Pedido", e);
        }
    }

    @Override
    public String toString() {
        return "Pedido #" + codigo + " - " + descricao + " | Cliente: " + nomeCliente + " | Endereço: " + enderecoEntrega;
    }
}
