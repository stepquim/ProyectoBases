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
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.LinkedList;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Sergio Cardenas
 */
public class Facturacion extends JFrame {
    public String cliente = "";
    public String ruc = "";
    public String direccion = "";
    public String numfactura = "";
    public String fecha = "";
    public String total= "";
    public String nombre= "";
    public String cantidad= "";
    public String precio= "";
    
    
    JRadioButton op_compra = new JRadioButton("Compra", false);
    JRadioButton op_venta = new JRadioButton("Venta", false);
    
    ButtonGroup grupo = new ButtonGroup();
        
    JLabel lbl0 = new JLabel("Tipo:");
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
    JLabel formatoFecha = new JLabel("dd/mm/aaaa");
    
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
    JButton btnNewProduct = new JButton();
    JButton btnProductos = new JButton();
    JButton btnFacturar = new JButton();
    JButton btnRegresar = new JButton();
    JButton btnAgregar = new JButton();
    JButton btnLlenarMan = new JButton();
    
    
    DefaultTableModel modelo = new DefaultTableModel();
    JTable tabAgregados = new JTable();
    JScrollPane sp1 = new JScrollPane(tabAgregados);
        
    public Facturacion(){
        setTitle("Facturación");
        setSize(470, 500);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(0);
        initComponentsPersonalizated();
        
        op_compra.setBounds(135,5,90,15);
        op_compra.setOpaque(false);
        op_compra.setForeground(Color.white);
        op_venta.setBounds(230,5,70,15);
        op_venta.setOpaque(false);
        op_venta.setForeground(Color.white);
        
        lbl0.setBounds(25,5,100,15);
        lbl0.setForeground(Color.white);
        lbl1.setBounds(25,35,100,15);
        lbl1.setForeground(Color.white);
        lbl2.setBounds(25,65,100,15);
        lbl2.setForeground(Color.white);
        lbl3.setBounds(25,95,100,15);
        lbl3.setForeground(Color.white);
        lbl4.setBounds(25,125,100,15);
        lbl4.setForeground(Color.white);
        lbl5.setBounds(245,125,100,15);
        lbl5.setForeground(Color.white);
        Font m = new Font("Arial", Font.BOLD, 14);
        lbl6.setFont(m);
        lbl6.setBounds(205,160,100,15);
        lbl6.setForeground(Color.YELLOW);
        lbl7.setBounds(25,185,100,15);
        lbl7.setForeground(Color.white);
        lbl8.setBounds(192,185,100,15);
        lbl8.setForeground(Color.white);
        lbl9.setBounds(365,185,100,15);
        lbl9.setForeground(Color.white);
        message.setFont(m);
        message.setBounds(25,415,400,15);
        message.setForeground(Color.ORANGE);
        lbl10.setBounds(295,405,80,15);
        lbl10.setForeground(Color.white);
        formatoFecha.setBounds(305,140,200,20);
        formatoFecha.setForeground(Color.orange);
                        
        txt1.setBounds(135,30,300,20);
        txt1.setEditable(false);
        txt2.setBounds(135,60,300,20);
        txt2.setEditable(false);
        txt3.setBounds(135,90,300,20);
        txt3.setEditable(false);
        txt4.setBounds(135,120,100,20); //
        txt4.setEditable(false);
        txt5.setBounds(305,120,130,20);
        txt5.setEditable(false);
        txt6.setBounds(25,210,100,20);
        txt6.setEditable(false);
        txt7.setBounds(192,210,70,20);
        txt7.setEditable(false);
        txt8.setBounds(365,210,70,20);
        txt8.setEditable(false);
        txt9.setBounds(335,405,95,20); //
        txt9.setEditable(false);
        
        
        Icon imgBtnCrear = new ImageIcon(getClass().getResource("/imgs/btnCrear.jpg"));
        Icon imgBtnModificar = new ImageIcon(getClass().getResource("/imgs/btnModificar.jpg"));
        Icon imgBtnQuitar = new ImageIcon(getClass().getResource("/imgs/btnQuitar.jpg"));
        
        

        Icon imgBtnAgCliente = new ImageIcon(getClass().getResource("/imgs/btnAgCliente.jpg"));
        Icon imgBtnAgProduct = new ImageIcon(getClass().getResource("/imgs/btnAgProduct.jpg"));
        Icon imgBtnFacturar = new ImageIcon(getClass().getResource("/imgs/btnFacturar.jpg"));
        Icon imgBtnRegresar = new ImageIcon(getClass().getResource("/imgs/btnRegresar.jpg"));
        
        btnCrear.setBounds(25, 235, 100, 25);
        btnCrear.setIcon(imgBtnCrear);
        btnModificar.setBounds(175, 235, 100, 25);
        btnModificar.setIcon(imgBtnModificar);
        btnQuitar.setBounds(335, 235, 100, 25);
        btnQuitar.setIcon(imgBtnQuitar);
                
        btnNewProduct.setBounds(25, 160, 125, 32);
        btnNewProduct.setIcon(imgBtnAgCliente);        
        
        btnNewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewProductoActionPerformed(evt);
            }
        });
        btnProductos.setBounds(305,160, 125, 32);
        btnProductos.setIcon(imgBtnAgProduct);
        
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgProductActionPerformed(evt);
            }
        });
        btnFacturar.setBounds(25, 430, 125, 32);
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
        btnRegresar.setBounds(305, 430, 125, 32);
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
        
        
        
        op_compra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opCompraMouseClicked(evt);
            }
        });
        
        op_venta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opVentaMouseClicked(evt);
            }
        });
                
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
        
        txt6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt6FocusLost(evt);
            }
        });
        txt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt6ActionPerformed(evt);
            }
        });
        
        txt7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt7FocusLost(evt);
            }
        });
        txt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt7ActionPerformed(evt);
            }
        });
        
        txt8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt8FocusLost(evt);
            }
        });
        txt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt8ActionPerformed(evt);
            }
        });
        
        
        tabAgregados.setBackground(Color.white);
        sp1.setBounds(30, 200, 399, 200);
        
        cerrar();
        
        Panel p = new Panel();
        
        grupo.add(op_compra);
        grupo.add(op_venta);
        
        p.add(op_compra);
        p.add(op_venta);
        
        p.add(lbl0);
        p.add(lbl1);
        p.add(lbl2);
        p.add(lbl3);
        p.add(lbl4);
        p.add(lbl5);
        
        p.add(message);
        p.add(lbl10);
        p.add(formatoFecha);        
        
        p.add(txt1);
        p.add(txt2);
        p.add(txt3);
        p.add(txt4);
        p.add(txt5);
        p.add(txt9);
                        
        
        p.add(btnNewProduct);
        p.add(btnProductos);
        p.add(btnFacturar);
        p.add(btnRegresar);
        p.add(sp1);
        
               
        p.setBorder(new EmptyBorder(5, 5, 5, 5));
        p.setLayout(new BorderLayout(0, 0));
        setContentPane(p);
        
    }
    
    
    public void opCompraMouseClicked(java.awt.event.MouseEvent evt){
        if(op_compra.isSelected() == true){
            btnProductos.setEnabled(false);
            btnNewProduct.setEnabled(true);
            lbl2.setText("RUC:");
            txt1.setEditable(true);
            txt2.setEditable(true);
            txt3.setEditable(true);
            txt5.setEditable(true);
            txt6.setEditable(true);
            txt7.setEditable(true);
            txt8.setEditable(true);
            message.setText("");
        }
     
    }
    
    public void opVentaMouseClicked(java.awt.event.MouseEvent evt){
        if(op_venta.isSelected() == true){
            lbl2.setText("RUC/Cédula:");
            btnNewProduct.setEnabled(false);
            btnProductos.setEnabled(true);
            txt1.setEditable(true);
            txt2.setEditable(true);
            txt3.setEditable(true);
            txt5.setEditable(true);
            txt6.setEditable(true);
            txt7.setEditable(true);
            txt8.setEditable(true);
            message.setText("");
        }
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
            formatoFecha.setText("Formato correcto");
            formatoFecha.setForeground(Color.GREEN);
        }else{
            formatoFecha.setText("Formato incorrecto");
            formatoFecha.setForeground(Color.RED);
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
    
    private void btnNewProductoMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        
    }
    private void btnNewProductoActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        
        if((op_compra.isSelected() == false) && (op_venta.isSelected() == false)){
            JOptionPane.showMessageDialog(new JFrame(), "Escoja el tipo de factura.", "Información!", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(op_compra.isSelected())
            new NuevoProducto();
                 
    } 
    
    private void btnAgProductMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        
    }
    private void btnAgProductActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        
        if((op_compra.isSelected() == false) && (op_venta.isSelected() == false)){
            JOptionPane.showMessageDialog(new JFrame(), "Escoja el tipo de factura.", "Información!", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(op_venta.isSelected())
            new ListaProductos();
    } 
    
    private void btnFacturarMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
    }
    private void btnFacturarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        if (!txt1.getText().trim().equals("") && !txt2.getText().trim().equals("") && !txt3.getText().trim().equals("") && !txt5.getText().trim().equals("")){
            message.setText("Verificando ...");
            message.setForeground(Color.GREEN);
        }else{
            message.setText("Ningún campo puede quedar vacío.");
        }
        System.out.println("Has dado clic");
    }
        
    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        this.dispose();
        new Menu().setVisible(true);
    }
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }  
    
    private void txt6ActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
        nombre = evt.getActionCommand();
        txt6.setForeground(java.awt.Color.RED);
        if (ValidateInputEmpleado.validateProductName(nombre)){
            //System.out.println( "Valid input.  Thank you." );
            txt6.setForeground(java.awt.Color.BLACK);
        }
    }      
    
    private void txt6FocusLost(java.awt.event.FocusEvent evt) {                                           
        // TODO add your handling code here:
    }
    
    private void txt7ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        cantidad = evt.getActionCommand();
        txt7.setForeground(java.awt.Color.RED);
        if (ValidateInputEmpleado.validateCantidad(cantidad)){
            //System.out.println( "Valid input.  Thank you." );
            txt7.setForeground(java.awt.Color.BLACK);
        }
    }                                              

    private void txt7FocusLost(java.awt.event.FocusEvent evt) {                                         
        // TODO add your handling code here:
    }  
   
    
    private void txt8ActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
        precio = evt.getActionCommand();
        txt8.setForeground(java.awt.Color.RED);
        if (ValidateInputEmpleado.validatePrecio(precio)){
            //System.out.println( "Valid input.  Thank you." );
            txt8.setForeground(java.awt.Color.BLACK);
        }
    }                                                

    private void txt8FocusLost(java.awt.event.FocusEvent evt) {                                           
        // TODO add your handling code here:
    }
    
    public void cerrar(){
       addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                if(e.WINDOW_CLOSED == 1){
                    new Menu();
                }
            }
        }); 
    }
    
    private void initComponentsPersonalizated(){
        txt1.setDocument(new JTextFieldLimit(30));
        txt2.setDocument(new JTextFieldLimit(13));
        txt3.setDocument(new JTextFieldLimit(50));
        txt4.setDocument(new JTextFieldLimit(4));
        txt5.setDocument(new JTextFieldLimit(10));
        txt9.setDocument(new JTextFieldLimit(10));
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
    
}
