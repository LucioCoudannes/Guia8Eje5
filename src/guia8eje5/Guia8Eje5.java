/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8eje5;

import Entidades.Pais;
import Servicios.PaisService;
import java.util.HashSet;

/**
 *
 * @author A288808
 */
public class Guia8Eje5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        HashSet<Pais> p = new HashSet();
        PaisService ps = new PaisService();
        
        ps.listaPais(p);
        
        ps.mostrarLista(p);
        
        ps.ordenaAlfa(p);
           
        ps.eliminarPais(p);
        
        ps.mostrarLista(p);
        
        
        
    }
    
}
