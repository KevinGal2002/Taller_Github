package Procesos;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import Cantantes_Artistas.Cantantes_Artistas;
import Cantantes_Artistas.Hip_Hop.Rap_Underground;
import Cantantes_Artistas.Hip_Hop.Trap;
import Cantantes_Artistas.Reggeton.Alternativo;
import Cantantes_Artistas.Reggeton.Clasico;
import Cantantes_Artistas.Rock_Roll.Heavy_Metal.Black_Metal;
import Cantantes_Artistas.Rock_Roll.Heavy_Metal.Death_Metal;
import Cantantes_Artistas.Rock_Roll.Heavy_Metal.Thrash_Metal;
import Cantantes_Artistas.Rock_Roll.Rock_Alternativo.Briptop;

import java.util.Scanner;

public class Procesos {
    /*Creacion de la variable para leer datos*/
    static Scanner entrada = new Scanner(System.in);
    //funcion para pedir el numero de objetios a crear
    public static int numero_datos(){
        int numero;
        do {
            System.out.println("\nIngresa el numero de Cantantes a Crear >> ");
            numero=entrada.nextInt();
            if (numero<1){
                System.out.println("     >> Error. Intenta Denuevo <<");
            }
        }while (numero<1);
        return numero;
    }
    //funcion para pedir el nombre
    public static String name(){
        String name;
        entrada.nextLine();
        System.out.println("Ingresa el nombre del Artista >> ");
        name=entrada.nextLine();
        return name;
    }
    //funcion para pedir la edad
    public static int edad(){
        String edad;
        int edad2=0;
        boolean com;
        do {
            System.out.println("Ingresa la edad del Artista >> ");
            edad=entrada.next();
            com=comprobar(edad);
            if (com==false){
                System.out.println("     >> Error. Intenta Denuevo <<");
            }else {
                edad2=Integer.parseInt(edad);
            }
        }while (com==false || edad2<1 );
        return edad2;
    }
    //funcion para pedir el pais
    public static String Pais(){
        String name;
        entrada.nextLine();
        System.out.println("Ingresa el Pais del Artista >> ");
        name=entrada.nextLine();
        return name;
    }
    //funcion del menu general para seleccionar los distintios tipos de genero del cantante
    public static int menuGeneral(){
        String op;
        int op2;
        boolean comprobacion;
        do {
            System.out.print(
                    "---------"+
                            " >> REGGETON <<"+
                            "---------"
                            +"\n1.-Reggeton"
                            +"\n2.-Hip Hop"
                            +"\n3.-Rock and Roll"
                            +"\nSeleccione >> "
            );
            op = entrada.next();
            comprobacion=comprobar(op);
            if(comprobacion){
                op2= Integer.parseInt(op);
            }else {
                System.out.println("  >> Error. Intenta Denuevo<< ");
                op2=-1;
            }
        }while (op2<1 || op2>3);
        return op2;
    }
    //funcion del menu general para seleccionar los distintios tipos de subgenero del cantante
    public static int menuReggeton(){
        String op;
        int op2;
        boolean comprobacion;
        do {
            System.out.print(
                    "---------"+
                            " >> REGGETON <<"+
                            "---------"
                            +"\n1.-Alterno"
                            +"\n2.-Clasico"
                            +"\nSeleccione >> "
            );
            op = entrada.next();
            comprobacion=comprobar(op);
            if(comprobacion){
                op2= Integer.parseInt(op);
            }else {
                System.out.println("  >> Error. Intenta Denuevo<< ");
                op2=-1;
            }
        }while (op2<1 || op2>2);
        return op2;
    }
    //funcion del menu general para seleccionar los distintios tipos de subgenero del cantante
    public static int menuHipHop(){
        String op;
        int op2;
        boolean comprobacion;
        do {
            System.out.print(
                    "---------"+
                            " >> HIP HOP <<"+
                            "---------"
                            +"\n1.-Trap"
                            +"\n2.-Rap Underground"
                            +"\nSeleccione >> "
            );
            op = entrada.next();
            comprobacion=comprobar(op);
            if(comprobacion){
                op2= Integer.parseInt(op);
            }else {
                System.out.println("  >> Error. Intenta Denuevo<< ");
                op2=-1;
            }
        }while (op2<1 || op2>2);
        return op2;
    }
    //funcion del menu general para seleccionar los distintios tipos de subgenero del cantante
    public static int menuRock(){
        String op;
        int op2;
        boolean comprobacion;
        do {
            System.out.print(
                    "---------"+
                            " >> ROCK AND ROLL <<"+
                            "---------"
                            +"\n1.-Rock Alternativo"
                            +"\n2.-Heavy Metal"
                            +"\nSeleccione >> "
            );
            op = entrada.next();
            comprobacion=comprobar(op);
            if(comprobacion){
                op2= Integer.parseInt(op);
            }else {
                System.out.println("  >> Error. Intenta Denuevo<< ");
                op2=-1;
            }
        }while (op2<1 || op2>2);
        return op2;
    }
    //funcion del menu general para seleccionar los distintios tipos de subgenero del cantante
    public static int menuAlternativo(){
        String op;
        int op2;
        boolean comprobacion;
        do {
            System.out.print(
                    "---------"+
                            " >> ROCK ALTERNATIVO <<"+
                            "---------"
                            +"\n1.-Briptop"
                            +"\n2.-College Rock"
                            +"\n3.-Dream Pop"
                            +"\nSeleccione >> "
            );
            op = entrada.next();
            comprobacion=comprobar(op);
            if(comprobacion){
                op2= Integer.parseInt(op);
            }else {
                System.out.println("  >> Error. Intenta Denuevo<< ");
                op2=-1;
            }
        }while (op2<1 || op2>3);
        return op2;
    }
    //funcion del menu general para seleccionar los distintios tipos de subgenero del cantante
    public static int menuAHeavy(){
        String op;
        int op2;
        boolean comprobacion;
        do {
            System.out.print(
                    "---------"+
                            " >> HEAVY METAL <<"+
                            "---------"
                            +"\n1.-Thrash Metal"
                            +"\n2.-Death Metal"
                            +"\n3.-Black Metal"
                            +"\nSeleccione >> "
            );
            op = entrada.next();
            comprobacion=comprobar(op);
            if(comprobacion){
                op2= Integer.parseInt(op);
            }else {
                System.out.println("  >> Error. Intenta Denuevo<< ");
                op2=-1;
            }
        }while (op2<1 || op2>3);
        return op2;
    }
    //funcion para comprobar si se a ingresado un numero entero y no un string en cada uno de los menus anteriores
    private static boolean comprobar(String a){
        int num;
        try{
            num=Integer.parseInt(a);
            return true;
        }
        catch (Exception e )
        {
            return false;
        }
    }
    //funcion para crear un array de los cantantes e ir pidiendo todos los datos necesarios para crear los objetos
    //y luego devolver al main el array con toods los objetos ya creados
    public static ArrayList<Cantantes_Artistas> miembros(int numero){
        ArrayList <Cantantes_Artistas> cantantes = new ArrayList<>();
        for (int i=0;i<numero;i++){
            System.out.println("    >>>>>>  CANTANTE "+(i+1)+" <<<<<<<");
            switch (menuGeneral()){
                case 1:
                {
                    switch (menuReggeton()){
                        case 1:
                        {
                            Alternativo alternativo = new Alternativo(name(),edad(),Pais(),"Reggeton","Alterno");
                            cantantes.add(alternativo);
                            break;
                        }
                        case 2:
                        {
                            Clasico alternativo = new Clasico(name(),edad(),Pais(),"Reggeton","Clasico");
                            cantantes.add(alternativo);
                            break;
                        }
                    }
                    break;
                }
                case 2:
                {
                    switch (menuHipHop()){
                        case 1:
                        {
                            Rap_Underground alternativo = new Rap_Underground(name(),edad(),Pais(),"Hip Hop","Rap Underground");
                            cantantes.add(alternativo);
                            break;
                        }
                        case 2:
                        {
                            Trap alternativo = new Trap(name(),edad(),Pais(),"Hip Hop","Trap");
                            cantantes.add(alternativo);
                            break;
                        }
                    }
                    break;
                }
                case 3:
                {
                    switch (menuRock()){
                        case 1:
                        {
                           switch (menuAlternativo()){
                               case 1:
                               {
                                   Briptop alternativo = new Briptop(name(),edad(),Pais(),"Rock and Roll","Rock Alternativo","Briptop");
                                   cantantes.add(alternativo);
                                   break;
                               }
                               case 2:
                               {
                                   Briptop alternativo = new Briptop(name(),edad(),Pais(),"Rock and Roll","Rock Alternativo","College Rock");
                                   cantantes.add(alternativo);
                                   break;
                               }
                               case 3:
                               {
                                   Briptop alternativo = new Briptop(name(),edad(),Pais(),"Rock and Roll","Rock Alternativo","Dream Pop");
                                   cantantes.add(alternativo);
                                   break;
                               }
                           }
                        }
                        case 2:
                        {
                            switch (menuAHeavy()){
                                case 1:
                                {
                                    Black_Metal alternativo = new Black_Metal(name(),edad(),Pais(),"Rock and Roll","Heavy Metal","Thrash Metal");
                                    cantantes.add(alternativo);
                                    break;
                                }
                                case 2:
                                {
                                    Death_Metal alternativo = new Death_Metal(name(),edad(),Pais(),"Rock and Roll","Heavy Metal","Death Metal");
                                    cantantes.add(alternativo);
                                    break;
                                }
                                case 3:
                                {
                                    Thrash_Metal alternativo = new Thrash_Metal(name(),edad(),Pais(),"Rock and Roll","Heavy Metal","Black Metal");
                                    cantantes.add(alternativo);
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    break;
                }
            }
        }
        return cantantes;
    }
    //funcion para mostrar todos los objetos creadas y almacenados en la array
    public static void mostrar(ArrayList<Cantantes_Artistas> cantantes){
        int i=0;
        for (Cantantes_Artistas cants: cantantes){
            System.out.println("    >>>>>>  CANTANTE "+(i+1)+" <<<<<<<");
            System.out.println(cants.toString());
            i++;
        }
    }
    //funcion para guardar en el archivo txt todos los objetos creadas y almacenados en la array
    public static void guardar(ArrayList<Cantantes_Artistas> cantantes){

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\jimen\\Desktop\\TERCER SEMESTRE\\POO\\TAREAS\\PROGRAMAS\\Cantantes_Artistas\\Cantantes.txt"))){
            for (Cantantes_Artistas cants: cantantes){
                bw.write(cants.toString());
            }
            System.out.println("Escritura Correcta");
        }catch (IOException e){
            System.out.println("Error en el direccionamiento");
        }
    }
}
