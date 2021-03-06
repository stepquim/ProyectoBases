/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobases;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Stephany
 */
public class Registros extends javax.swing.JFrame {

    /**
     * Creates new form Material
     */
    public Registros() {
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

        VentanaMaterial = new javax.swing.JPanel();
        BtnAnadir = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaRegistro = new javax.swing.JTable();
        BtnModificar1 = new javax.swing.JButton();
        BtnAnadir1 = new javax.swing.JButton();
        BtnAnadir2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BtnAnadir.setText("Añadir Registro");
        BtnAnadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAnadirMouseClicked(evt);
            }
        });
        BtnAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAnadirActionPerformed(evt);
            }
        });

        BtnEliminar.setText("Eliminar Registro");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnModificar.setText("Modificar Registro");
        BtnModificar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BtnModificarStateChanged(evt);
            }
        });

        BtnCancelar.setText("Mostrar Registros en base a:");

        TablaRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Entrada", "Salida", "Material", "Cantidad", "Destino", "Proovedor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaRegistro);
        if (TablaRegistro.getColumnModel().getColumnCount() > 0) {
            TablaRegistro.getColumnModel().getColumn(1).setResizable(false);
            TablaRegistro.getColumnModel().getColumn(4).setResizable(false);
        }

        BtnModificar1.setText("Regresar");
        BtnModificar1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BtnModificar1StateChanged(evt);
            }
        });
        BtnModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificar1ActionPerformed(evt);
            }
        });

        BtnAnadir1.setText("Añadir Empleado");
        BtnAnadir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAnadir1MouseClicked(evt);
            }
        });
        BtnAnadir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAnadir1ActionPerformed(evt);
            }
        });

        BtnAnadir2.setText("Añadir Proveedor");
        BtnAnadir2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAnadir2MouseClicked(evt);
            }
        });
        BtnAnadir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAnadir2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout VentanaMaterialLayout = new javax.swing.GroupLayout(VentanaMaterial);
        VentanaMaterial.setLayout(VentanaMaterialLayout);
        VentanaMaterialLayout.setHorizontalGroup(
            VentanaMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaMaterialLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(VentanaMaterialLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(VentanaMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(BtnAnadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(VentanaMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VentanaMaterialLayout.createSequentialGroup()
                        .addComponent(BtnCancelar)
                        .addGap(137, 137, 137)
                        .addComponent(BtnModificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(VentanaMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(BtnAnadir1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnAnadir2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        VentanaMaterialLayout.setVerticalGroup(
            VentanaMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaMaterialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(VentanaMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAnadir)
                    .addComponent(BtnCancelar)
                    .addComponent(BtnModificar1))
                .addGap(8, 8, 8)
                .addGroup(VentanaMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnEliminar)
                    .addComponent(BtnAnadir1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(VentanaMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnModificar)
                    .addComponent(BtnAnadir2))
                .addContainerGap())
        );

        jMenu.setText("Menú");
        jMenuBar1.add(jMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(VentanaMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VentanaMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAnadirActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BtnAnadirActionPerformed

    private void BtnAnadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAnadirMouseClicked
        // TODO add your handling code here
        AnadirRegistro registroWindow = new AnadirRegistro();
        registroWindow.setVisible(true);
        DefaultTableModel tRegistro = (DefaultTableModel) TablaRegistro.getModel();
        registroWindow.setTableReference(tRegistro, TablaRegistro);
    }//GEN-LAST:event_BtnAnadirMouseClicked

    private void BtnModificarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BtnModificarStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnModificarStateChanged

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnModificar1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BtnModificar1StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnModificar1StateChanged

    private void BtnAnadir1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAnadir1MouseClicked
        // TODO add your handling code here:
         new AnadirEmpleado().setVisible(true);
    }//GEN-LAST:event_BtnAnadir1MouseClicked

    private void BtnAnadir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAnadir1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAnadir1ActionPerformed

    private void BtnAnadir2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAnadir2MouseClicked
        // TODO add your handling code here:
        new AnadirProveedor().setVisible(true);
    }//GEN-LAST:event_BtnAnadir2MouseClicked

    private void BtnAnadir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAnadir2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAnadir2ActionPerformed

    private void BtnModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificar1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_BtnModificar1ActionPerformed

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
            java.util.logging.Logger.getLogger(Material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Material().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAnadir;
    private javax.swing.JButton BtnAnadir1;
    private javax.swing.JButton BtnAnadir2;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnModificar1;
    private javax.swing.JTable TablaRegistro;
    private javax.swing.JPanel VentanaMaterial;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
