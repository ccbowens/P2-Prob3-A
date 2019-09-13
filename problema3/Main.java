/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

/**
 *
 * @author rmtiedt
 */
public class Main {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.setStrategy(PACStrategy.getInstancia());
        System.out.println(pedido.getValorTotal());
        pedido.setStrategy(SEDEXStrategy.getInstancia());
        System.out.println(pedido.getValorTotal());
        pedido.setStrategy(RetiradaLocalStrategy.getInstancia());
        System.out.println(pedido.getValorTotal());
        pedido.setStrategy(MotoboyStrategy.getInstancia());
        System.out.println(pedido.getValorTotal());
        pedido.incluirItem(new Produto("Omo Multilação",12,5), 5);
        System.out.println(pedido.getValorPedido());
        System.out.println(pedido.getValorTotal());

        

    }
}
