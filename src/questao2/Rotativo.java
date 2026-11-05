package questao2;

public class Rotativo implements Strategy {

    private double VALOR_HORA = 15.0;

    @Override
    public double execute(int a) {
        int horasCobradas = (a + 59) / 60;
        return horasCobradas * VALOR_HORA;
    }
}
