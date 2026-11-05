package questao1;

import java.util.ArrayList;
import java.util.List;

public class Produto {

    private String nome;
    private int quantidade;
    private List<Observer> observers = new ArrayList<>();

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public void adicionarObserver(Observer observer) {
        observers.add(observer);
    }

    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setQuantidade(int novaQuantidade) {

        if (novaQuantidade < 0) return;

        if (this.quantidade != novaQuantidade) {

            int quantidadeAnterior = this.quantidade;
            this.quantidade = novaQuantidade;

            notificarObservers(quantidadeAnterior);
        }
    }

    private void notificarObservers(int quantidadeAnterior) {
        for (Observer observer : new ArrayList<>(observers)) {
            observer.atualizar(nome, quantidadeAnterior, quantidade);
        }
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
