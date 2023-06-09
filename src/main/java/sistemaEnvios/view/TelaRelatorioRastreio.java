/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistemaEnvios.view;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import sistemaEnvios.dao.EnvioDAO;
import sistemaEnvios.model.Envio;
import sistemaEnvios.model.comparator.EnvioComparator;


/**
 *
 * @author mayara
 */
public class TelaRelatorioRastreio extends javax.swing.JFrame {

    /**
     * Creates new form TelaRelatorioRastreio
     */
    public TelaRelatorioRastreio() {
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

        jPanel1 = new javax.swing.JPanel();
        bgOpcoes = new javax.swing.ButtonGroup();
        rbObjeto = new javax.swing.JRadioButton();
        rbRemetente = new javax.swing.JRadioButton();
        rbDestinatario = new javax.swing.JRadioButton();
        btGerarRelatorio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taRelatorio = new javax.swing.JTextArea();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        bgOpcoes.add(rbObjeto);
        rbObjeto.setText("Objeto");

        bgOpcoes.add(rbRemetente);
        rbRemetente.setText("Remetente");

        bgOpcoes.add(rbDestinatario);
        rbDestinatario.setText("Destinatário");

        btGerarRelatorio.setText("Gerar");
        btGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGerarRelatorioActionPerformed(evt);
            }
        });

        taRelatorio.setColumns(20);
        taRelatorio.setRows(5);
        jScrollPane1.setViewportView(taRelatorio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbObjeto)
                        .addGap(60, 60, 60)
                        .addComponent(rbRemetente)
                        .addGap(60, 60, 60)
                        .addComponent(rbDestinatario)
                        .addGap(72, 72, 72)
                        .addComponent(btGerarRelatorio)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbObjeto)
                    .addComponent(rbRemetente)
                    .addComponent(rbDestinatario)
                    .addComponent(btGerarRelatorio))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGerarRelatorioActionPerformed
        if (rbObjeto.isSelected()) {
            EnvioDAO envioDAO = new EnvioDAO();
            List<Envio> ordenadoObjeto = envioDAO.selectAll();
            Collections.sort(ordenadoObjeto);
            
            StringBuilder sb = new StringBuilder();
            
            for (Envio envio : ordenadoObjeto) {
                sb.append(envio.infoEnvio()).append("\n");
            }
            
            taRelatorio.setText(sb.toString());
        } else if (rbRemetente.isSelected()) {
            EnvioDAO envioDAO = new EnvioDAO();
            List<Envio> ordenadoObjeto = envioDAO.selectAll();
            Collections.sort(ordenadoObjeto, new EnvioComparator());
            
            StringBuilder sb = new StringBuilder();
            
            for (Envio envio : ordenadoObjeto) {
                sb.append(envio.infoEnvio()).append("\n");
            }
            
            taRelatorio.setText(sb.toString());
        } else if (rbDestinatario.isSelected()) {
            EnvioDAO envioDAO = new EnvioDAO();
            List<Envio> ordenadoObjeto = envioDAO.selectAll();
            Collections.sort(ordenadoObjeto, new Comparator<Envio>() {
                //Classe Anônima
                @Override
                public int compare(Envio o1, Envio o2) {
                    return o1.getDestinatario().getNome().compareTo(o2.getDestinatario().getNome());
                }
            });
            
            StringBuilder sb = new StringBuilder();
            
            for (Envio envio : ordenadoObjeto) {
                sb.append(envio.infoEnvio()).append("\n");
            }
            
            taRelatorio.setText(sb.toString());
        }
    }//GEN-LAST:event_btGerarRelatorioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaRelatorioRastreio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorioRastreio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorioRastreio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorioRastreio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRelatorioRastreio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgOpcoes;
    private javax.swing.JButton btGerarRelatorio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbDestinatario;
    private javax.swing.JRadioButton rbObjeto;
    private javax.swing.JRadioButton rbRemetente;
    private javax.swing.JTextArea taRelatorio;
    // End of variables declaration//GEN-END:variables
}
