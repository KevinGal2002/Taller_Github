import Cantantes_Artistas.Cantantes_Artistas;
import Procesos.Procesos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Creacion de un objeto para llecar a cabo todos los procesos
        Procesos procesos = new Procesos();
        //Creacion del array que contenera tdos nuestros objetos
        ArrayList<Cantantes_Artistas> cantantes;
        //Invocando a la funcion para llenar el arrya
        cantantes=procesos.miembros(procesos.numero_datos());
        //Invoncando a la funcion para mstrar los objetos
        procesos.mostrar(cantantes);
        //Invoncando a la funcion para guardar los objetos en el archivo txt
        procesos.guardar(cantantes);
    }
}
