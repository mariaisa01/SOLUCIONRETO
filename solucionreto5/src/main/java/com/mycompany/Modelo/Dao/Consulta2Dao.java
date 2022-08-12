package com.mycompany.Modelo.Dao;

import com.mycompany.Modelo.Vo.Consulta2Vo;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import com.mycompany.Utilidades.JDBCUtilities;


public class Consulta2Dao {
	
public ArrayList<Consulta2Vo> listar() throws SQLException{
        ArrayList<Consulta2Vo> resultado = new ArrayList<Consulta2Vo>();
        Connection conn = JDBCUtilities.gConnection();

        try{
            String sql = "SELECT ID_Proyecto, Constructora, Numero_Habitaciones,Ciudad  FROM Proyecto"
			   + " WHERE Clasificacion == 'Casa Campestre' \n" +
			"AND Ciudad IN('Santa Marta', 'Cartagena', 'Barranquilla');";
                        
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            Consulta2Vo casas = new Consulta2Vo(
                rs.getInt("ID_Proyecto"), 
                rs.getString("Constructora"),
                rs.getDouble("Numero_Habitaciones"),
                rs.getString("Ciudad")
            );
    
            resultado.add(casas);
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


