/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package creditfeecalculator;

import java.text.DecimalFormat;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alipser
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
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

        jLabel1 = new javax.swing.JLabel();
        TxtInteres = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtMonto1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CombPlazo = new javax.swing.JComboBox();
        BtCalcular = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        TxtCuota = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblPago = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Monto a Prestar");

        TxtInteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtInteresActionPerformed(evt);
            }
        });

        jLabel2.setText("Tasa de interes %");

        TxtMonto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtMonto1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Plazo a Financiar");

        CombPlazo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "6 meses", "1 año", "1.5 años", "2 años", "3 años", "4 años" }));

        BtCalcular.setText("Calcular");
        BtCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCalcularActionPerformed(evt);
            }
        });

        jLabel4.setText("    Cuota :");

        TxtCuota.setBackground(new java.awt.Color(204, 204, 204));
        TxtCuota.setDisabledTextColor(new java.awt.Color(0, 153, 153));
        TxtCuota.setEnabled(false);
        TxtCuota.setSelectedTextColor(new java.awt.Color(255, 255, 0));

        TblPago.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TblPago.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TblPago);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(BtCalcular))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TxtMonto1, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                            .addComponent(TxtInteres)
                                            .addComponent(CombPlazo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel4))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtCuota, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtMonto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtInteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CombPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtCalcular)
                    .addComponent(jLabel4)
                    .addComponent(TxtCuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtInteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtInteresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtInteresActionPerformed

    private void TxtMonto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtMonto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtMonto1ActionPerformed

    private void BtCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCalcularActionPerformed
        double monto =Double.parseDouble(TxtMonto1.getText());
        double tasa  =Double.parseDouble(TxtInteres.getText())/100;
        int[] plazos= new int[] {6, 12, 18, 24, 36, 48};
        int period = plazos[CombPlazo.getSelectedIndex()];
        DecimalFormat df= new DecimalFormat("$ #,##0.00");
        double cuota= monto*(Math.pow(1+tasa,period)*tasa)/(Math.pow(1+tasa,period)-1);
        TxtCuota.setText(df.format(cuota));
        String[] encabezados;
        encabezados= new String[]{"$ Cuota","Abono","Intereses","Saldo"};
        String[][] datos= new String[period][encabezados.length];/* MAtriz*/
        double saldo;
        saldo=monto;
        for(int i=0;i< period;i++){
            datos[i][0]=String.valueOf(i+1);
            double intereses=saldo*tasa;
            double abono=cuota-intereses;
            saldo-= abono;
            datos[i][1]=String.valueOf(df.format(abono));
            datos[i][3]=String.valueOf(df.format(saldo));
            datos[i][2]=String.valueOf(df.format(intereses));
        }
        DefaultTableModel dtm=new DefaultTableModel(datos,encabezados);
        TblPago.setModel(dtm);
        
    }//GEN-LAST:event_BtCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCalcular;
    private javax.swing.JComboBox CombPlazo;
    private javax.swing.JTable TblPago;
    private javax.swing.JTextField TxtCuota;
    private javax.swing.JTextField TxtInteres;
    private javax.swing.JTextField TxtMonto1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}