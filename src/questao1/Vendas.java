package questao1;

public class Vendas implements Observer {

    @Override
    public void atualizar(String nomeProduto, int quantidadeAnterior, int novaQuantidade) {
        if (quantidadeAnterior == 0 && novaQuantidade > 0) {
            System.out.println("[VENDAS] Produto " + nomeProduto + " voltou ao estoque!");
        }
    }

}
