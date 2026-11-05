package questao3;

import java.util.ArrayList;

public class Pedido {

    public ArrayList<Bebida> bebidas = new ArrayList<>();

    public Pedido() {}

    public String descricao() {
        String descricao = "Itens do pedido:";
        double total = 0;
        for(Bebida item: bebidas) {
            descricao = descricao + "\n - " + item.descricao() + " - custo: " + item.custo();
            total = total + item.custo();
        }
        descricao = descricao + "\nTotal do pedido: " + total;
        return descricao;
    }

    public double custo() {
        double custo = 0;
        for(Bebida item: bebidas) {
            custo = custo + item.custo();
        }
        return custo;
    }
}
