
package com.mycompany.Modelo.Vo;

public class Consulta2Vo {
   private Integer ID_Proyecto;
   private String Constructora;
   private Double Numero_Habitaciones;
   private String Ciudad;
	
public Consulta2Vo(Integer ID_Proyecto, String Constructora, Double Numero_Habitaciones, String Ciudad) {
        this.ID_Proyecto = ID_Proyecto;
        this.Constructora = Constructora;
        this.Numero_Habitaciones= Numero_Habitaciones;
        this.Ciudad = Ciudad;
    }

    public Integer getID_Proyecto() {
        return ID_Proyecto;
    }

    public void setID_Proyecto(Integer iD_Proyecto) {
        ID_Proyecto = iD_Proyecto;
    }

    public String getConstructora() {
        return Constructora;
    }

    public void setConstructora(String constructora) {
        Constructora = constructora;
    }

    public Double getNumero_Habitaciones() {
        return Numero_Habitaciones;
    }

    public void setNumero_Habitaciones(Double numero_Habitaciones) {
        Numero_Habitaciones = numero_Habitaciones;
    }

    public String getCiudad() {
        return Ciudad;
    }
    
    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }
    

}
