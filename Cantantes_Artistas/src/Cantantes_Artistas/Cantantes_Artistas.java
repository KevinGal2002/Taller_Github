package Cantantes_Artistas;
//Clase Superior, la cual herenciara a todas las demas clases
public class Cantantes_Artistas {
    private String name;
    private int edad;
    private String pais;
    private String genero;
    //Creacion del metodo constrcutor
    public Cantantes_Artistas(String name, int edad, String pais, String genero) {
        this.name = name;
        this.edad = edad;
        this.pais = pais;
        this.genero = genero;
    }
    //Creacion del setters y getters de cada atributo
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    //Metodo que nos permitira imprimir todos los datos almacenados en el objeto
    @Override
    public String toString() {
        return "Nombre >> "+getName()+"\nEdad >> "+getEdad()+"\nPais >> "+getPais()+"\nGenero Musical >> "+getGenero();
    }
}
