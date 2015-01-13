/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobases;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.util.LinkedList;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Sergio Cardenas
 */
public class FacturaP extends JFrame {
    public String cliente = "";
    public String ruc = "";
    public String direccion = "";
    public String numfactura = "";
    public String fecha = "";
    public String total= "";
    public String nombre= "";
    public String cantidad= "";
    public String precio= "";
    
    
    
    JLabel lbl1 = new JLabel("Cliente:");
    JLabel lbl2 = new JLabel("RUC:");
    JLabel lbl3 = new JLabel("Dirección:");
    JLabel lbl4 = new JLabel("Nro. de Factura:");
    JLabel lbl5 = new JLabel("Fecha:");
    JLabel lbl6 = new JLabel("Productos");
    JLabel lbl7 = new JLabel("Nombre:");
    JLabel lbl8 = new JLabel("Cantidad:");
    JLabel lbl9 = new JLabel("Precio:");
    JLabel lbl10 = new JLabel("Total:");
    JLabel lbl11 = new JLabel();
    JLabel message = new JLabel();
    JLabel tit1 = new JLabel();
    JLabel tit2 = new JLabel();
    JLabel tit3 = new JLabel();
    
    JTextField txt1 = new JTextField();
    JTextField txt2 = new JTextField();
    JTextField txt3 = new JTextField();
    JTextField txt4 = new JTextField();
    JTextField txt5 = new JTextField();
    JTextField txt6 = new JTextField();
    JTextField txt7 = new JTextField();
    JTextField txt8 = new JTextField();
    JTextField txt9 = new JTextField();
    
    JButton btnCrear = new JButton();
    JButton btnModificar = new JButton();
    JButton btnQuitar = new JButton();
    JButton btnAgCliente = new JButton();
    JButton btnAgProduct = new JButton();
    JButton btnFacturar = new JButton();
    JButton btnRegresar = new JButton();
    JButton btnAgregar = new JButton();
    JButton btnLlenarMan = new JButton();
    
    
    DefaultTableModel modelo = new DefaultTableModel();
    JScrollBar sb1 = new JScrollBar();
    
    
    JTable tabAgregados = new JTable();
    JTable tabInventario = new JTable();
    JScrollPane sp1 = new JScrollPane(tabAgregados);
        
    public FacturaP(){
        setVisible(true);
        setTitle("Facturación");
        setResizable(false);
        setSize(1024, 634);
        setLocationRelativeTo(null);
        
        
        lbl1.setBounds(25,20,100,15);
        lbl1.setForeground(Color.white);
        lbl2.setBounds(25,50,100,15);
        lbl2.setForeground(Color.white);
        lbl3.setBounds(25,80,100,15);
        lbl3.setForeground(Color.white);
        lbl4.setBounds(25,110,100,15);
        lbl4.setForeground(Color.white);
        lbl5.setBounds(245,110,100,15);
        lbl5.setForeground(Color.white);
        Font m = new Font("Arial", Font.BOLD, 14);
        lbl6.setFont(m);
        lbl6.setBounds(205,145,100,15);
        lbl6.setForeground(Color.YELLOW);
        lbl7.setBounds(25,170,100,15);
        lbl7.setForeground(Color.white);
        lbl8.setBounds(192,170,100,15);
        lbl8.setForeground(Color.white);
        lbl9.setBounds(365,170,100,15);
        lbl9.setForeground(Color.white);
        message.setFont(m);
        message.setBounds(25,255,400,15);
        message.setForeground(Color.ORANGE);
        lbl10.setBounds(295,490,80,15);
        lbl10.setForeground(Color.white);
        
                        
        txt1.setBounds(135,15,300,20);
        txt2.setBounds(135,45,300,20);
        txt3.setBounds(135,75,300,20);
        txt4.setBounds(135,105,100,20);
        txt4.setEditable(false);
        txt5.setBounds(305,105,130,20);
        txt6.setBounds(25,195,100,20);
        txt7.setBounds(192,195,70,20);
        txt8.setBounds(365,195,70,20);
        txt9.setBounds(335,490,95,20);
        txt9.setEditable(false);
        
        
        Icon imgBtnCrear = new ImageIcon(getClass().getResource("/imgs/btnCrear.jpg"));
        Icon imgBtnModificar = new ImageIcon(getClass().getResource("/imgs/btnModificar.jpg"));
        Icon imgBtnQuitar = new ImageIcon(getClass().getResource("/imgs/btnQuitar.jpg"));
        
        

        Icon imgBtnAgCliente = new ImageIcon(getClass().getResource("/imgs/btnAgCliente.jpg"));
        Icon imgBtnAgProduct = new ImageIcon(getClass().getResource("/imgs/btnAgProduct.jpg"));
        Icon imgBtnFacturar = new ImageIcon(getClass().getResource("/imgs/btnFacturar.jpg"));
        Icon imgBtnRegresar = new ImageIcon(getClass().getResource("/imgs/btnRegresar.jpg"));
        
        btnCrear.setBounds(25, 220, 100, 25);
        btnCrear.setIcon(imgBtnCrear);
        btnModificar.setBounds(175, 220, 100, 25);
        btnModificar.setIcon(imgBtnModificar);
        btnQuitar.setBounds(335, 220, 100, 25);
        btnQuitar.setIcon(imgBtnQuitar);
        
        
        btnAgCliente.setBounds(25, 510, 125, 32);
        btnAgCliente.setIcon(imgBtnAgCliente);
        btnAgCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgClienteMouseClicked(evt);
            }
        });
        btnAgCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgClienteActionPerformed(evt);
            }
        });
        btnAgProduct.setBounds(25, 552, 125, 32);
        btnAgProduct.setIcon(imgBtnAgProduct);
        btnAgProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgProductMouseClicked(evt);
            }
        });
        btnAgProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgProductActionPerformed(evt);
            }
        });
        btnFacturar.setBounds(160, 510, 125, 32);
        btnFacturar.setIcon(imgBtnFacturar);
        btnFacturar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFacturarMouseClicked(evt);
            }
        });
        btnFacturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturarActionPerformed(evt);
            }
        });
        btnRegresar.setBounds(160, 552, 125, 32);
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
        
        
        
        modelo.addColumn("Nombre");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");
        tabAgregados.setModel(modelo);
        
                
        txt1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt1FocusLost(evt);
            }
        });
        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });
        
        txt2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt2FocusLost(evt);
            }
        });
        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });
        
        txt3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt3FocusLost(evt);
            }
        });
        txt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3ActionPerformed(evt);
            }
        });
        
        txt5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt5FocusLost(evt);
            }
        });
        txt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt5ActionPerformed(evt);
            }
        });
        
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearActionPerformed(evt);
            }
        });
        
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });
        
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnQuitarActionPerformed(evt);
            }
        });
        
        
        /*Revisar!!!!!!!!!!!!!!!!!!!!!*/
