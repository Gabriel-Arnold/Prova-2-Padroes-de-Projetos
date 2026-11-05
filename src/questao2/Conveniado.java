package questao2;

public class Conveniado implements Strategy {

    private double VALOR_HORA = 15.0;
    private int DESCONTO = 15;

    @Override
    public double execute(int a) {
        a = a - 30;
        if(a <= 0) return 0;
        double valor = new Rotativo().execute(a);
        double desconto = (100.0 - DESCONTO) / 100.0;
        return valor * desconto;
    }
}
