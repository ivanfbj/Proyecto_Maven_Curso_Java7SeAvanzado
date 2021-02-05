package com.entrenamientoJava.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AppStatement {

	private Connection con = null;

	public void conectar() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = null;
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/dbtest?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
					"MitoCode", "1234");
			System.out.println("Conexion exitosa");

		} catch (Exception e) {
			System.out.println("Error de conexión");
		}
	}

	public void desconectar() throws SQLException {
		if (con != null) {
			con.close();
		}
	}

	public boolean leerStatement(Persona per) throws SQLException {
		boolean rpta = false;

		try (Statement st = con.createStatement()) {
			String sql = "Select * from persona where nombre = '" + per.getNombre() + "' and pass = '" + per.getPass()
					+ "'";
			System.out.println("Query =>" + sql);
			ResultSet rs = st.executeQuery(sql);

			if (rs.next()) {
				System.out.println("existen datos");
				rpta = true;
			} else {
				System.out.println("no existen datos");
			}
			return rpta;
		}
	}
	
	public static void main(String[] args) throws SQLException {
		AppStatement app = new AppStatement();
		app.conectar();
		boolean rpta = app.leerStatement(new Persona("Mito", "25' OR 'M' = 'M' "));
		app.desconectar();
		
		if (rpta) {
			System.out.println("Verificacion correcta, ingresando al sistema..");
			
		} else {
			System.out.println("Credenciales incorrectas, acceso denegado");
		}
	}

}
