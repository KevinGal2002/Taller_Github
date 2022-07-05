package Cantantes_Artistas.Rock_Roll.Heavy_Metal;

import Cantantes_Artistas.Reggeton.Alternativo;
//Extends a la clase Alternativo ya que van a tener la mayria de atributos iguales
public class Black_Metal extends Alternativo {
    private String tiposubgeneroo;
    //creacion del metodo constructor
    public Black_Metal(String name, int edad, String pais, String genero, String subgenero, String tiposubgeneroo) {
        super(name, edad, pais, genero, subgenero);
        this.tiposubgeneroo = tiposubgeneroo;
    }
    //Creacion de ls Setter y getters
    public String getTiposubgeneroo() {
        return tiposubgeneroo;
    }

    public void setTiposubgeneroo(String tiposubgeneroo) {
        this.tiposubgeneroo = tiposubgeneroo;
    }
    //Metodo que nos permitira imprimir todos los datos almacenados en el objeto
    @Override
    public String toString() {
        return "Nombre >> "+getName()+"\nEdad >> "+getEdad()+"\nPais >> "+getPais()+"\nGenero Musical >> "+getGenero()
                +"\nSubgenero >> "+getSubgenero()+"\nTipo de Subgenero >> "+getTiposubgeneroo();
    }
}
