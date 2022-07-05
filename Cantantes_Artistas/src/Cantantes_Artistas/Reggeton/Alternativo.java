package Cantantes_Artistas.Reggeton;

import Cantantes_Artistas.Cantantes_Artistas;
//Extends a la clase Cantantes ya que van a tener la mayria de atributos iguales
public class Alternativo extends Cantantes_Artistas {
    private String subgenero;

    //creacion del metodo constructor
    public Alternativo(String name, int edad, String pais, String genero, String subgenero) {
        super(name, edad, pais, genero);
        this.subgenero = subgenero;
    }

    public String getSubgenero() {
        return subgenero;
    }

    public void setSubgenero(String subgenero) {
        this.subgenero = subgenero;
    }
    //Metodo que nos permitira imprimir todos los datos almacenados en el objeto
    @Override
    public String toString() {
        return "Nombre >> "+getName()+"\nEdad >> "+getEdad()+"\nPais >> "+getPais()+"\nGenero Musical >> "+getGenero()
                +"\nSubgenero >> "+getSubgenero();
    }
}
