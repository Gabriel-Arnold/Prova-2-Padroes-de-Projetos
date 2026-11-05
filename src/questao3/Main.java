package questao3;

import questao3.bases.Cha;
import questao3.bases.Expresso;
import questao3.complementos.AcucarDecorator;
import questao3.complementos.CaldaDecorator;
import questao3.complementos.ChantilyDecorator;
import questao3.complementos.LeiteDecorator;

public class Main {

    public static void main(String[] args) {

        Pedido pedido1 = new Pedido();

        Bebida expresso1 = new Expresso();
        expresso1 = new AcucarDecorator(expresso1);
        expresso1 = new ChantilyDecorator(expresso1);

        pedido1.bebidas.add(expresso1);

        System.out.println(pedido1.descricao());

        Pedido pedido2 = new Pedido();

        Bebida cha1 = new Cha();
        cha1 = new CaldaDecorator(cha1);

        pedido2.bebidas.add(cha1);

        System.out.println(pedido2.descricao());

        Pedido pedido3 = new Pedido();

        Bebida cha2 = new Cha();
        Bebida expresso2 = new Expresso();

        cha2 = new ChantilyDecorator(cha2);
        cha2 = new LeiteDecorator(cha2);
        expresso2 = new ChantilyDecorator(expresso2);
        expresso2 = new LeiteDecorator(expresso2);

        pedido3.bebidas.add(cha2);
        pedido3.bebidas.add(expresso2);
        System.out.println(pedido3.descricao());
    }
}
