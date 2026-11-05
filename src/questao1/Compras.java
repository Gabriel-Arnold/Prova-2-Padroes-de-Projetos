package questao1;

public class Compras implements Observer {

    @Override
    public void atualizar(String nomeProduto, int quantidadeAnterior, int novaQuantidade) {

        if (novaQuantidade < 5) {
            System.out.println("[COMPRAS] Estoque baixo de " + nomeProduto + ": " + novaQuantidade + " unidades.");
        }

    }

}
