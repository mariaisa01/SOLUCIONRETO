
package com.mycompany.Controlador;

import java.sql.SQLException;
import java.util.ArrayList;
import com.mycompany.Modelo.Dao.Consulta1Dao;
import com.mycompany.Modelo.Dao.Consulta2Dao;
import com.mycompany.Modelo.Dao.Consulta3Dao;
import com.mycompany.Modelo.Vo.Consulta1Vo;
import com.mycompany.Modelo.Vo.Consulta2Vo;
import com.mycompany.Modelo.Vo.Consulta3Vo;



public class RequerimientoControlador {
	
  
    private final Consulta1Dao consulta1Dao;
    private final Consulta2Dao consulta2Dao;
    private final Consulta3Dao consulta3Dao;
    
    public RequerimientoControlador() {
         consulta1Dao = new Consulta1Dao();
         consulta2Dao = new Consulta2Dao();
         consulta3Dao = new Consulta3Dao();
    }

    public ArrayList<Consulta1Vo> consultarAsesorPorCiudad() throws SQLException{
        return consulta1Dao.listar();

    } 

    public ArrayList<Consulta2Vo> consultarProyectoCasaCampestre() throws SQLException{
        return consulta2Dao.listar();

    }

    public ArrayList<Consulta3Vo> consultarCompraPorProveedor() throws SQLException{
        return consulta3Dao.listar();
    
    }
}


