/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobases;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Sergio Cardenas
 */
public class Menu extends JFrame {
    
        Facturacion fact;
        RegistrosP reg;
    public Menu() {
        setVisible(true);
        setTitle("SIFCOM");
        setResizable(false);
        setLocationRelativeTo(null);
        cerrar();
        
        JButton btnFactura = new JButton();
        JButton btnRegistro = new JButton();
        JButton btnInventario = new JButton();
        
        Icon imgBtnFactura = new ImageIcon(getClass().getResource("/imgs/btnFactura.jpg"));
        Icon imgBtnRegistro = new ImageIcon(getClass().getResource("/imgs/btnRegistro.jpg"));
        Icon imgBtnInventario = new ImageIcon(getClass().getResource("/imgs/btnInventario.jpg"));
        
        setBounds(400, 40, 640, 640);
       
        btnFactura.setBounds(40, 380, 154, 39);
        btnFactura.setIcon(imgBtnFactura);
        btnFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFacturaMouseClicked(evt);
            }
        });
        btnFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaActionPerformed(evt);
            }
        });
        
        btnRegistro.setBounds(239, 380, 154, 39);
        btnRegistro.setIcon(imgBtnRegistro);
        btnRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistroMouseClicked(evt);
            }
        });
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        
        btnInventario.setBounds(438, 380, 154, 39);
        btnInventario.setIcon(imgBtnInventario);
        btnInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInventarioMouseClicked(evt);
            }
        });
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });
        
        PnlMenu p = new PnlMenu();
        p.add(btnFactura);
        p.add(btnRegistro);
        p.add(btnInventario);
        p.setBorder(new EmptyBorder(5, 5, 5, 5));
        p.setLayout(new BorderLayout(0, 0));
        setContentPane(p);
    }
    
     
    
    public void cerrar(){
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                int v = JOptionPane.showConfirmDialog(new JFrame(), "Está seguro que desea salir?", "Advertencia.", JOptionPane.YES_NO_OPTION);
                if(v == JOptionPane.YES_OPTION){
                    System.exit(0);
                }
                else if(v == JOptionPane.NO_OPTION){
                    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                }     
            }
        });
        
    }
    
    private void btnFacturaActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void btnFacturaMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        fact = new Facturacion();
        this.hide();
    }
    
    
    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        
    }                                          

    private void btnRegistroMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        reg = new RegistrosP();
        this.hide();
    }
    
    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void btnInventarioMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        new Inventario().setVisible(true);
    }
    
    class PnlMenu extends javax.swing.JPanel {
        public PnlMenu(){
            this.setSize(640,640);
        }
        @Override
        public void paintComponent (Graphics g){
            Dimension tamanio = getSize();
            ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/imgs/bienvenida.jpg"));
            g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);
            setOpaque(false);
            super.paintComponent(g);
        }
    }
    
}
