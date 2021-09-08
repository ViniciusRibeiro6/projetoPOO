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
public class Cliente extends Pessoa {
    
    private double limiteCred;
    private double limiteDisp;
    private ArrayList <Pedido> pedido;
    private boolean tipo;
    
    public Cliente (String c, String n, double limiteCred){
        super (c, n);
        this.limiteCred = limiteCred;
        this.limiteDisp = limiteCred;
        pedido = new ArrayList<Pedido>();
        
    }

    @Override
    public void addPedido(Pedido p) {
        pedido.add(p);
        p.addCliente(this);
    }

    public void setLimiteCred(double limiteCred) {
        this.limiteDisp = limiteCred;
    }
  

    public double getLimiteCred() {
        return limiteCred;
    }

    public double getLimiteDisp() {
        return limiteDisp;
    }
    
     public void removePedido (Pedido p){
        pedido.remove(p);
        p.addCliente(null);
    }

    public boolean getTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Pedido> getPedido() {
        return pedido;
    }

    
    
    
    
    
    
}
