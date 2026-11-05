package questao3.complementos;

import questao3.Bebida;
import questao3.Decorator;

public class AcucarDecorator extends Decorator {

    public AcucarDecorator(Bebida bebida) { super(bebida); }

    @Override
    public String descricao() { return bebida.descricao() + " com açucar"; }

    @Override
    public double custo() { return bebida.custo() + 1.0; }
}
