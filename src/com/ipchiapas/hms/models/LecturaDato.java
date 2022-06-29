package com.ipchiapas.hms.models;

import java.util.Scanner;

public class LecturaDato {
    private int h,m,s;
    Scanner entrada = new Scanner(System.in);
    Control verificar=new Control();
    public void lecturaDatos(){
        do {
            System.out.println("Introduzca la hora");
            h = entrada.nextInt();
        }while (!verificar.verificacion(h,1));
        do {
            System.out.println("Introduzca los minutos");
            m = entrada.nextInt();
        }while (!verificar.verificacion(m, 2));
        do {
            System.out.println("Introduzca los seguntos");
            s = entrada.nextInt();
        }while (!verificar.verificacion(s, 3));
        verificar.imprime.impresionHora(h,m,s);
    }
}
