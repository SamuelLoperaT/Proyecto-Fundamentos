package com.proyecto_fundamentos_1.Proyecto_fundamentos;
//confirmacion del paquete al que pertenece el archivo
import java.util.Scanner;
//importar Scanner

public class Main_Menu{
    //creacion de la variable correspondiente al Scanner
    static Scanner s = new Scanner(System.in);
    //creacion de la variable que elige la opcion del menu
    static int selector = 0;
    
    //constructor vacio
    public Main_Menu(){

    }
    //funcion que imprime el menu principal
    public static void PrintMenu(){
        System.out.println("Bienvenido a la Red Antisocial: Donde nadie disfruta y todo es dificil de manejar");
        System.out.println("1: Crear Cuenta");
        System.out.println("2: Iniciar Sesión");
        System.out.println("3: Acerca de:");
        System.out.println("4: Salir");
    }
    public static void Selection(){
        //funcion que permite elegir la opcion determinada, en base a la variable selector
        selector = s.nextInt();
        while(true){
            //ciclo infinito para permitir ejecucion continua
            switch(selector){
                case 1:
                break;
                case 2:
                break;
                case 3:
                System.out.print("la red antisocial:"+"\n\n"+"la red antisocial es el medio de comunicacion del futuro, mejor que facebook (y con menos robos de informacion), y con mas caracteres que twitter"+"\n"+"Con impresionantes caracteristicas como: "+"\n\n"+"1. minima interaccion social desde la terminal de comandos de tu preferencia."+"\n\n"+"2.Dificil y complejo acceso, para estar seguros de que solo personas decentes estan en esta plataforma."+"\n\n"+"3. Impresionantes 281 caracteres para cada publicacion."+"\n\n"+"4.imagenes (aun no disponible, WIP)"+"\n\n"+"desde el equipo de la red antisocial esperamos que sea la red 'social' perfecta para ti ;)"+"\n");
                break;
                case 4:
                break;
                default:
                    //opcion por defecto en caso de que se introduzca una opcion no soportada
                System.out.println("Opcion fuera de los parametros, por favor, elija nuevamente");
                break;
        }
    }

    }
}
