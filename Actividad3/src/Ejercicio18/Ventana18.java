/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ejercicio18;

import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class Ventana18 extends javax.swing.JFrame {

    /**
     * Creates new form Ventana18
     */
    public Ventana18() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtCodigo_Emp = new javax.swing.JTextField();
        TxtNombres_Emp = new javax.swing.JTextField();
        TxtHrs_Mes = new javax.swing.JTextField();
        TxtValor_Hr = new javax.swing.JTextField();
        TxtRete_Fnt = new javax.swing.JTextField();
        Calcular_Salario = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        TxtSalario_Bruto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TxtSalario_Neto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Codigo del empleado");

        jLabel2.setText("Nombres");

        jLabel3.setText("Cantidad de horas trabajadas al mes");

        jLabel4.setText("Valor por hora trabajada");

        jLabel5.setText("Porcentaje de retencion en la fuente");

        TxtCodigo_Emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCodigo_EmpActionPerformed(evt);
            }
        });

        TxtNombres_Emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombres_EmpActionPerformed(evt);
            }
        });

        Calcular_Salario.setText("Calcular Salario");
        Calcular_Salario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calcular_SalarioActionPerformed(evt);
            }
        });

        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        jLabel6.setText("Salario Bruto");

        TxtSalario_Bruto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSalario_BrutoActionPerformed(evt);
            }
        });

        jLabel7.setText("Salario Neto");

        TxtSalario_Neto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSalario_NetoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TxtValor_Hr, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addComponent(TxtHrs_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TxtNombres_Emp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TxtCodigo_Emp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Calcular_Salario)
                                .addGap(77, 77, 77)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtRete_Fnt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Limpiar))))
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtSalario_Neto, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addComponent(TxtSalario_Bruto)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(TxtCodigo_Emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtNombres_Emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtHrs_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(TxtValor_Hr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(TxtRete_Fnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(TxtSalario_Bruto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(TxtSalario_Neto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Calcular_Salario)
                    .addComponent(Limpiar))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNombres_EmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombres_EmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombres_EmpActionPerformed

    private void TxtCodigo_EmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCodigo_EmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCodigo_EmpActionPerformed

    private void Calcular_SalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calcular_SalarioActionPerformed
        // TODO add your handling code here:
        try{
           // int Codigo_Emp;
            int Codigo_Emp = Integer.parseInt(TxtCodigo_Emp.getText());
            
            String Nombres_Emp = TxtNombres_Emp.getText();
            
            double Hrs_Mes = Double.parseDouble(TxtHrs_Mes.getText());
            
            double Valor_Hr = Double.parseDouble(TxtValor_Hr.getText());
            
            double Rete_Fnt = Double.parseDouble(TxtRete_Fnt.getText());
            
            TxtSalario_Bruto.setText(String.valueOf(Empleado.Salario_Bruto(Hrs_Mes, Valor_Hr)));
            
            TxtSalario_Neto.setText(String.valueOf(Empleado.Salario_Neto(Valor_Hr, Rete_Fnt)));
            
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Caracteres no validos");
        }
    }//GEN-LAST:event_Calcular_SalarioActionPerformed

    private void TxtSalario_BrutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSalario_BrutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSalario_BrutoActionPerformed

    private void TxtSalario_NetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSalario_NetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSalario_NetoActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        // TODO add your handling code here:
        TxtCodigo_Emp.setText("");
        TxtNombres_Emp.setText("");
        TxtHrs_Mes.setText("");
        TxtValor_Hr.setText("");
        TxtRete_Fnt.setText("");
        TxtSalario_Bruto.setText("");
        TxtSalario_Neto.setText("");
    }//GEN-LAST:event_LimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana18.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana18.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana18.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana18.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana18().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular_Salario;
    private javax.swing.JButton Limpiar;
    private javax.swing.JTextField TxtCodigo_Emp;
    private javax.swing.JTextField TxtHrs_Mes;
    private javax.swing.JTextField TxtNombres_Emp;
    private javax.swing.JTextField TxtRete_Fnt;
    private javax.swing.JTextField TxtSalario_Bruto;
    private javax.swing.JTextField TxtSalario_Neto;
    private javax.swing.JTextField TxtValor_Hr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}