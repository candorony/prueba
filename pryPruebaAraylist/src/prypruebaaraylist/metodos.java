/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prypruebaaraylist;

/**
 *
 * @author Rony
 */
public class metodos {
    
      private int codigo;
    private String nombre  ;
     private String  tipo;
      private float presio;

      public metodos(){}
    public metodos(int codigo, String nombre, String tipo, float presio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.presio = presio;
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPresio() {
        return presio;
    }

    public void setPresio(float presio) {
        this.presio = presio;
    }
    
    
    
    
    
    
}
