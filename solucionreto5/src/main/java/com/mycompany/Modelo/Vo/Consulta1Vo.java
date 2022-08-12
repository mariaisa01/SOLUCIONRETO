
package com.mycompany.Modelo.Vo;

public class Consulta1Vo {
	
private Integer Id_Lider;
    private String Nombre;
    private String Primer_Apellido;
    private String Ciudad_Residencia;

    public Consulta1Vo(Integer Id_Lider, String Nombre, String Primer_Apellido, String Ciudad_Residencia) { 
        this.Id_Lider = Id_Lider;
        this.Nombre = Nombre;
        this.Primer_Apellido = Primer_Apellido;
        this.Ciudad_Residencia = Ciudad_Residencia;
    }
    
    public Integer getId_Lider() {
        return Id_Lider;
    }

    public void setId_Lider(Integer id_Lider) {
        Id_Lider = id_Lider;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getPrimer_Apellido() {
        return Primer_Apellido;
    }

    public void setPrimer_Apellido(String primer_Apellido) {
        Primer_Apellido = primer_Apellido;
    }

    public String getCiudad_Residencia() {
        return Ciudad_Residencia;
    }

    public void setCiudad_Residencia(String ciudad_Residencia) {
        Ciudad_Residencia = ciudad_Residencia;
    }

    public Consulta1Vo(){
    }

    
   

}
    
