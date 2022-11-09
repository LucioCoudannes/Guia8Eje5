/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pais;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import Comparadores.OrdenAlfabetico;
import static Comparadores.OrdenAlfabetico.ordenaAlfa;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author A288808
 */
public class PaisService {

    Scanner leer = new Scanner(System.in);
    
    
    

    public Pais crearPaises() {

        Pais p = new Pais();
        System.out.println("Ingrese un pais");
        p.setPais(leer.next());

        return p;
    }
    
    public void listaPais(HashSet<Pais> p){
        
        String op="";
        
        do {
            
            p.add(crearPaises());
            System.out.println("Desea agregar otro pais S/N");
            op=leer.next();
            
        } while (op.equalsIgnoreCase("s"));
    }
    
    public void mostrarLista(HashSet<Pais> p){
        
        System.out.println("Lista de Paises");
        
        for (Pais paises : p) {
            
            System.out.println(paises.toString());
            
        }
 
    }
    
    public void ordenaAlfa(HashSet<Pais> p){
        
        ArrayList<Pais> list = new ArrayList();
        
        for (Pais pais : p) {
            
            list.add(pais);
            
        }
        
        System.out.println("Paises ordenados alfabeticamente");
        Collections.sort(list, ordenaAlfa);
        
        for (Pais pais : list) {
            
            System.out.println(pais.toString());
        }
       
                
    }
    
    public Boolean buscarPais(HashSet<Pais> p){
        
        boolean aux = false;
        String paisb;
        Iterator<Pais> it = p.iterator();
        
        System.out.println("Ingrese el pais a buscar");
        paisb=leer.next();
        
        
        while(it.hasNext()){
            
           if(it.next().getPais().equalsIgnoreCase(paisb)){
               it.remove();
               aux=true;            
               
           } 
            
        }
        
        return aux;
    }
    
    public void eliminarPais(HashSet<Pais> p){
        
        if(buscarPais(p)){
            
            System.out.println("Se encontro el pais");
            
                   
            
        }else {
            
            System.out.println("No se encontro el pais en la lista");
        }
        
    }

}
