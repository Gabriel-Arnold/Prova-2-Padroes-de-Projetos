package questao3.complementos;

import questao3.Bebida;
import questao3.Decorator;

public class LeiteDecorator extends Decorator {

    public LeiteDecorator(Bebida bebida) { super(bebida); }

    @Override
    public String descricao() { return bebida.descricao() + " com leite"; }

    @Override
    public double custo() { return bebida.custo() + 1.50; }
}
