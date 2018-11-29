/*
 * By Abdiel Carrasco 
 * 
 * */
package com.go2code.online.controllers;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Conexion {
	
//Datos de conexiòn	
	
	private static String     url    = "jdbc:mysql://localhost/JAVA";
	private static String     user   = "root";
	private static String     pass   = "s4m3sg33k";
	private static String     driver = "com.mysql.jdbc.Driver";
	private static Connection conexion;

//Generando Conexiòn	
	public Conexion() {
		try {
			
			Class.forName(driver);
			conexion=DriverManager.getConnection(url,user,pass);
			System.out.println("Conexion establecida con exito");
			
		}catch(ClassNotFoundException | SQLException e ){
			
			System.out.println("Conexion Fallida Revisa tu còdigo");
		}
	}
	
//Retorna Conexiòn	
	
	public Connection getConnection() {
		return conexion;
	}
}
