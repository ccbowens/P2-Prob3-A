package problema3;

/**
 *
 * @author rmtiedt
 */
public class MotoboyStrategy implements EntregaStrategy {

    private static MotoboyStrategy instancia;

    public static EntregaStrategy getInstancia() {
        if (instancia == null) {
            instancia = new MotoboyStrategy();
        }
        return instancia;
    }

    @Override
    public double getValor(Pedido pedido) {

        if (pedido.getMassa() > 25000 || pedido.getQuantidadeItens() > 30) {
            throw new TipoEntregaInvalido();
        }
        return 7;
    }

}
