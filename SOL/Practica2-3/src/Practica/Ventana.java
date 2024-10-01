/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Practica;

import javax.swing.JOptionPane;

/**
 *
 * @author DAM2_09
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
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

        Boton_Añadir = new javax.swing.JButton();
        Campo_Añadir = new javax.swing.JTextField();
        ComboBox_Modulos = new javax.swing.JComboBox<>();
        Texto_Añdir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Boton_Añadir.setText("Añadir");
        Boton_Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_AñadirActionPerformed(evt);
            }
        });

        Campo_Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_AñadirActionPerformed(evt);
            }
        });

        Texto_Añdir.setText("Añade los modulos de los que estas matriculados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(Boton_Añadir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Texto_Añdir)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Campo_Añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105)
                                .addComponent(ComboBox_Modulos, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(39, 39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(Texto_Añdir)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Campo_Añadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox_Modulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Boton_Añadir)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Campo_AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_AñadirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Campo_AñadirActionPerformed

    private void Boton_AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_AñadirActionPerformed

        String modulo = Campo_Añadir.getText();
        if(controlCampoAñadir()){
            return;
        }
        
        
        
        añadirModulo(modulo);
        
        Campo_Añadir.setText("");
    }//GEN-LAST:event_Boton_AñadirActionPerformed

    private boolean controlCampoAñadir(){
        if(Campo_Añadir.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"El campo donde hay que añidr modulo esta vacio");
            return true;
        }
        return false;
    }
    private void añadirModulo(String entrada){
        for (int i = 0; i < ComboBox_Modulos.getItemCount(); i++) {
            if(entrada.equalsIgnoreCase(ComboBox_Modulos.getItemAt(i))){
                 JOptionPane.showMessageDialog(null,"El modulo esta repetido");
                 return;
            }
        }
        ComboBox_Modulos.addItem(entrada);
    }
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Añadir;
    private javax.swing.JTextField Campo_Añadir;
    private javax.swing.JComboBox<String> ComboBox_Modulos;
    private javax.swing.JLabel Texto_Añdir;
    // End of variables declaration//GEN-END:variables
}
