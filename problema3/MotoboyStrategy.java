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
    public double getValor(Pedido pedido) throws Exception {

        if (pedido.getMassa() > 25000 || pedido.getQuantidadeItens() > 30) {
            throw new TipoEntregaInvalidoException("Só é permitido até 30 itens ou no máximo 25Kg");
        }
        return 7;
    }

}
