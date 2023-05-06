/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistemaEnvios.view;

import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JOptionPane;

/**
 *
 * @author mayara
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        lbTituloPainel = new javax.swing.JLabel();
        lbSubtituloPainel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiObjeto = new javax.swing.JMenuItem();
        jmiUsuario = new javax.swing.JMenuItem();
        jmiFuncionario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiRastreioObjeto = new javax.swing.JMenuItem();
        jmEnviar = new javax.swing.JMenu();
        jmiEnvioObjeto = new javax.swing.JMenuItem();
        jmSair = new javax.swing.JMenu();
        jmiSair = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbTituloPainel.setFont(new java.awt.Font("Liberation Sans", 1, 60)); // NOI18N
        lbTituloPainel.setText("Sistema de Envios");

        lbSubtituloPainel.setText("Cadastrar, enviar e rastrear objetos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(lbSubtituloPainel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(lbTituloPainel)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(lbTituloPainel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbSubtituloPainel)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        jMenu1.setText("Cadastro");

        jmiObjeto.setText("Objeto");
        jmiObjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiObjetoActionPerformed(evt);
            }
        });
        jMenu1.add(jmiObjeto);

        jmiUsuario.setText("Usuário");
        jmiUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jmiUsuario);

        jmiFuncionario.setText("Funcionario");
        jmiFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFuncionarioActionPerformed(evt);
            }
        });
        jMenu1.add(jmiFuncionario);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Rastreio");

        jmiRastreioObjeto.setText("Rastrear objeto");
        jmiRastreioObjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRastreioObjetoActionPerformed(evt);
            }
        });
        jMenu2.add(jmiRastreioObjeto);

        jMenuBar1.add(jMenu2);

        jmEnviar.setText("Enviar");

        jmiEnvioObjeto.setText("Objeto");
        jmiEnvioObjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEnvioObjetoActionPerformed(evt);
            }
        });
        jmEnviar.add(jmiEnvioObjeto);

        jMenuBar1.add(jmEnviar);

        jmSair.setText("Sair");

        jmiSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiSair.setText("Sair");
        jmiSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSairActionPerformed(evt);
            }
        });
        jmSair.add(jmiSair);

        jMenuBar1.add(jmSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiObjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiObjetoActionPerformed
        TelaCadastroObjeto t = new TelaCadastroObjeto();
        t.setVisible(true);
    }//GEN-LAST:event_jmiObjetoActionPerformed

    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
           int s=JOptionPane.showConfirmDialog(rootPane, "Deseja Realmente Sair?", null, WIDTH);
           if(s==0)
           {
               System.exit(0);
           }
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiSairActionPerformed

    private void jmiUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiUsuarioActionPerformed
        TelaCadastroUsuario t = new TelaCadastroUsuario();
        t.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiUsuarioActionPerformed

    private void jmiRastreioObjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRastreioObjetoActionPerformed
        TelaRastreio t = new TelaRastreio();
        t.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiRastreioObjetoActionPerformed

    private void jmiEnvioObjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEnvioObjetoActionPerformed
        TelaEnvios t = new TelaEnvios();
        t.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiEnvioObjetoActionPerformed

    private void jmiFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFuncionarioActionPerformed
        TelaCadastroFuncionario t = new TelaCadastroFuncionario();
        t.setVisible(true);
    }//GEN-LAST:event_jmiFuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu jmEnviar;
    private javax.swing.JMenu jmSair;
    private javax.swing.JMenuItem jmiEnvioObjeto;
    private javax.swing.JMenuItem jmiFuncionario;
    private javax.swing.JMenuItem jmiObjeto;
    private javax.swing.JMenuItem jmiRastreioObjeto;
    private javax.swing.JMenuItem jmiSair;
    private javax.swing.JMenuItem jmiUsuario;
    private javax.swing.JLabel lbSubtituloPainel;
    private javax.swing.JLabel lbTituloPainel;
    // End of variables declaration//GEN-END:variables
}