//        tabAgregados.setModel(new javax.swing.table.DefaultTableModel(
//            new Object [][] {
//
//            },
//            new String [] {
//                "Nombre", "Cantidad", "Precio"
//            }
//        ) {
//            Class[] types = new Class [] {
//                java.lang.String.class, java.lang.String.class, java.lang.String.class
//            };
//            boolean[] canEdit = new boolean [] {
//                false, true, false
//            };
//
//            public Class getColumnClass(int columnIndex) {
//                return types [columnIndex];
//            }
//
//            public boolean isCellEditable(int rowIndex, int columnIndex) {
//                return canEdit [columnIndex];
//            }
//        });
//        tabAgregados.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                TablaAgregadosMouseClicked(evt);
//            }
//        });
      
//        sp1.setViewportView(tabAgregados);
        
        tabAgregados.setBackground(Color.white);
//        tabAgregados.setBounds(30, 285, 399, 200);
        sp1.setBounds(30, 270, 399, 200);
        
        
        Panel p = new Panel();
                                 
        p.add(lbl1);
        p.add(lbl2);
        p.add(lbl3);
        p.add(lbl4);
        p.add(lbl5);
        p.add(lbl6);
        p.add(lbl7);
        p.add(lbl8);
        p.add(lbl9);
        p.add(message);
        p.add(lbl10);
                
        
        p.add(txt1);
        p.add(txt2);
        p.add(txt3);
        p.add(txt4);
        p.add(txt5);
        p.add(txt6);
        p.add(txt7);
        p.add(txt8);
        p.add(txt9);
                        
        p.add(btnCrear);
        p.add(btnModificar);
        p.add(btnQuitar);
        p.add(btnAgCliente);
        p.add(btnAgProduct);
        p.add(btnFacturar);
        p.add(btnRegresar);
        p.add(sp1);
                
        p.setBorder(new EmptyBorder(5, 5, 5, 5));
        p.setLayout(new BorderLayout(0, 0));
        setContentPane(p);
        
    }
    
    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        cliente = evt.getActionCommand();
        txt1.setForeground(java.awt.Color.RED);
        if (ValidateInputEmpleado.validateFirstName(cliente)){
            //System.out.println( "Valid input.  Thank you." );
            txt1.setForeground(java.awt.Color.BLACK);
        }
    }  
    
    private void txt1FocusLost(java.awt.event.FocusEvent evt) {                                      
        // TODO add your handling code here:
        /*jTextField1.setForeground(java.awt.Color.RED);
        if (ValidateInputEmpleado.validateLastName(lastName)){
            System.out.println( "Valid input.  Thank you." );
            jTextField1.setForeground(java.awt.Color.BLACK);
        }*/
    } 
    
    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        ruc = evt.getActionCommand();
        txt2.setForeground(java.awt.Color.RED);
        if (ValidateInputEmpleado.validateRUC(ruc)){
            //System.out.println( "Valid input.  Thank you." );
            txt2.setForeground(java.awt.Color.BLACK);
        }
    }                                           

    private void txt2FocusLost(java.awt.event.FocusEvent evt) {                                      
        // TODO add your handling code here:
    }
    
    private void txt3ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        direccion = evt.getActionCommand();
        txt3.setForeground(java.awt.Color.RED);
        if (ValidateInputEmpleado.validateAddress(direccion)){
            //System.out.println( "Valid input.  Thank you." );
            txt3.setForeground(java.awt.Color.BLACK);
        }
    }                                           

    private void txt3FocusLost(java.awt.event.FocusEvent evt) {                                      
        // TODO add your handling code here:
    }   
    
    private void txt5ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        fecha = evt.getActionCommand();
        txt5.setForeground(java.awt.Color.RED);
        if (ValidateInputEmpleado.validateFecha(fecha)){
            //System.out.println( "Valid input.  Thank you." );
            txt5.setForeground(java.awt.Color.BLACK);
        }
    }                                           

    private void txt5FocusLost(java.awt.event.FocusEvent evt) {                                      
        // TODO add your handling code here:
    }   
    
    private void BtnCrearActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        message.setText("");
        DefaultTableModel factura = (DefaultTableModel) tabAgregados.getModel();
        if (!txt6.getText().trim().equals("") && !txt7.getText().trim().equals("") && !txt8.getText().trim().equals("") ){
            factura.addRow(new Object[]{txt6.getText(), txt7.getText(), txt8.getText()});
            txt6.setText(""); txt7.setText(""); txt8.setText("");
        } else {
            message.setText("Ningún campo puede quedar en blanco.");
        }
    } 
    
    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        message.setText("");
        DefaultTableModel model = (DefaultTableModel) tabAgregados.getModel();
        if (tabAgregados.getSelectedRow()==-1){
            if(tabAgregados.getRowCount()==0){
                message.setText("La tabla está vacía.");
            }else{
                message.setText("Debe escoger un producto.");
            }
        }else{
            model.setValueAt(txt6.getText(), tabAgregados.getSelectedRow(), 0);
            model.setValueAt(txt7.getText(), tabAgregados.getSelectedRow(), 1);
            model.setValueAt(txt8.getText(), tabAgregados.getSelectedRow(), 2);
        }

        /*if (!jTextFieldNombre.getText().trim().equals("")){
            model.addRow(new Object[]{jTextFieldNombre.getText(), jTextFieldCant.getText(), jTextFieldPrecio.getText()});
        } else {
            lMessage.setText("El nombre no puede quedar en blanco");
        }*/
    } 
    
    private void BtnQuitarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        message.setText("");
        DefaultTableModel model = (DefaultTableModel) tabAgregados.getModel();
        if (tabAgregados.getSelectedRow()==-1){
            if(tabAgregados.getRowCount()==0){
                message.setText("La tabla está vacía.");
            }else{
                message.setText("Debe escoger un producto.");
            }
        }else{
            model.removeRow(tabAgregados.getSelectedRow());
        }

    }  
    
    private void btnAgClienteMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        dispose();
    }
    private void btnAgClienteActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    } 
    
    private void btnAgProductMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        dispose();
    }
    private void btnAgProductActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    } 
    
    private void btnFacturarMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        dispose();
    }
    private void btnFacturarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }
    
    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        dispose();
    }
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }  
    
    class Panel extends javax.swing.JPanel {
        public Panel(){
            this.setSize(1024,634);
        }
        @Override
        public void paintComponent (Graphics g){
            Dimension tamanio = getSize();
            ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/imgs/fondoFactura.jpg"));
            g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);
            setOpaque(false);
            super.paintComponent(g);
        }
    }
    
    class PanelTabAgregados extends javax.swing.JPanel {
        public PanelTabAgregados() {
            this.setSize(499,300);
        }
        @Override
        public void paintComponent (Graphics g){
            Dimension tamanio = getSize();
            g.drawImage(null,0,0,tamanio.width, tamanio.height, null);
            setOpaque(false);
            super.paintComponent(g);
        }
    }
    
   
}