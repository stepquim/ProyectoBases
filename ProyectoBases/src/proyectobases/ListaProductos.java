/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobases;

/**
 *
 * @author secarden
 */
import java.awt.*;
import java.sql.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sergio Cardenas
 */
public class ListaProductos extends JFrame {
    
    JLabel message = new JLabel();
    JLabel lblListProducts = new JLabel("Listado de Productos:");
    
    Icon imgBtnAgregar = new ImageIcon(getClass().getResource("/imgs/btnAgMaterial.jpg"));
    Icon imgBtnRegresar = new ImageIcon(getClass().getResource("/imgs/btnRegresar.jpg"));
    
    JButton btnAnadir = new JButton();
    JButton btnRegresar = new JButton();
       
    DefaultTableModel modelo = new DefaultTableModel();
    JTable tabListProducts = new JTable();
    JScrollPane sp1 = new JScrollPane(tabListProducts);
    static final String DATABASE_URL = "jdbc:mysql://localhost/proyecto";
           
    public ListaProductos(){
        setVisible(true);
        setSize(430,380);
        setTitle("Añadir producto existente");
        setResizable(false);
        setLocation(900, 200);      
        
        setLocation(900, 200);
                
        message.setBounds(15,270,300,15);
        message.setForeground(Color.ORANGE);

        lblListProducts.setBounds(15,30,250,15);
        lblListProducts.setForeground(Color.white);
        
        modelo.addColumn("Nombre");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");
        tabListProducts.setModel(modelo);
        
        tabListProducts.setBackground(Color.white);
        sp1.setBounds(15, 55, 399, 200);
        
        btnAnadir.setBounds(15,300,125,32);
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
        btnRegresar.setBounds(265,300,125,32);
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
        
        p.add(lblListProducts);
        p.add(message);
        p.add(sp1);
        
        p.add(btnAnadir);
        p.add(btnRegresar);
        
        p.setBorder(new EmptyBorder(5, 5, 5, 5));
        p.setLayout(new BorderLayout(0, 0));
        setContentPane(p);
        
        Connection con = null;
        Statement st = null;
        ResultSet re = null;
        
        try{
            con = DriverManager.getConnection(DATABASE_URL, "root", "admin1234");
            st = con.createStatement();
            re = st.executeQuery("SELECT nombre, cantidad, precio FROM Material");
            ResultSetMetaData m = re.getMetaData();
            int num = m.getColumnCount();
            while(re.next()){
                for(int i = 1; i <= num; i++){
                   modelo.addRow(new Object[]{"" + re.getObject(i), "" + re.getObject(i+1), "" + re.getObject(i+2)});
                   break;
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }finally{
            try{
                re.close();
                st.close();
                con.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }
          
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
    }
    private void btnAnadirActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        message.setText("");
        DefaultTableModel model = (DefaultTableModel)tabListProducts.getModel();
        if (tabListProducts.getSelectedRow() == -1){
            if(tabListProducts.getRowCount() == 0){
                message.setText("La tabla está vacía.");
            }else{
                message.setText("Debe escoger un producto.");
            }
        }else{
            System.out.println("Hacer setter y getters!");
        }
    }  
    class Panel extends javax.swing.JPanel {
        public Panel(){
            this.setSize(430,380);
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
