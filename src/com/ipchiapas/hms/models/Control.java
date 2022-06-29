package com.ipchiapas.hms.models;

public class Control {
    Impresion imprime = new Impresion();
    public boolean verificacion(int h, int opcion){
        boolean bandera=true;
        switch (opcion) {

            case 1:
                if (h<1||h>24) {
                    bandera = false;
                    imprime.errorHora();
                }
                    break;
            case 2:
                if (h<0||h>59) {
                    bandera = false;
                    imprime.errorMinuto();
                }
                break;
            case 3:
                if (h<0||h>59) {
                    bandera = false;
                    imprime.errorSegundo();
                }
                break;
        }
        return bandera;
    }
}

