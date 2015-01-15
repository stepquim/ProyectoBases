/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobases;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Sergio Cardenas
 */
public class NuevoProducto extends JFrame {
    
    JLabel lblProve = new JLabel("Proveedor:");
    JLabel lblNom = new JLabel("Nombre:");
    JLabel lblCant = new JLabel("Cantidad:");
    JLabel lblPrec = new JLabel("Precio:");
    JLabel lblFechaIng = new JLabel("Fecha Ingreso:");
    JLabel lblDescrip = new JLabel("Descripción");

    JTextField txtProve = new JTextField();
    JTextField txtNom = new JTextField();
    JTextField txtCant = new JTextField();
    JTextField txtPrec = new JTextField("Hay que verificar");
    JTextField txtFechaIng = new JTextField("Formato: dd/mm/aaaa");
    JTextField txtDescrip = new JTextField();

    Icon imgBtnAgregar = new ImageIcon(getClass().getResource("/imgs/btnAgMaterial.jpg"));
    Icon imgBtnRegresar = new ImageIcon(getClass().getResource("/imgs/btnRegresar.jpg"));
    
    JButton btnAnadir = new JButton();
    JButton btnRegresar = new JButton();
        
        
    public NuevoProducto(){
        setVisible(true);
        setSize(420,420);
        setTitle("Añadir nuevo material");
        setResizable(false);
        setLocation(900, 200);
                
        
        lblProve.setBounds(15,30,100,15);
        lblProve.setForeground(Color.white);
        lblNom.setBounds(15,60,100,15);
        lblNom.setForeground(Color.white);
        lblCant.setBounds(15,90,100,15);
        lblCant.setForeground(Color.white);
        lblPrec.setBounds(15,120,100,15);
        lblPrec.setForeground(Color.white);
        lblFechaIng.setBounds(15,150,100,15);
        lblFechaIng.setForeground(Color.white);
        lblDescrip.setBounds(15,180,100,15);
        lblDescrip.setForeground(Color.white);
        
        txtProve.setBounds(115,25,275,20);
        txtNom.setBounds(115,55,275,20);
        txtCant.setBounds(115,85,275,20);
        txtPrec.setBounds(115,115,275,20);
        txtFechaIng.setBounds(115,145,275,20);
        txtDescrip.setBounds(15,195,375,120);
                
        btnAnadir.setBounds(15,340,125,32);
        btnAnadir.setIcon(imgBtnAgregar);
        btnAnadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnadirMouseClicked(evt);
            }
        });
        btnAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirActionPerformed(evt);
            }
        });
        btnRegresar.setBounds(265,340,125,32);
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
        
        Panel p = new Panel();
        p.add(lblProve);
        p.add(lblNom);
        p.add(lblCant);
        p.add(lblPrec);
        p.add(lblFechaIng);
        p.add(lblDescrip);
        
        p.add(txtProve);
        p.add(txtNom);
        p.add(txtCant);
        p.add(txtPrec);
        p.add(txtFechaIng);
        p.add(txtDescrip);
        p.add(btnAnadir);
        p.add(btnRegresar);
        
        p.setBorder(new EmptyBorder(5, 5, 5, 5));
        p.setLayout(new BorderLayout(0, 0));
        setContentPane(p);
        
    }
    
    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        this.dispose();
    }
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }  
    
    private void btnAnadirMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        this.dispose();
    }
    private void btnAnadirActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }  
    class Panel extends javax.swing.JPanel {
        public Panel(){
            this.setSize(420,420);
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