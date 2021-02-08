package com.entrenamientoJava.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.sql.CallableStatement;

import com.mysql.cj.jdbc.JdbcConnection;

public class CallableStatement {

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
		PreparedStatement ps = null;

		try {
			String sql = "Select * from persona where nombre = ? and pass = ?;";
			System.out.println("Query =>" + sql);

			ps = con.prepareStatement(sql);
			ps.setString(1, per.getNombre());
			ps.setString(2, per.getPass());

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				System.out.println("existen datos");
				rpta = true;
			} else {
				System.out.println("no existen datos");
			}
			return rpta;
		} finally {

		}
	}

	public void modificarBatchStatement(Persona per) throws SQLException {
		long ini = System.currentTimeMillis();
		try {
			con.setAutoCommit(false);
			for (int i = 0; i < 10000; i++) {

				Statement st = con.createStatement();
				String sql = "update persona set nombre = '" + per.getNombre() + "', pass = '" + per.getPass() + "';";
				// System.out.println("Query = > " + sql);
				int numeroFilas = st.executeUpdate(sql);
				// System.out.println("#Filas Afectadas - Statement " + numeroFilas);
			}
			con.commit();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			con.rollback();
		}
		long fin = System.currentTimeMillis();

		System.out.println("Statement : " + (fin - ini));
	}

	public void modificarBatchPreparedStatement(Persona per) throws SQLException {
		long ini = System.currentTimeMillis();
		try {
			con.setAutoCommit(false);
			for (int i = 0; i < 10000; i++) {
				// String sql = "Update persona set nombre = ?,pass = ?;";
				PreparedStatement ps = con.prepareStatement("Update persona set nombre = ?,pass = ?;");
				ps.setString(1, per.getNombre());
				ps.setString(2, per.getPass());
				// System.out.println("Query = > " + sql);
				// int numeroFilas = ps.executeUpdate(sql);
				// System.out.println("#Filas Afectadas - Statement " + numeroFilas);
			}
			con.commit();
		} catch (Exception e) {
			con.rollback();
			System.out.println(e.getMessage());
		}
		long fin = System.currentTimeMillis();

		System.out.println("BatchPreparedStatement : " + (fin - ini));

	}

	public void modificarExecuteBatchPreparedStatement(Persona per) throws SQLException {
		long ini = System.currentTimeMillis();
		try {
			con.setAutoCommit(false);
			PreparedStatement ps = null;
			for (int i = 0; i < 10000; i++) {
				// String sql = "Update persona set nombre = ?,pass = ?;";
				ps = con.prepareStatement("Update persona set nombre = ?,pass = ?;");
				ps.setString(1, per.getNombre());
				ps.setString(2, per.getPass());
				// System.out.println("Query = > " + sql);
				// int numeroFilas = ps.executeUpdate(sql);
				// System.out.println("#Filas Afectadas - Statement " + numeroFilas);
				ps.addBatch();
			}
			ps.executeBatch();
			con.commit();
		} catch (Exception e) {
			con.rollback();
			System.out.println(e.getMessage());
		}
		long fin = System.currentTimeMillis();

		System.out.println("ExecuteBatchPreparedStatement : " + (fin - ini));

	}

	public void registrarCallableStatement(Persona per) {
		try {
			String sql = "{call spTest(?,?)}";
			CallableStatement cs = (CallableStatement) con.prepareCall(sql);
			cs.setString(1, per.getNombre());
			cs.setString(2, per.getPass());
			cs.execute();
			cs.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void ListarCallableStatement() {
		try {
			String sql = "{call spListar()}";
			CallableStatement cs = (CallableStatement) con.prepareCall(sql);
			cs.execute();
			ResultSet rs = cs.getResultSet();
			while (rs.next()) {
				System.out.print(rs.getInt(""));
				System.out.print(rs.getString("nombre"));
				System.out.println(rs.getString("pass"));
				
			}
			cs.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	
	public void ListarOutCallableStatement(Persona per) {
		try {
			String sql = "{call spSalidaID(?,?)}";
			CallableStatement cs = con.prepareCall(sql);
			cs.setString(1,per.getNombre());
			cs.registerOutParameter(2,Types.INTEGER);
			cs.execute();
			
			int idSalida = cs.getInt(2);
			System.out.println("El código obtenidop de salida es: " + idSalida);
			cs.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) throws SQLException {
		CallableStatement app = new CallableStatement();
		app.conectar();

		//app.registrarCallableStatement(new Persona("MitoCode", "25"));
		app.ListarCallableStatement();

		app.desconectar();

	}

}
