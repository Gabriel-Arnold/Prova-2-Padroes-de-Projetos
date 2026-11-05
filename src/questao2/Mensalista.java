package questao2;

public class Mensalista implements Strategy {

    private double MENSALIDADE = 120.0;

    @Override
    public double execute(int a) {
        return MENSALIDADE;
    }
}
