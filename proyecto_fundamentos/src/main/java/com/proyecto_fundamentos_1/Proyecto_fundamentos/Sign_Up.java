package com.proyecto_fundamentos_1.Proyecto_fundamentos;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;


public class Sign_Up {
    ArrayList<ArrayList<String>> users_passwords = new ArrayList<ArrayList<String>>();
    Scanner s = new Scanner(System.in);
    public Sign_Up(){
    }
    public void Create_Username_Password(){
        System.out.println("introduzca el usuario deseado: ");
        String user = s.nextLine();
        while(true){
            System.out.println("Introduzca la contraseña deseada: ");
            String password = s.nextLine();
            System.out.println("Confirme la contraseña: ");
            String verify = s.nextLine();
    
            if(verify.equals(password)){
                ArrayList<String> cuenta = new ArrayList<String>(Arrays.asList(user,password));
                users_passwords.add(cuenta);
                System.out.println("Cuenta creada Satisfactoriamente.");
                break;
            }else{
                System.out.println("Contraseñas no coinciden, por favor vuelva a introducirla");
            }
    
        }

    }
}
