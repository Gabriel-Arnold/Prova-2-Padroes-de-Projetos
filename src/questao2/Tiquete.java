package questao2;

public class Tiquete {

    private Strategy STRATEGY;

    public Tiquete(String placa, Strategy strategy, int tempoDePermanencia) {
        this.STRATEGY = strategy;
        this.tempoDePermanencia = tempoDePermanencia;
        this.PLACA = placa;
    }

    public String PLACA;
    public int tempoDePermanencia;

    public void setSTRATEGY(Strategy strategy) { this.STRATEGY = strategy; }

    public double executeStrategy() { return STRATEGY.execute(this.tempoDePermanencia); }
}
