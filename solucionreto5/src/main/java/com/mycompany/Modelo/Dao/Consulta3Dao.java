package com.mycompany.Modelo.Dao;

import com.mycompany.Modelo.Vo.Consulta3Vo;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import com.mycompany.Utilidades.JDBCUtilities;



public class Consulta3Dao {
	
public ArrayList<Consulta3Vo> listar() throws SQLException{
        ArrayList<Consulta3Vo> resultado = new ArrayList<Consulta3Vo>();
        Connection conn = JDBCUtilities.gConnection();

        try{
            String sql = "SELECT ID_Compra, Constructora, Banco_Vinculado "
            + " FROM Compra "+
            " JOIN Proyecto USING(ID_Proyecto) WHERE Ciudad== 'Salento'"+
            " AND Proveedor=='Homecenter';";
    
            
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            Consulta3Vo compra = new Consulta3Vo(
                rs.getInt( "ID_Compra"),
                rs.getString("Constructora"),
                rs.getString("Banco_Vinculado")
            );
    
            resultado.add(compra);
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

