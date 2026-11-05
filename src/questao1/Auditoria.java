package questao1;

public class Auditoria implements Observer {

    @Override

    public void atualizar(String nomeProduto, int quantidadeAnterior, int novaQuantidade) {

        System.out.println("[AUDITORIA] Produto: " + nomeProduto + " | Estoque anterior: " + quantidadeAnterior + " | Novo estoque: " + novaQuantidade);

    }

}
