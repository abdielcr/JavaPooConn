/*
 * By Abdiel Carrasco 
 * 
 * */
package com.go2code.online.models;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.go2code.online.controllers.Conexion;

public class Consulta {
	static Connection conn = null;
	
	public static void mostrar() {
		
		Conexion conexion = new Conexion();
		conn =conexion.getConnection();
		Statement st;
		ResultSet rs;
		String sql = "SELECT * FROM book";
		
		try {
			
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				
				System.out.println("Registro"+rs.getString("pruebaRegistro"));
				System.out.println("Registro"+rs.getString("columnaB"));
				
			}
			
			conn.close();
			rs.close();
			st.close();
			
		}catch (SQLException e){
			
		}
		
	}
	
	public static void main(String[] args) {
		
		mostrar();
		
	}
	
}
