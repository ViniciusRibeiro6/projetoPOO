/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author vinicius
 */
public class Pedido {
    private String numero;
    private String dataEmissao;
    private String dataPagto;
    private boolean formaPagto;
    private boolean situacao;
    private Cliente cliente;
    private Vendedor vendedor;
    private ArrayList <ItemPedido> itemPedido;
    
    
    public Pedido (String n, String de){
        this.numero = n;
        this.dataEmissao = de;
        itemPedido = new ArrayList <ItemPedido>();
    }
    
    public void addItemPedido (ItemPedido ip){
        itemPedido.add(ip);
        ip.setPedido(this);
        //subtraindo o valor do itemPedido do limiteDisponivel do cliente
        cliente.setLimiteCred(cliente.getLimiteDisp()- ip.getQtdeVendida() * ip.getProduto().getPreco());
        //(ip.getQtdeVendida() * ip.getProduto().getPreco());
    }
    
    public void addCliente (Cliente c){
        cliente = c;
    }
    
    public void addVendedor(Vendedor v){
        vendedor = v;
    }
    public void setDataPagto(String dataPagto) {
        this.dataPagto = dataPagto;
    }

    public void setFormaPagto(boolean formaPagto) {
        this.formaPagto = formaPagto;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public String getNumero() {
        return numero;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public String getDataPagto() {
        return dataPagto;
    }

    public boolean getFormaPagto() {
        return formaPagto;
    }

    public boolean getSituacao() {
        return situacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }
    
    public ArrayList<ItemPedido> getItemPedido (){
        
        return itemPedido;
    }
    
    public double getTotalPedido (){
        int a;
        float total = 0;
        
        for (a = 0; a < itemPedido.size(); a++){
            total += itemPedido.get(a).getTotalItemPedido();
        }
        
        return total;
    }
    
    public void removeItempedido (ItemPedido i){
        itemPedido.remove(i);
        i.setPedido(null);
    }

    public static boolean validarData(String c){
     try {
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            df.setLenient(false);
            df.parse(c);
            return true;
        } catch (ParseException e) {
            return false;
        }

    }
}
