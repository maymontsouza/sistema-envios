/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistemaEnvios.view;

/**
 *
 * @author mayara
 */
public class TelaCadastroFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroFuncionario
     */
    public TelaCadastroFuncionario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLcodigo = new javax.swing.JLabel();
        T_codigo = new javax.swing.JTextField();
        jLnome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTnome = new javax.swing.JTextField();
        jL_cpf = new javax.swing.JLabel();
        jTcpf = new javax.swing.JTextField();
        jLRG = new javax.swing.JLabel();
        jTrg = new javax.swing.JTextField();
        jLemail = new javax.swing.JLabel();
        jTemail = new javax.swing.JTextField();
        jLCELULAR = new javax.swing.JLabel();
        jTcelular = new javax.swing.JTextField();
        jLfuncao = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLniveldeacesso = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnAlterarFuncionario = new javax.swing.JButton();
        btnSalvarFuncionario = new javax.swing.JButton();
        btnLimparFuncionario = new javax.swing.JButton();
        btnExcluirFuncionario = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        lnEmail = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        lbCpf = new javax.swing.JLabel();
        lgRG = new javax.swing.JLabel();
        txtRG = new javax.swing.JTextField();
        lbCelular = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jLnome1 = new javax.swing.JLabel();
        txtCodigoUsuario = new javax.swing.JTextField();
        lbCodigo = new javax.swing.JLabel();
        lbFuncao = new javax.swing.JLabel();
        cbFuncao = new javax.swing.JComboBox();
        lbNivelAcesso = new javax.swing.JLabel();
        cbNivelAcesso = new javax.swing.JComboBox();
        lbTituloSistemaEnvios = new javax.swing.JLabel();

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        jLcodigo.setText("Codigo:*");
        jDesktopPane1.add(jLcodigo);
        jLcodigo.setBounds(30, 50, 70, 18);

        T_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_codigoActionPerformed(evt);
            }
        });
        jDesktopPane1.add(T_codigo);
        T_codigo.setBounds(30, 70, 90, 20);

        jLnome.setText("Nome:* ");
        jDesktopPane1.add(jLnome);
        jLnome.setBounds(30, 100, 130, 20);
        jDesktopPane1.add(jLabel3);
        jLabel3.setBounds(10, 90, 280, 0);
        jDesktopPane1.add(jTnome);
        jTnome.setBounds(30, 130, 510, 24);

        jL_cpf.setText("CPF: *");
        jDesktopPane1.add(jL_cpf);
        jL_cpf.setBounds(30, 170, 50, 18);

        jTcpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTcpfActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jTcpf);
        jTcpf.setBounds(30, 190, 160, 24);

        jLRG.setText("RG:");
        jDesktopPane1.add(jLRG);
        jLRG.setBounds(220, 170, 30, 18);

        jTrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTrgActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jTrg);
        jTrg.setBounds(220, 190, 140, 24);

        jLemail.setText("Email:");
        jDesktopPane1.add(jLemail);
        jLemail.setBounds(30, 230, 41, 18);
        jDesktopPane1.add(jTemail);
        jTemail.setBounds(30, 250, 510, 24);

        jLCELULAR.setText("Celular:");
        jDesktopPane1.add(jLCELULAR);
        jLCELULAR.setBounds(400, 160, 70, 18);

        jTcelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTcelularActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jTcelular);
        jTcelular.setBounds(390, 190, 150, 24);

        jLfuncao.setText("Função:");
        jDesktopPane1.add(jLfuncao);
        jLfuncao.setBounds(220, 50, 80, 18);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jDesktopPane1.add(jComboBox1);
        jComboBox1.setBounds(220, 70, 120, 24);

        jLniveldeacesso.setText("Nivel de Acesso:");
        jDesktopPane1.add(jLniveldeacesso);
        jLniveldeacesso.setBounds(420, 50, 130, 18);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jDesktopPane1.add(jComboBox2);
        jComboBox2.setBounds(420, 70, 120, 24);

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton1);
        jButton1.setBounds(360, 350, 140, 24);

        jButton2.setText("Alterar");
        jDesktopPane1.add(jButton2);
        jButton2.setBounds(270, 350, 72, 24);

        jButton3.setText("Excluir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton3);
        jButton3.setBounds(180, 350, 74, 24);

        jButton4.setText("Limpar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton4);
        jButton4.setBounds(70, 350, 94, 24);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAlterarFuncionario.setText("Alterar");

        btnSalvarFuncionario.setText("Salvar");
        btnSalvarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarFuncionarioActionPerformed(evt);
            }
        });

        btnLimparFuncionario.setText("Limpar");
        btnLimparFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparFuncionarioActionPerformed(evt);
            }
        });

        btnExcluirFuncionario.setText("Excluir");
        btnExcluirFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirFuncionarioActionPerformed(evt);
            }
        });

        lnEmail.setText("Email:");

        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });

        lbCpf.setText("CPF: *");

        lgRG.setText("Login:*");

        txtRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRGActionPerformed(evt);
            }
        });

        lbCelular.setText("Senha:*");

        txtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularActionPerformed(evt);
            }
        });

        jLnome1.setText("Nome:* ");

        txtCodigoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoUsuarioActionPerformed(evt);
            }
        });

        lbCodigo.setText("Codigo:*");

        lbFuncao.setText("Função:*");

        cbFuncao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbNivelAcesso.setText("Nivel de Acesso:*");

        cbNivelAcesso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbTituloSistemaEnvios.setFont(new java.awt.Font("Liberation Mono", 1, 18)); // NOI18N
        lbTituloSistemaEnvios.setText("Cadastro de Usuário");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTituloSistemaEnvios)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(lbFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(lbNivelAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCodigoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(cbFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(cbNivelAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLnome1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lnEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(140, 140, 140)
                                .addComponent(lgRG, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(40, 96, Short.MAX_VALUE)
                    .addComponent(btnLimparFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)
                    .addComponent(btnExcluirFuncionario)
                    .addGap(16, 16, 16)
                    .addComponent(btnAlterarFuncionario)
                    .addGap(18, 18, 18)
                    .addComponent(btnSalvarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 105, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lbTituloSistemaEnvios)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCodigo)
                    .addComponent(lbFuncao)
                    .addComponent(lbNivelAcesso))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbFuncao)
                    .addComponent(cbNivelAcesso)
                    .addComponent(txtCodigoUsuario))
                .addGap(18, 18, 18)
                .addComponent(jLnome1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCpf)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lgRG)
                        .addComponent(lbCelular)))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(lnEmail)
                .addGap(2, 2, 2)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(384, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnLimparFuncionario)
                        .addComponent(btnExcluirFuncionario)
                        .addComponent(btnAlterarFuncionario)
                        .addComponent(btnSalvarFuncionario))
                    .addGap(0, 29, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void T_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T_codigoActionPerformed

    private void jTcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTcpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTcpfActionPerformed

    private void jTrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTrgActionPerformed

    private void jTcelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTcelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTcelularActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTcelular.setText("");
        jTcpf.setText("");
        jTemail.setText("");
        jTnome.setText("");
        jTrg.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnSalvarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarFuncionarioActionPerformed

    private void btnLimparFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparFuncionarioActionPerformed

    private void btnExcluirFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirFuncionarioActionPerformed

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

    private void txtRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRGActionPerformed

    private void txtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularActionPerformed

    private void txtCodigoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField T_codigo;
    private javax.swing.JButton btnAlterarFuncionario;
    private javax.swing.JButton btnExcluirFuncionario;
    private javax.swing.JButton btnLimparFuncionario;
    private javax.swing.JButton btnSalvarFuncionario;
    private javax.swing.JComboBox cbFuncao;
    private javax.swing.JComboBox cbNivelAcesso;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLCELULAR;
    private javax.swing.JLabel jLRG;
    private javax.swing.JLabel jL_cpf;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLcodigo;
    private javax.swing.JLabel jLemail;
    private javax.swing.JLabel jLfuncao;
    private javax.swing.JLabel jLniveldeacesso;
    private javax.swing.JLabel jLnome;
    private javax.swing.JLabel jLnome1;
    private javax.swing.JTextField jTcelular;
    private javax.swing.JTextField jTcpf;
    private javax.swing.JTextField jTemail;
    private javax.swing.JTextField jTnome;
    private javax.swing.JTextField jTrg;
    private javax.swing.JLabel lbCelular;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbFuncao;
    private javax.swing.JLabel lbNivelAcesso;
    private javax.swing.JLabel lbTituloSistemaEnvios;
    private javax.swing.JLabel lgRG;
    private javax.swing.JLabel lnEmail;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCodigoUsuario;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRG;
    // End of variables declaration//GEN-END:variables
}
