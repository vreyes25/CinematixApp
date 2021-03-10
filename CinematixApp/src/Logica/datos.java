/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author TALLER VARELA
 */
public class datos extends Conexion {
    private int IDVendedor;
    private String Nombre;
    private String Direccion;
    private float Sueldo;
    private int IDJornada;
    private int NumeroCelular;
    private int IDTipoDocumento;
    private String Corrreo;


    public int getIDVendedor() {
        return IDVendedor;
    }

    public void setIDVendedor(int IDVendedor) {
        this.IDVendedor = IDVendedor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public float getSueldo() {
        return Sueldo;
    }

    public void setSueldo(float Sueldo) {
        this.Sueldo = Sueldo;
    }

    public int getIDJornada() {
        return IDJornada;
    }

    public void setIDJornada(int IDJornada) {
        this.IDJornada = IDJornada;
    }

    public int getNumeroCelular() {
        return NumeroCelular;
    }

    public void setNumeroCelular(int NumeroCelular) {
        this.NumeroCelular = NumeroCelular;
    }

    public int getIDTipoDocumento() {
        return IDTipoDocumento;
    }

    public void setIDTipoDocumento(int IDTipoDocumento) {
        this.IDTipoDocumento = IDTipoDocumento;
    }

    public String getCorrreo() {
        return Corrreo;
    }

    public void setCorrreo(String Corrreo) {
        this.Corrreo = Corrreo;
    }
    
    public boolean guardar(){
        PreparedStatement pst = null;
        Connection cc = GetConexion();
        String sql = "INSERT INTO vendedor (Nombre, Direccion, Sueldo, IDJornada, NumeroCelular, IDTipoDocumento, Correo)" + "Values(?,?,?,?,?,?,?)";

        try {
            pst = cc.prepareStatement(sql);
            pst.setString(1, this.getNombre());
            pst.setString(2, this.getDireccion());
            pst.setFloat(3, this.getSueldo());
            pst.setInt(4, this.getIDJornada());
            pst.setInt(5, this.getNumeroCelular());
            pst.setInt(6, this.getIDTipoDocumento());
            pst.setString(7, this.getCorrreo());
            pst.execute();
            return true;
            
        } catch (SQLException e) {
            System.out.println(e);
             return false;
    }}
    
  public boolean editar(){
        PreparedStatement Pst = null;
        Connection cc = GetConexion();
        //String vSql = "UPDATE vendedor SET Nombre = ? , Direccion = ?, Sueldo = ?, IDJornada = ?, NumeroCelular = ?, IDTipoDocumento = ?, Correo = ? where IDVendedor= ? ";
        
        /**String vSql="UPDATE vendedor SET Nombre = ?, "
                 + "Direccion = ?,"
                 + "Sueldo = ?,"
                 + "IDJornada = ?,"
                 + "NumeroCelular = ?,"
                 + "IDTipoDocumento=?"
                 + "Correo=?"
                 + "WHERE IDVendedor = ?";**/ 
        
 
        String vSql = "update vendedor set  Nombre= ? , Direccion = ? , Sueldo = ? , IDJornada = ? , NumeroCelular = ? ,IDTipoDocumento = ? ,Correo = ? where IDVendedor= ? ";                
        try {
            Pst = cc.prepareStatement(vSql);
            Pst.setString(1, this.getNombre());
            Pst.setString(2,this.getDireccion());
            Pst.setFloat(3,this.getSueldo());   
            Pst.setInt(4,this.getIDJornada());
            Pst.setInt(5,this.getNumeroCelular());
            Pst.setInt(6,this.getIDTipoDocumento());
            Pst.setString(7,this.getCorrreo());
            Pst.setInt(8, this.getIDVendedor());
            Pst.execute();
            return true;

        } catch (SQLException e) {
            return false;
        }
        
    }
   
}