package Cantantes_Artistas.Hip_Hop;

import Cantantes_Artistas.Reggeton.Alternativo;
//Extends a la clase Alternativo ya que van a tener exactamente los atributos iguales
public class Trap extends Alternativo {
    //Creacion del metodo cnstructor
    public Trap(String name, int edad, String pais, String genero, String subgenero) {
        super(name, edad, pais, genero, subgenero);
    }
}
