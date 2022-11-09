/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparadores;

import Entidades.Pais;
import java.util.Comparator;

/**
 *
 * @author A288808
 */
public class OrdenAlfabetico {
    
      public static Comparator<Pais> ordenaAlfa = new Comparator<Pais>(){
          
        @Override
        public int compare(Pais A, Pais Z) {
            return A.getPais().compareTo(Z.getPais());
        }
    

        };
              
}
