package com.ipchiapas.hms.models;

public class Impresion {
    public void impresionHora(int H, int M, int S){
        System.out.println("Hora ingresada: "+H+":"+M+":"+S);
    }
    public void errorHora(){
        System.out.println("La hora solo esta de 1 a 24 por favor vuelva a ingresar la hora");
    }
    public void errorMinuto(){
        System.out.println("Los minutos solo pueden ser de 0 a 59 por favor vuelva a ingresar los minutos");
    }
    public void errorSegundo(){
        System.out.println("Los seguntos solo pueden ser de 0 a 59 por favor vuelva a ingresar los segundos");
    }
}
