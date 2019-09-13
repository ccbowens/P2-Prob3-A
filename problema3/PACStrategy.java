package problema3;

public class PACStrategy implements EntregaStrategy {

    private static PACStrategy instancia;

    public static PACStrategy getInstancia() {
        if (instancia == null) {
            instancia = new PACStrategy();
        }
        return instancia;
    }
    private PACStrategy(){
    
    }

    @Override
    public double getValor(Pedido pedido) {
        double massa = pedido.getMassa();
        if (massa <= 1000) {
            return 10;
        } else if (massa <= 2000) {
            return 15;
        } else if (massa <= 3000) {
            return 20;
        } else if (massa <= 5000) {
            return 30;
        } else {
            throw new TipoEntregaInvalido();
        }

    }

}
