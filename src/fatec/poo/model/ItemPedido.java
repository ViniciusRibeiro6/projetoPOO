/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author vinicius
 */
public class ItemPedido {

    static ArrayList<ItemPedido> get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private int sequencia;
    private double qtdeVendida;
    private Produto produto;
    private Pedido pedido;
    
    public ItemPedido (int s, double qv, Produto p){
        this.sequencia = s;
        this.qtdeVendida = qv;
        this.produto = p;
        p.setQtdeEstoque (p.getQtdeEstoque() - qtdeVendida);
        
    }
    
    public void setPedido (Pedido p){
        pedido = p;
    }
    
    public void addProduto (Produto p){
        produto = p;
        
    }

    public void setQtdeVendida(double qtdeVendida) {
        //subtraindo a qtde vendida do estoque
        //produto.setQtdeEstoque(produto.getQtdeEstoque() - qtdeVendida);
        //produto.setQtdeEstoque (produto.getQtdeEstoque() - qtdeVendida);
        this.qtdeVendida = qtdeVendida;
        //calculando o preço total do itemPedido
        //precoTotal = produto.getPreco() * qtdeVendida;
    }

    public int getSequencia() {
        return sequencia;
    }

    public double getQtdeVendida() {
        return qtdeVendida;
    }
    //Resgatando o valor do precoTotal


    public Produto getProduto() {
        return produto;
    }
    
    public double getTotalItemPedido (){
        return qtdeVendida * produto.getPreco();
    }
    
    
    
    
    
}
