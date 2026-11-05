package questao1;

public class Main {

    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 10);

        Compras compras = new Compras();

        Vendas vendas = new Vendas();

        Auditoria auditoria = new Auditoria();

        produto.adicionarObserver(compras);

        produto.adicionarObserver(vendas);

        produto.adicionarObserver(auditoria);

        produto.setQuantidade(7);

        produto.setQuantidade(3);

        produto.setQuantidade(0);

        produto.setQuantidade(8);

        produto.setQuantidade(8);

        produto.removerObserver(auditoria);

        produto.setQuantidade(2);
    }
}
