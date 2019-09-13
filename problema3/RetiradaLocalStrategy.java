package problema3;

public class RetiradaLocalStrategy implements EntregaStrategy {

    private static RetiradaLocalStrategy instancia;

    public static RetiradaLocalStrategy getInstancia() {
        if (instancia == null) {
            instancia = new RetiradaLocalStrategy();
        }
        return instancia;
    }

    private RetiradaLocalStrategy() {

    }

    @Override
    public double getValor(Pedido pedido) {
        return 0;
    }

}
