
package com.mycompany.Modelo.Vo;

public class Consulta3Vo {
	
  private Integer ID_Compra;
    private String Constructora;
    private String Banco_Vinculado;
    
    public Consulta3Vo() {
    }

    public Consulta3Vo(Integer ID_Compra, String Constructora, String Banco_Vinculado) {
        this.ID_Compra = ID_Compra;
        this.Constructora = Constructora;
        this.Banco_Vinculado = Banco_Vinculado;
    }

    public Integer getID_Compra() {
        return ID_Compra;
    }

    public void setID_Compra(Integer iD_Compra) {
        ID_Compra = iD_Compra;
    }

    public String getConstructora() {
        return Constructora;
    }

    public void setConstructora(String constructora) {
        Constructora = constructora;
    }

    public String getBanco_Vinculado() {
        return Banco_Vinculado;
    }

    public void setBanco_Vinculado(String banco_Vinculado) {
        Banco_Vinculado = banco_Vinculado;
    }

}
