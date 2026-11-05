package questao3.complementos;

import questao3.Bebida;
import questao3.Decorator;

public class CaldaDecorator extends Decorator {

    public CaldaDecorator(Bebida bebida) { super(bebida); }

    @Override
    public String descricao() { return bebida.descricao() + " com calda"; }

    @Override
    public double custo() { return bebida.custo() + 2.50; }
}
