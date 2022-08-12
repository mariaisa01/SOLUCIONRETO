
package com.mycompany.Modelo.Dao;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import com.mycompany.Utilidades.JDBCUtilities;
import com.mycompany.Modelo.Vo.Consulta1Vo;

	
public class Consulta1Dao {
	
public ArrayList<Consulta1Vo> listar() throws SQLException{
        ArrayList<Consulta1Vo> resultado = new ArrayList<Consulta1Vo>();
        Connection conn = JDBCUtilities.gConnection();

        try{
           String sql = " SELECT ID_lider,Nombre, Primer_Apellido, Ciudad_Residencia FROM Lider ORDER BY Ciudad_Residencia;";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            Consulta1Vo asesor = new Consulta1Vo(
                rs.getInt("ID_lider"),
                rs.getString("Nombre"),
                rs.getString("Primer_Apellido"),
                rs.getString("Ciudad_Residencia")
            );
    
            resultado.add(asesor);
        }
        rs.close();
        stmt.close();
    } finally{
        if (conn != null){
            conn.close();
        }
    }
    return resultado;
}
}

