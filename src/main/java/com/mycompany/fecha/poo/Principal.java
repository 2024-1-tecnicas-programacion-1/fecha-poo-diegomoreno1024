package com.mycompany.fecha.poo;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
    Scanner leer= new Scanner(System.in);
    
    System.out.println("Ingrese el dia");
    int dia=leer.nextInt();
    System.out.println("Ingrese el mes");
    int mes=leer.nextInt();
    System.out.println("Ingrese el año");
    int anio=leer.nextInt();
    
    Fecha fechaIngresada = new Fecha(dia,mes,anio);
    if(fechaIngresada.validarFecha()==true){
        System.out.println(fechaIngresada.fechaLarga());
    }else{
        System.out.println("Fecha invalida");
    }
    }
}
