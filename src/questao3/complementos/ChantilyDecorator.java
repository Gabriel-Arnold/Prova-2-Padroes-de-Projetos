package questao3.complementos;

import questao3.Bebida;
import questao3.Decorator;

public class ChantilyDecorator extends Decorator {

    public ChantilyDecorator(Bebida bebida) { super(bebida); }

    @Override
    public String descricao() { return bebida.descricao() + " com chantily"; }

    @Override
    public double custo() { return bebida.custo() + 2.50; }
}
