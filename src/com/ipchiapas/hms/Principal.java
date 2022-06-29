package com.ipchiapas.hms;

import com.ipchiapas.hms.models.LecturaDato;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        String opcion;
        do {
            LecturaDato leer = new LecturaDato();
            leer.lecturaDatos();
            System.out.println("Desea ingresar otra hora?");
            opcion=entrada.next();
        }while (opcion.equals("si")|| opcion.equals("Si"));
    }
}
