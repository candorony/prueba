/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prypruebaaraylist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Rony
 */
public class tipsProductos {
     private ArrayList<Object> a = new ArrayList<Object>();
    
    public tipsProductos(){}
    
    public tipsProductos(ArrayList<Object> a){
        this.a = a;
    }
    
    public void agregarRegistro(metodos p){
        this.a.add(p);
    }

    public void modificarRegistro(int i,metodos p){
        this.a.set(i, p);
    }
    
    public void eliminarRegistro(int i){
        this.a.remove(i);
    }
    
    public metodos obtenerRegistro(int i){
        return (metodos)a.get(i);
    }
    
    public int cantidadRegistro(){
        return this.a.size();
    }
    
    public int buscaCodigo(int hora){
        for(int i = 0; i < cantidadRegistro(); i++){
            if(hora == obtenerRegistro(i).getCodigo())return i;
        }
        return -1;
    }
    public void imprimirEmpleado(){
       
      Iterator miIterator=a.iterator();/// descampone la lista empleados para pasar uno a Uno
      while(miIterator.hasNext()){
         metodos elemento=(metodos)miIterator.next();
          System.out.println("CODIGO ES  "+elemento.getCodigo());
          System.out.println("NOMNBRE ES  "+elemento.getNombre());
          System.out.println("TIPOS ES: "+elemento.getTipo());
          System.out.println("PRESIO ES :"+elemento.getPresio());
      }
   }
/*     private final   ArrayList<metodos>listaEmpleado=new ArrayList<>();
   
   public void InsertarEmpleado(metodos a1){
       listaEmpleado.add(a1);/// a1 objeto como tal
   }
   
   public void imprimirEmpleado(){
       
      Iterator miIterator=listaEmpleado.iterator();/// descampone la lista empleados para pasar uno a Uno
      while(miIterator.hasNext()){
         metodos elemento=(metodos)miIterator.next();
          System.out.println("CODIGO ES  "+elemento.getCodigo());
          System.out.println("NOMNBRE ES  "+elemento.getNombre());
          System.out.println("TIPOS ES: "+elemento.getTipo());
          System.out.println("PRESIO ES :"+elemento.getPresio());
      }
   }
   
   public void eliminarEmpleado(metodos a2){//a2 es objeto
       
       listaEmpleado.remove(a2);
       
   }
   
   public void buscar(int cedula){
       
       boolean op=false;
        Iterator miIterator=listaEmpleado.iterator();/// descampone la lista empleados para pasar uno a Uno
      while(miIterator.hasNext()){
         metodos elemento=(metodos)miIterator.next();
         if(elemento.equals(cedula)){
             System.out.println("1.Nombre :"+elemento.getNombre());
             op=true;
             
         }
         if(op=false)
         {
             System.out.println("nO SE ECONTRO EMPLEADO A BUSCAR ");
         }
      }
       
   }
   
   public void modificar(int codigo , String dato ,String Cedula ){
 
        Iterator miIterator=listaEmpleado.iterator();/// descampone la lista empleados para pasar uno a Uno
      while(miIterator.hasNext()){
         metodos elemento=(metodos)miIterator.next();
         if(elemento.equals(Cedula)){
             System.out.println("1.Nombre :"+elemento.getNombre());
             
            switch(codigo){
                case 1:
                {
                    elemento.setNombre(dato);
                }break;
                case 2:
                {
                    elemento.setTipo(null);
                }
                case 3:
                {
                    elemento.setPresio(Float.parseFloat(dato));
                }
            } 
         }
       
      }
   }
    
    */
    
}
