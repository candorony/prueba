/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prypruebaaraylist;

import java.util.Scanner;

/**
 *
 * @author Rony
 */
public class PryPruebaAraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner (System.in);
        int op;
        int cd = 0;
        String tipo = null;
        String nombre = null;
        float presio = 0;
        do{
        System.out.println("1.añadir");
        System.out.println("2.modificar");
        System.out.println("3.eliminar");
        System.out.println("4.buscar");
        System.out.println("5.imprimir");
        op=sc.nextInt();
         tipsProductos bdd=new tipsProductos();
        switch(op){
            case 1:{
                
                System.out.println("INGRESE CODIGO");
                cd=sc.nextInt();
                System.out.println("INGRESE MONBRE");
                nombre=sc.next();
                System.out.println("Elija tipo de producto TIPO");
                System.out.println("1.lacteo");
                System.out.println("2.serial");
                System.out.println("3.verduras");
                op=sc.nextInt();
                
                switch(op){
                    case 1:{
                        tipo="lacteo";
                    }break;
                     case 2:{
                        tipo="seria";
                    }break;
                     case 3:{
                        tipo="verduras";
                    }break;
                    
      
                }
               
                
    
      System.out.println("INGRESE PRESIO");
                presio=sc.nextFloat();
              
                 metodos a3=new metodos(cd, nombre, tipo, presio);
                  bdd.agregarRegistro(a3);
                  bdd.imprimirEmpleado();
        
            }break;
            
            case 2:{
                System.out.println("INGRESE EL CODIGO A ELIMINAR");
                cd=sc.nextInt();
                  metodos a3=new metodos(cd, nombre, tipo, presio);
                  bdd.agregarRegistro(a3);
                  
                  bdd.imprimirEmpleado();
                  
                bdd.buscaCodigo(cd);
                 bdd.imprimirEmpleado();
                
            }break;
            
            case 3:{
                
            }break;
            
            case 4:{
                
            }break;
             
        }
        }while(op!=5);
        
    }
    
}
