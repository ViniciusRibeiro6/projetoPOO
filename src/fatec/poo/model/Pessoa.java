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
public abstract class Pessoa {
    
    private String cpf;
    private String nome;
    private String Endereco;
    private String cidade;
    private String uf;
    private String cep;
    private String ddd;
    private String telefone;
    
    
        
    public Pessoa (String c, String n){
        this.cpf = c;
        this.nome = n;
       
        
    }
    
    abstract public void addPedido (Pedido p);
    
    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }

    public String getCep() {
        return cep;
    }

    public String getDdd() {
        return ddd;
    }

    public String getTelefone() {
        return telefone;
    }
    
   
    
    public static boolean validarCPF(String c){ 
        
        int a, b=0, resultado=0;
        int num[] = new int[11];
        
        for (a=0; a<c.length(); a++){
            
            //ignorando os caracteres '-' e '.'
            if (a == 3 || a == 7 || a == 11){
                a++;
            }
            
            //comparando se os numero estão entre 0 e nove
            if (c.charAt(a) >= '0' && c.charAt(a) <=  '9'){
                //jogando os numeros no vetor de inteiro
                num[b] = (c.charAt(a) - 48);
                
                
                if (b < 10){
                    resultado += num[b]*(11-b);
                }
            }
            
            else
            {
                return false;
            }
            
            b++;
            
        }
        
        resultado = (resultado*10)%11;
        
        
        if (resultado == 10)
            resultado = 0;
        
        if (resultado == num[10]){
            return true;
        }
        
        else{
            return false;
        }
}
    
    
}
