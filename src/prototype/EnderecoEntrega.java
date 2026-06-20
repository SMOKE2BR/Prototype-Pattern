package prototype;

public class EnderecoEntrega implements Cloneable {
    private String logradouro;
    private Integer numero;

    public EnderecoEntrega(String logradouro, Integer numero) {
        this.logradouro = logradouro;
        this.numero = numero;
    }

    public String getLogradouro() { return logradouro; }
    public void setLogradouro(String logradouro) { this.logradouro = logradouro; }

    public Integer getNumero() { return numero; }
    public void setNumero(Integer numero) { this.numero = numero; }

    @Override
    public EnderecoEntrega clone() {
        try {
            return (EnderecoEntrega) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Erro ao clonar EnderecoEntrega", e);
        }
    }

    @Override
    public String toString() {
        return logradouro + ", " + numero;
    }
}
