package com.ipchiapas.hms.models;

public class Control {
    Impresion imprime = new Impresion();
    public boolean verificacionHora(int H){
        boolean bandera=true;
        if (H<1||H>24) {
            imprime.errorHora();
            bandera=false;
        }
        else System.out.println("Hora corecta");
        return bandera;
    }
    public boolean verificacionMinutos(int M){
        boolean bandera=true;
        if (M<0||M>59) {
            imprime.errorMinuto();
            bandera=false;
        }
        else System.out.println("Minuto corecto");
        return bandera;
    }
    public boolean verificacionSegundos(int S){
        boolean bandera=true;
        if (S<0||S>59) {
            imprime.errorSegundo();
            bandera=false;
        }
        else System.out.println("segunto corecto");
        return bandera;
    }
}
