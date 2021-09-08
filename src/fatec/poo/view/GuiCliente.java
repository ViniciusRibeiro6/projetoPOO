/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.model.Cliente;
import fatec.poo.model.Pessoa;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Pablo
 */
public class GuiCliente extends javax.swing.JFrame {

    /**
     * Creates new form GuiCliente
     */
    public GuiCliente(ArrayList <Pessoa> cadCliVend) {
        initComponents();
        cadCliente = cadCliVend;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
     
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCPF = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblUF = new javax.swing.JLabel();
        cmbxUF = new javax.swing.JComboBox<>();
        lblTelefone = new javax.swing.JLabel();
        txtDDD = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        lblCEP = new javax.swing.JLabel();
        txtCEP = new javax.swing.JTextField();
        lblCredLimite = new javax.swing.JLabel();
        txtCredLimite = new javax.swing.JTextField();
        lblCredDisponivel = new javax.swing.JLabel();
        btnSair = new javax.swing.JToggleButton();
        txtfdCPF = new javax.swing.JFormattedTextField();
        lblLimiteDisponivel = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        cmbxTipo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cliente");
        setName("guiCliente"); // NOI18N

        lblCPF.setText("CPF");
        lblCPF.setName("lblCPF"); // NOI18N

        lblNome.setText("Nome");
        lblNome.setName("lblNome"); // NOI18N

        txtNome.setEnabled(false);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        lblEndereco.setText("Endereço");
        lblEndereco.setName("lblEndereco"); // NOI18N

        txtEndereco.setEnabled(false);

        lblCidade.setText("Cidade");
        lblCidade.setName("lblCidade"); // NOI18N

        txtCidade.setEnabled(false);

        lblUF.setText("UF");
        lblUF.setName("lblUF"); // NOI18N

        cmbxUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SP", "RJ", "MG", "PR" }));
        cmbxUF.setToolTipText("");
        cmbxUF.setEnabled(false);

        lblTelefone.setText("Telefone");
        lblTelefone.setName("lblTelefone"); // NOI18N

        txtDDD.setEnabled(false);

        txtTelefone.setEnabled(false);

        lblCEP.setText("CEP");
        lblCEP.setName("lblCEP"); // NOI18N

        txtCEP.setEnabled(false);

        lblCredLimite.setText("Limite de Crédito");
        lblCredLimite.setName("lblLimiteCred"); // NOI18N

        txtCredLimite.setEnabled(false);

        lblCredDisponivel.setText("Limite Disponível");
        lblCredDisponivel.setName("lblLimiteDisp"); // NOI18N

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Sair.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.setName("btnSair"); // NOI18N
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        try {
            txtfdCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtfdCPF.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtfdCPF.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        txtfdCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfdCPFActionPerformed(evt);
            }
        });

        lblLimiteDisponivel.setEnabled(false);

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Consultar.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Inserir.png"))); // NOI18N
        btnIncluir.setText("Incluir");
        btnIncluir.setEnabled(false);
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Remover.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        cmbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comum", "Especial" }));
        cmbxTipo.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCredLimite)
                            .addComponent(lblTelefone)
                            .addComponent(lblCidade)
                            .addComponent(lblEndereco)
                            .addComponent(lblNome)
                            .addComponent(lblCPF))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCEP)
                                .addGap(20, 20, 20)
                                .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCidade)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblUF)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbxUF, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(txtDDD, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(txtCredLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(81, 81, 81)
                                                .addComponent(lblCredDisponivel)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblLimiteDisponivel))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(txtfdCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cmbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnConsultar)
                        .addGap(12, 12, 12)
                        .addComponent(btnIncluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir)
                        .addGap(16, 16, 16)
                        .addComponent(btnSair)
                        .addGap(0, 69, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCPF)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtfdCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEndereco)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCidade)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblUF)
                        .addComponent(cmbxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefone)
                            .addComponent(txtDDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCredLimite)
                            .addComponent(txtCredLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCEP)
                            .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCredDisponivel)
                            .addComponent(lblLimiteDisponivel))))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnConsultar)
                    .addComponent(btnIncluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Cadastro");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtfdCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfdCPFActionPerformed
        
    }//GEN-LAST:event_txtfdCPFActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // Botao consultar:
        
        if (Pessoa.validarCPF(txtfdCPF.getText())){
           
            int c;
            
            for (c=0; c < cadCliente.size(); c++ ){

                if (cadCliente.get(c).getCpf().equals(txtfdCPF.getText())){

                    break;
                }

            }
  
            if (c < cadCliente.size()){
                posCliente = c;
            }

            else{
                posCliente = -1;
            }
            
            //Encontrou
            if (posCliente >= 0){
                
                
                btnConsultar.setEnabled(false);
                btnIncluir.setEnabled(false);
                btnAlterar.setEnabled(true);
                btnExcluir.setEnabled(true);
                
                //Carregando atributos para editar
                txtNome.setText(cadCliente.get(posCliente).getNome());
                txtEndereco.setText(cadCliente.get(posCliente).getEndereco());
                txtCidade.setText(cadCliente.get(posCliente).getCidade());
                txtDDD.setText(cadCliente.get(posCliente).getDdd());
                txtTelefone.setText(cadCliente.get(posCliente).getTelefone());
                txtCEP.setText(cadCliente.get(posCliente).getCep());
                
                //obtendo o index
                int a;
                for (a=0; a< cmbxUF.getItemCount(); a++){
                    
                    if (cadCliente.get(posCliente).getUf() == cmbxUF.getItemAt(a)){
                        break;
                    }
                }
                
                if (((Cliente)cadCliente.get(posCliente)).getTipo()){
                    cmbxTipo.setSelectedIndex(1);
                }
                else{
                    cmbxTipo.setSelectedIndex(2);
                }
                
                cmbxUF.setSelectedIndex(a);
                txtCredLimite.setText(Double.toString(((Cliente)(cadCliente.get(posCliente))).getLimiteCred()));
                lblLimiteDisponivel.setText(Double.toString(((Cliente)(cadCliente.get(posCliente))).getLimiteDisp()));


            }
            //Não encontrou
            else{
                btnConsultar.setEnabled(false);
                btnIncluir.setEnabled(true);
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(false);

            }
            //Ativando/Desativando campos para edição ou inserção
            txtfdCPF.setEnabled(false);
            txtNome.setEnabled(true);
            txtEndereco.setEnabled(true);
            txtCidade.setEnabled(true);
            txtDDD.setEnabled(true);
            txtTelefone.setEnabled(true);
            txtCEP.setEnabled(true);
            txtCredLimite.setEnabled(true);
            cmbxUF.setEnabled(true);
            cmbxTipo.setEnabled(true);
            txtNome.requestFocus(); //foco no atributo nome
        }
        
        else{
            JOptionPane.showMessageDialog(null,"CPF Invalido!!!","Erro",JOptionPane.INFORMATION_MESSAGE);
            txtfdCPF.setText(null);
            txtfdCPF.requestFocus();
            
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        //Criando um obj cliente
        
        //instanciando o novo objeto
        Cliente objCliente = new Cliente(txtfdCPF.getText(), txtNome.getText(), Double.parseDouble(txtCredLimite.getText()));
        //Adicionando na coleção
        cadCliente.add(objCliente);
        objCliente.setEndereco(txtEndereco.getText());
        objCliente.setCidade(txtCidade.getText());
        objCliente.setDdd(txtDDD.getText());
        objCliente.setTelefone(txtTelefone.getText());
        objCliente.setCep(txtCEP.getText());
        objCliente.setUf(cmbxUF.getSelectedItem().toString());
        
        if (cmbxTipo.getSelectedIndex()==0){
            objCliente.setTipo(false);
        }
        else{
            objCliente.setTipo(true);
        }
        //Limpando valores dos campos
        txtfdCPF.setText(null);
        txtNome.setText(null);
        txtEndereco.setText(null);
        txtCidade.setText(null);
        txtDDD.setText(null);
        txtTelefone.setText(null);
        txtCEP.setText(null);
        txtCredLimite.setText(null);
        lblLimiteDisponivel.setText(null);
        cmbxUF.setSelectedIndex(0);
        cmbxTipo.setSelectedIndex(0);
        //Ativando e desativando botões
        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtfdCPF.setEnabled(true);
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtCidade.setEnabled(false);
        txtDDD.setEnabled(false);
        cmbxUF.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtCEP.setEnabled(false);
        txtCredLimite.setEnabled(false);
        cmbxTipo.setEnabled(false);
        txtfdCPF.requestFocus();
    
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // Botão de exclusão
        
        if (posCliente >= 0){
            cadCliente.remove(posCliente);
            posCliente--;
        }
        //Limpando os campos
        txtfdCPF.setText(null);
        txtNome.setText(null);
        txtEndereco.setText(null);
        txtCidade.setText(null);
        txtDDD.setText(null);
        txtTelefone.setText(null);
        txtCEP.setText(null);
        txtCredLimite.setText(null);
        lblLimiteDisponivel.setText(null);
        //Ativando e desativando campos
        txtfdCPF.setEnabled(true);
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtCidade.setEnabled(false);
        txtDDD.setEnabled(false);;
        txtTelefone.setEnabled(false);
        txtCEP.setEnabled(false);
        txtCredLimite.setEnabled(false);
        lblLimiteDisponivel.setEnabled(false);
        cmbxUF.setSelectedIndex(0);
        //Ativando e desativando botoões
        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        cmbxTipo.setEnabled(false);
        
        txtfdCPF.requestFocus();
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        //botao alterar
        //Pegando os valores
        cadCliente.get(posCliente).setNome(txtNome.getText());
        cadCliente.get(posCliente).setEndereco(txtEndereco.getText());
        cadCliente.get(posCliente).setCidade(txtCidade.getText());
        cadCliente.get(posCliente).setDdd(txtDDD.getText());
        cadCliente.get(posCliente).setTelefone(txtTelefone.getText());
        cadCliente.get(posCliente).setUf(cmbxUF.getSelectedItem().toString());
        cadCliente.get(posCliente).setCep(txtCEP.getText());
        ((Cliente)cadCliente.get(posCliente)).setLimiteCred(Double.parseDouble(txtCredLimite.getText()));
        if (cmbxTipo.getSelectedIndex()==0){
            ((Cliente)cadCliente.get(posCliente)).setTipo(false);
        }
        else{
            ((Cliente)cadCliente.get(posCliente)).setTipo(true);
        }
      
        //Liberar e fechar campos
        txtfdCPF.setEnabled(true);
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtCidade.setEnabled(false);
        txtCEP.setEnabled(false);
        cmbxUF.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtDDD.setEnabled(false);
        txtCredLimite.setEnabled(false);
        //Liberar e travar botões
        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        //Limpar campos
        txtfdCPF.setText(null);
        txtNome.setText(null);
        txtEndereco.setText(null);
        txtCidade.setText(null);
        txtCEP.setText(null);
        cmbxUF.setSelectedIndex(0);
        txtTelefone.setText(null);
        txtDDD.setText(null);
        txtCredLimite.setText(null);
        lblLimiteDisponivel.setText(null);
        txtfdCPF.requestFocus();
        
    }//GEN-LAST:event_btnAlterarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JToggleButton btnSair;
    private javax.swing.JComboBox<String> cmbxTipo;
    private javax.swing.JComboBox<String> cmbxUF;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCredDisponivel;
    private javax.swing.JLabel lblCredLimite;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblLimiteDisponivel;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblUF;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCredLimite;
    private javax.swing.JTextField txtDDD;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JFormattedTextField txtfdCPF;
    // End of variables declaration//GEN-END:variables

    private ArrayList <Pessoa> cadCliente;
    private int posCliente; //Resgatar a posição atual de um cliente
    
    

}
