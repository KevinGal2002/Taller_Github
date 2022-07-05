package Cantantes_Artistas.Rock_Roll.Rock_Alternativo;

import Cantantes_Artistas.Rock_Roll.Heavy_Metal.Black_Metal;
//Extends a la clase balck metal ya que van a tener exactamente los mismo atributos
public class Briptop extends Black_Metal {
    //creacion del metodo constructor
    public Briptop(String name, int edad, String pais, String genero, String subgenero, String tiposubgeneroo) {
        super(name, edad, pais, genero, subgenero, tiposubgeneroo);
    }
}
