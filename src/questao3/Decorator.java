package questao3;

public abstract class Decorator implements Bebida {
    protected Bebida bebida;

    public Decorator(Bebida bebida) { this.bebida = bebida; }
}
