/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Practica;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

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
        Boton_AgregarTodos = new javax.swing.JButton();
        Boton_BorrarTodos = new javax.swing.JButton();
        Combobox_Selecion = new javax.swing.JComboBox<>();
        Boton_Papelera = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modulos");

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

        Boton_AgregarTodos.setText("Agregar Todos");
        Boton_AgregarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_AgregarTodosActionPerformed(evt);
            }
        });

        Boton_BorrarTodos.setText("Borrar Todos");
        Boton_BorrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_BorrarTodosActionPerformed(evt);
            }
        });

        Combobox_Selecion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primero", "Segundo" }));

        Boton_Papelera.setIcon(new javax.swing.ImageIcon("C:\\Users\\DAM2_09\\Documents\\GitHub\\pr-ctica-2-3-elementos-combobox-Willsongamf\\SOL\\Practica2-3\\src\\Practica\\trash.png")); // NOI18N
        Boton_Papelera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_PapeleraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Boton_Añadir)
                                .addGap(85, 85, 85)
                                .addComponent(Boton_AgregarTodos)
                                .addGap(29, 29, 29)
                                .addComponent(Boton_BorrarTodos))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Texto_Añdir)
                                .addGap(130, 130, 130)))
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Campo_Añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Combobox_Selecion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ComboBox_Modulos, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Boton_Papelera, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(Texto_Añdir)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(Combobox_Selecion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Boton_Papelera)
                            .addComponent(ComboBox_Modulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Boton_AgregarTodos)
                            .addComponent(Boton_BorrarTodos)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(Campo_Añadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Boton_Añadir)))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Campo_AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_AñadirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Campo_AñadirActionPerformed

    private void Boton_AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_AñadirActionPerformed

        String modulo = Campo_Añadir.getText();
        if (controlCampoAñadir()) {
            return;
        }

        añadirModulo(modulo, false);

        Campo_Añadir.setText("");
    }//GEN-LAST:event_Boton_AñadirActionPerformed

    private void Boton_BorrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_BorrarTodosActionPerformed
        ComboBox_Modulos.removeAllItems();
    }//GEN-LAST:event_Boton_BorrarTodosActionPerformed

    private void Boton_AgregarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_AgregarTodosActionPerformed
        ArrayList<String> lista_modulos = crearModulos(Combobox_Selecion.getSelectedItem());

        for (String modulo : lista_modulos) {
            añadirModulo(modulo, true);

        }
    }//GEN-LAST:event_Boton_AgregarTodosActionPerformed

    private ArrayList<String> crearModulos(Object curso) {
        ArrayList<String> lista_modulos = new ArrayList();
        if (curso.getClass() != String.class) {
            throw new ClassCastException("Error al crear los modulos de un curso");
        }
        String other = (String) curso;
        if (other.equalsIgnoreCase("Primero")) {
            lista_modulos.add("Lenguaje de Marcas");
            lista_modulos.add("Programacion");
            lista_modulos.add("Base De Datos");
            lista_modulos.add("Entornos");
            lista_modulos.add("FOL");
            lista_modulos.add("Sistemas");
        } else {
            lista_modulos.add("Acceso a Datos");
            lista_modulos.add("ProgramacionMovil");
            lista_modulos.add("ProgramacionProcesos");
            lista_modulos.add("Interfaces");
            lista_modulos.add("Empresa");
            lista_modulos.add("Sistemas");
            lista_modulos.add("Ingles");
        }
        return lista_modulos;
    }
    private void Boton_PapeleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_PapeleraActionPerformed

        ComboBox_Modulos.removeItem(ComboBox_Modulos.getSelectedItem());
    }//GEN-LAST:event_Boton_PapeleraActionPerformed

    private boolean controlCampoAñadir() {
        if (Campo_Añadir.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo donde hay que añidr modulo esta vacio");
            return true;
        }
        return false;
    }

    /**
     * @return void
     * @param String para añadir al combobox y un boolean para saber si lo llama
     * el boton añadir o el agragar todos
     */
    private void añadirModulo(String entrada, boolean control_boton_agragartodo) {
        if (control_boton_agragartodo) {
            for (int i = 0; i < ComboBox_Modulos.getItemCount(); i++) {
                if (entrada.equalsIgnoreCase(ComboBox_Modulos.getItemAt(i))) {
                    return;
                }
            }
            ComboBox_Modulos.addItem(entrada);
        } else {
            for (int i = 0; i < ComboBox_Modulos.getItemCount(); i++) {
                if (entrada.equalsIgnoreCase(ComboBox_Modulos.getItemAt(i))) {
                    JOptionPane.showMessageDialog(null, "El modulo esta repetido");
                    return;
                }
            }
            ComboBox_Modulos.addItem(entrada);
        }
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
                if ("com.sun.java.swing.plaf.windows.WindowsLookAndFeel".equals(info.getName())) {
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
    private javax.swing.JButton Boton_AgregarTodos;
    private javax.swing.JButton Boton_Añadir;
    private javax.swing.JButton Boton_BorrarTodos;
    private javax.swing.JButton Boton_Papelera;
    private javax.swing.JTextField Campo_Añadir;
    private javax.swing.JComboBox<String> ComboBox_Modulos;
    private javax.swing.JComboBox<String> Combobox_Selecion;
    private javax.swing.JLabel Texto_Añdir;
    // End of variables declaration//GEN-END:variables
}
