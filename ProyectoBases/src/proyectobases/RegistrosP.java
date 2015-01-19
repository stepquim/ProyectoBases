/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobases;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sergio Cardenas
 */
public class RegistrosP extends JFrame {
        
    DefaultTableModel modelo = new DefaultTableModel();
    JTable tabListProducts = new JTable();
    JScrollPane sp1 = new JScrollPane(tabListProducts);

    Icon imgBtnAnadirReg = new ImageIcon(getClass().getResource("/imgs/btnAgRegistro.jpg"));
    Icon imgBtnModReg = new ImageIcon(getClass().getResource("/imgs/btnModRegistro.jpg"));
    Icon imgBtnEliReg = new ImageIcon(getClass().getResource("/imgs/btnEliRegistro.jpg"));
    Icon imgBtnAnadirEmpl = new ImageIcon(getClass().getResource("/imgs/btnAgEmpleado.jpg"));
    Icon imgBtnAnadirProv = new ImageIcon(getClass().getResource("/imgs/btnAgProveedor.jpg"));
    Icon imgBtnRegresar = new ImageIcon(getClass().getResource("/imgs/btnRegresar.jpg"));
    
    JButton btnAnadirReg = new JButton();
    JButton btnModificarReg = new JButton();
    JButton btnEliminarReg = new JButton();
    JLabel lblMostrar = new JLabel("Ordenar por:");
    String [] searchBy={"Opción 1","Opción 2","Opción 3"};
    JComboBox buscarPor = new JComboBox(searchBy);
    JButton btnAnadirEmpleado = new JButton();
    JButton btnAnadirProveedor = new JButton();
    JButton btnRegresar = new JButton();
        
        
    public RegistrosP(){
        setVisible(true);
        setSize(920,400);
        setTitle("Registro de Materiales");
        setResizable(false);
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        modelo.addColumn("Tipo");
        modelo.addColumn("Entrada");
        modelo.addColumn("Salida");
        modelo.addColumn("Material");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Destino");
        modelo.addColumn("Proveedor");
        tabListProducts.setModel(modelo);
        
        tabListProducts.setBackground(Color.white);
        sp1.setBounds(5, 10, 905, 200);
                        
        btnAnadirReg.setBounds(15,230,125,32);
        btnAnadirReg.setIcon(imgBtnAnadirReg);
        btnAnadirReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnadirRegistroMouseClicked(evt);
            }
        });
        btnAnadirReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirRegistroActionPerformed(evt);
            }
        });
        
        btnModificarReg.setBounds(265,230,125,32);
        btnModificarReg.setIcon(imgBtnModReg);
        btnModificarReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarRegistroMouseClicked(evt);
            }
        });
        btnModificarReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarRegistroActionPerformed(evt);
            }
        });
        
        btnEliminarReg.setBounds(515,230,125,32);
        btnEliminarReg.setIcon(imgBtnEliReg);
        btnEliminarReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarRegistroMouseClicked(evt);
            }
        });
        btnEliminarReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarRegistroActionPerformed(evt);
            }
        });
        
        btnAnadirEmpleado.setBounds(140,310,125,32);
        btnAnadirEmpleado.setIcon(imgBtnAnadirEmpl);
        btnAnadirEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnadirEmpleadoMouseClicked(evt);
            }
        });
        btnAnadirEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirEmpleadoActionPerformed(evt);
            }
        });
        
        btnAnadirProveedor.setBounds(390,310,125,32);
        btnAnadirProveedor.setIcon(imgBtnAnadirProv);
        btnAnadirProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnadirProveedorMouseClicked(evt);
            }
        });
        btnAnadirProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirProveedorActionPerformed(evt);
            }
        });
        
        btnRegresar.setBounds(775,325,125,32);
        btnRegresar.setIcon(imgBtnRegresar);
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
        });
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        
        lblMostrar.setBounds(775,230,200,20);
        lblMostrar.setForeground(Color.white);
        
        buscarPor.setBounds(775,255,125,20);
        buscarPor.setToolTipText("Ordenar por:");
        
        Panel p = new Panel();
        p.add(sp1);
        
        p.add(btnAnadirReg);
        p.add(btnModificarReg);
        p.add(btnEliminarReg);
        p.add(lblMostrar);
        p.add(buscarPor);
        p.add(btnAnadirEmpleado);
        p.add(btnAnadirProveedor);
        p.add(btnRegresar);
        
        
        
        p.setBorder(new EmptyBorder(5, 5, 5, 5));
        p.setLayout(new BorderLayout(0, 0));
        setContentPane(p);
    }
    
    private void btnAnadirRegistroMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
    }
    private void btnAnadirRegistroActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        System.out.println("Presionaste el botón Añadir Registro");
    }
    private void btnModificarRegistroMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
    }
    private void btnModificarRegistroActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        System.out.println("Presionaste el botón Modificar Registro");
        
    }
    private void btnEliminarRegistroMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
    }
    private void btnEliminarRegistroActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        System.out.println("Presionaste el botón Eliminar Registro");
        
    }
    private void btnAnadirEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
    }
    private void btnAnadirEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        System.out.println("Presionaste el botón Añadir Empleado");
        
    }
    private void btnAnadirProveedorMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
    }
    private void btnAnadirProveedorActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        System.out.println("Presionaste el botón Añadir Proveedor");
        
    }
    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        this.dispose();
        new Menu();
    }
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        
    }  
    
      
    class Panel extends javax.swing.JPanel {
        public Panel(){
            
        }
        @Override
        public void paintComponent (Graphics g){
            Dimension tamanio = getSize();
            ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/imgs/fondoAnadirMaterial.jpg"));
            g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);
            setOpaque(false);
            super.paintComponent(g);
        }
    }
}