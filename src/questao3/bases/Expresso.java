package questao3.bases;

import questao3.Bebida;

public class Expresso implements Bebida {

    @Override
    public String descricao() {
        return "Expresso";
    }

    @Override
    public double custo() {
        return 3.0;
    }
}
