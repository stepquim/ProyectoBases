package createdatabases;
import java.sql.*;

public class JDBCExample {

    // JDBC driver name and database URL

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "admin1234";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            String sql, newdb;

            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //STEP 4: Execute a query
            System.out.println("Creating table in given database...");
            stmt = conn.createStatement();

            sql = "CREATE DATABASE proyecto";
            stmt.executeUpdate(sql);

            newdb = "jdbc:mysql://localhost/proyecto";

            //STEP 3: Open a connection
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(newdb, USER, PASS);
            System.out.println("Connected database successfully...");

            //STEP 4: Execute a query
            System.out.println("Creating table in given database...");
            stmt = conn.createStatement();

            sql = "CREATE TABLE Empleado "
                    + "(cedula VARCHAR(10), "
                    + " nombre VARCHAR(30), "
                    + " direccion VARCHAR(30), "
                    + " telefono VARCHAR(30), "
                    + " PRIMARY KEY (cedula))";
            stmt.executeUpdate(sql);

            sql = "CREATE TABLE Material "
                    + "(idproducto INT NOT NULL AUTO_INCREMENT, "
                    + " nombre VARCHAR(30), "
                    + " cantidad INT(3), "
                    + " precio DECIMAL(4,2), "
                    + " fechacompra DATE, "
                    + " descripcion VARCHAR(100), "
                    + " idproveedor VARCHAR(13), "
                    + " PRIMARY KEY (idproducto))";
            stmt.executeUpdate(sql);

            sql = "CREATE TABLE Proveedor "
                    + "(idproveedor VARCHAR(13) NOT NULL, "
                    + " nombre VARCHAR(30), "
                    + " telefono VARCHAR(10),"
                    + " direccion VARCHAR(30), "
                    + " PRIMARY KEY (idproveedor))";
            stmt.executeUpdate(sql);

            sql = "CREATE TABLE Cliente "
                    + "(cedula VARCHAR(10), "
                    + " ruc VARCHAR(13), "
                    + " nombre VARCHAR(30), "
                    + " direccion VARCHAR(30), "
                    + " telefono VARCHAR(10), "
                    + " PRIMARY KEY (cedula, ruc))";
            stmt.executeUpdate(sql);

            sql = "CREATE TABLE Factura "
                    + "(idfactura INT NOT NULL AUTO_INCREMENT, "
                    + " direccion VARCHAR(30), "
                    + " telefono VARCHAR(10), "
                    + " cedula VARCHAR(10), "
                    + " ruc VARCHAR(13), "
                    + " PRIMARY KEY (idfactura))";
            stmt.executeUpdate(sql);

            sql = "ALTER TABLE Factura ADD fecha DATE AFTER telefono";
            stmt.executeUpdate(sql);

            sql = "ALTER TABLE Factura ADD FOREIGN KEY (`cedula`, `ruc`) REFERENCES Cliente(`cedula`, `ruc`)";
            stmt.executeUpdate(sql);
            
            sql = "ALTER TABLE Material ADD FOREIGN KEY (idproveedor) REFERENCES Proveedor(idproveedor)";
            stmt.executeUpdate(sql);
            System.out.println("Created table in given database...");
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null) {
                    conn.close();
                }
            } catch (SQLException se) {
            }// do nothing
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
    }//end main
}//end JDBCExample
