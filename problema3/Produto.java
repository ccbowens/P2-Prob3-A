
/**
 *
 * @author Camila
 */
public class Produto {

//Atributos
    private String descricao;
    private double valor;
    private int peso;
    
//Construtor

    public Produto(String descricao, double valor, int peso) {
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setPeso(peso);
    }

//Getter e setter    

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    
    
}
