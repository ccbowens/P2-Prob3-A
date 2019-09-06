
/**
 *
 * @author Camila
 */
public class ItemPedido {

    //Atributos
    private Produto produto;
    private int quantidade;
    

    //Construtor

    protected ItemPedido(Produto produto, int quantidade) {
        this.setProduto(produto);
        this.setQuantidade(quantidade);
    }
    
    
    //Getter e Setter

    protected Produto getProduto() {
        return produto;
    }

    protected void setProduto(Produto produto) {
        this.produto = produto;
    }

    protected int getQuantidade() {
        return quantidade;
    }

    protected void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    protected double getValorItem(){
            return produto.getValor();}
    
    
}
