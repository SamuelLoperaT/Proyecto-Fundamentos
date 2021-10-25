package com.proyecto_fundamentos_1.Proyecto_fundamentos;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Log_in extends Sign_Up{
    Scanner s = new Scanner(System.in);
    private ArrayList<ArrayList<String>> accounts = new ArrayList<ArrayList<String>>();
    public Log_in(){
        this.accounts = users_passwords;
    }
    public void log_In(){
        System.out.println("Introduzca su usuario");
        String log_user = s.nextLine();
        System.out.println("Introduzca su contraseña");
        String log_password = s.nextLine();
        ArrayList<String> log_in = new ArrayList<String>(Arrays.asList(log_user,log_password));
        while(true){
            if(this.accounts.contains(log_in)){

            }else{
                System.out.println("Usuario o Contraseña incorrectos, favor intentar nuevamente" + "/n");
            }
        }

    }

 }

