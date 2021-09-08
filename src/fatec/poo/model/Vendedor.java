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
public class Vendedor extends Pessoa {
    
    private double salarioBase;
    private double taxaComissao;
    private ArrayList <Pedido> pedido;

    public Vendedor (String c, String n, double salarioBase){
        super (c, n);
        this.salarioBase = salarioBase;
        pedido = new ArrayList<Pedido>();
    }

    @Override
    public void addPedido(Pedido p) {
        pedido.add(p);
        p.addVendedor(this);
    }
    
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void removePedido (Pedido p){
        pedido.remove(p);
        p.addVendedor(null);
    }
    

}
