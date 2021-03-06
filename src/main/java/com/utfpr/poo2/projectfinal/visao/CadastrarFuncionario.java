/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.poo2.projectfinal.visao;

import java.util.List;
import java.util.Vector;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import com.utfpr.poo2.projectfinal.rn.FuncionarioRN;
import com.utfpr.poo2.projectfinal.rn.CargoRN;
import com.utfpr.poo2.projectfinal.vo.Funcionario;
import com.utfpr.poo2.projectfinal.vo.Cargo;
import java.math.BigDecimal;

public class CadastrarFuncionario extends javax.swing.JInternalFrame {

    private Long idAlteracao = 0L;
    private List<Cargo> cargos;
    private CargoRN cargoRN;
    private Funcionario funcionario;
    private FuncionarioRN funcionarioRN;
    
    public CadastrarFuncionario() {
        this.cargoRN = new CargoRN();
        this.funcionarioRN = new FuncionarioRN();
        
        initComponents();
        this.popularComboCargo();
    }
    
    public CadastrarFuncionario(Long idAlteracao) {
        initComponents();
        this.funcionarioRN = new FuncionarioRN();
        this.cargoRN = new CargoRN();
        this.idAlteracao = idAlteracao;
        try{
            funcionario = funcionarioRN.listarUm(idAlteracao);
            
            txtID.setText(String.valueOf(funcionario.getCodigo()));
            txtDescricao.setText(funcionario.getNome());
            txtObservacao.setText(funcionario.getCpf());
            txtValor.setText(String.valueOf(funcionario.getSalario()));
            txtIdade.setText(String.valueOf(funcionario.getIdade()));
            
            popularComboCargoEdicao(idAlteracao);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtID = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        comboCargo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtObservacao = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();

        setClosable(true);
        setForeground(java.awt.Color.white);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastrar Funcion??rio");
        setToolTipText("");
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));

        txtID.setEditable(false);

        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        jLabel1.setText("ID:");

        jLabel2.setText("Nome:");

        jLabel5.setText("Sal??rio:");

        jLabel6.setText("Cargo:");

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/accept_button.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cancel_32.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        comboCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCargoActionPerformed(evt);
            }
        });

        jLabel9.setText("CPF:");

        jLabel7.setText("Idade:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                                    .addComponent(txtObservacao)))
                            .addComponent(jLabel9))
                        .addContainerGap(173, Short.MAX_VALUE))))
            .addComponent(btSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
            .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel5, jLabel6});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(comboCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        try{
            if(this.idAlteracao == 0){
                funcionario = new Funcionario();
                funcionario.setCargo((Cargo)this.getCargoSelecionado(comboCargo.getSelectedIndex()));
                funcionario.setNome(txtDescricao.getText());
                funcionario.setCpf(txtObservacao.getText());
                funcionario.setIdade(new Integer(txtIdade.getText()));
                funcionario.setSalario(new Double(txtValor.getText()));

                funcionarioRN.salvar(funcionario);
                
            }else{
                funcionario.setCargo((Cargo)this.getCargoSelecionado(comboCargo.getSelectedIndex()));
                funcionario.setNome(txtDescricao.getText());
                funcionario.setCpf(txtObservacao.getText());
                funcionario.setIdade(new Integer(txtIdade.getText()));
                funcionario.setSalario(new Double(txtValor.getText()));

                funcionarioRN.atualizar(funcionario);         
            }
            JOptionPane.showMessageDialog(this, "Funcionario cadastrado com sucesso!");
            this.dispose();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
        
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void comboCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCargoActionPerformed

    private void popularComboCargo() {
        ComboBoxModel modeloMod;
            try {
                Vector linhas = new Vector();
                cargos = cargoRN.listaTodos();
                
                for (Cargo m : cargos)
                {
                    Vector linha = new Vector();
                    linha.add(m.getCodigo());
                    linha.add(m.getNome());
                    linhas.add(linha);
                }
                modeloMod = new DefaultComboBoxModel(linhas);
                comboCargo.setModel(modeloMod);
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
    
    private void popularComboCargoEdicao(Long id) {
        ComboBoxModel modeloMod;
            try {
                Vector linhas = new Vector();
                cargos = cargoRN.listaTodos();
                int index = 0;
                int indexSelecionado = 0;
                for (Cargo m : cargos)
                {
                    Vector linha = new Vector();
                    linha.add(m.getCodigo());
                    linha.add(m.getNome());
                    linhas.add(linha);
                    
                    if(funcionario.getCargo().getCodigo() == m.getCodigo()){
                        indexSelecionado = index;
                    }
                    index++;
                }
                modeloMod = new DefaultComboBoxModel(linhas);
                comboCargo.setModel(modeloMod);
                comboCargo.setSelectedIndex(indexSelecionado);
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
    private Object getCargoSelecionado(int posicao) 
    {
        Cargo m = new Cargo();
        m = (Cargo) cargos.get(posicao);

        return m;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox<String> comboCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtObservacao;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
