/*
 * By Abdiel Carrasco 
 * 
 * */
package com.go2code.online.controllers;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion { //jdbc:sqlserver://localhost;user=MyUserName;password=*****; jdbc:sqlserver://localhost:1433;integratedSecurity=true;<more properties as required>;
//Datos de conexion	
	private static String     url      = "jdbc:sqlserver://";//Mysql conecction String (jdbc:mysql://localhost/JAVA) DB2/AS400 connection String (jdbc:as400://server/lib,user,pass)
	private static String     server   = "";//Servidor DB
	private static String     port     = "";//Servidor DB
	private static String     db   	   = "";//Schema-libreria Conexion
	private static String     user     = "";//User DB
	private static String     pass     = "";//Pass DB
	private static String     driver   = "com.microsoft.sqlserver.jdbc.SQLServerDriver";//Mysql Driver(com.mysql.jdbc.Driver ; DB2/AS400 Driver (com.ibm.as400.access.AS400JDBCDriver)
	private static Connection conexion;

//Generando Conexion	
	public Conexion() {
		try {
			Class.forName(driver);
			conexion=DriverManager.getConnection(url+server+port,user,pass);
			System.out.println("Conexion establecida con exito");
		}catch(ClassNotFoundException | SQLException e ){
			System.out.println("Conexion Fallida Revisa tu codigo"+e);
		}
	}
//Retorna Conexion	
	public Connection getConnection() {
		return conexion;
	}
}
