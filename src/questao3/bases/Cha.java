package questao3.bases;

import questao3.Bebida;

public class Cha implements Bebida {

    @Override
    public String descricao() {
        return "Chá";
    }

    @Override
    public double custo() {
        return 5.0;
    }
}
