package prototype;

public class Main {
    static void main(String[] args) {
        EnderecoEntrega endereco = new EnderecoEntrega("Rua das Flores", 123);
        Pedido pedidoOriginal = new Pedido(1, "Notebook Gamer", endereco, "Vinícius");

        System.out.println("Pedido Original: " + pedidoOriginal);

        Pedido pedidoClone = pedidoOriginal.clone();
        pedidoClone.setCodigo(2);
        pedidoClone.setNomeCliente("Maria");
        pedidoClone.getEnderecoEntrega().setNumero(456);

        System.out.println("Pedido Clonado: " + pedidoClone);
        System.out.println("Pedido Original após clone: " + pedidoOriginal);
    }
}
