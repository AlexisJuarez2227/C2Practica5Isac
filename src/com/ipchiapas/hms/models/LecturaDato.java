package com.ipchiapas.hms.models;

import java.util.Scanner;

public class LecturaDato {
    private int h,m,s;
    Scanner entrada = new Scanner(System.in);
    Control verificar=new Control();
    public void lecturaDatos(){
        do {
            System.out.println("Ingrese la hora");
            h = entrada.nextInt();
        }while (!verificar.verificacionHora(h));
        do {
            System.out.println("Ingrese los minutos");
            m = entrada.nextInt();
        }while (!verificar.verificacionMinutos(m));
        do {
            System.out.println("Ingrese los seguntos");
            s = entrada.nextInt();
        }while (!verificar.verificacionSegundos(s));
        verificar.imprime.impresionHora(h,m,s);
    }
}
