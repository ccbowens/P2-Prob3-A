package problema3;

public class SEDEXStrategy implements EntregaStrategy {

    private static SEDEXStrategy instancia;

    public static SEDEXStrategy getInstancia() {
        if (instancia == null) {
            instancia = new SEDEXStrategy();
        }
        return instancia;
    }

    private SEDEXStrategy() {

    }

    @Override
    public double getValor(Pedido pedido) throws Exception {
        double massa = pedido.getMassa();
        if (massa <0){
        throw new TipoEntregaInvalidoException("Não existe peso negativo");
        }
        else if (massa < 500) {
            return 12.5;
        } else if (massa < 750) {
            return 20;
        } else if (massa < 1200) {
            return 30;
        } else if (massa < 2000) {
            return 45;
        } else {
            return 45 + (massa - 2000) * 1.5;
        }

    }

}
