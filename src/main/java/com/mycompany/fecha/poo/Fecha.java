package com.mycompany.fecha.poo;

import java.util.HashMap;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    
    //Este constructor tiene una complejidad constante, O(1).
    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    //La complejidad de este método es constante, O(1).
    public String fechaCorta(){
        return dia+"/"+mes+"/"+anio;
    }
    //La complejidad de este método es constante, O(1).
    public boolean validarFecha(){
        if((this.anio%4==0 && this.anio%100!=0)||(this.anio%400==0)){
            if(this.mes==2&&(this.mes>=1&&this.mes<=12)){
                if(this.dia>=1&&this.dia<=29){
                    return true;
                }else{
                    return false;
                }
            }else if((this.mes==4||this.mes==6||this.mes==9||this.mes==11)&&(this.mes>=1&&this.mes<=12)){
                if(this.dia>=1&&this.dia<=30){
                    return true;
                }else{
                    return false;
                }
            }else if((this.mes==1||this.mes==3||this.mes==5||this.mes==7||this.mes==8||this.mes==10||this.mes==12)&&(this.mes>=1&&this.mes<=12)){
                if(this.dia>=1&&this.dia<=31){
                    return true;
                }else{
                    return false;
                }
            }
        }else if((this.mes==4||this.mes==6||this.mes==9||this.mes==11)&&(this.mes>=1&&this.mes<=12)){
                if(this.dia>=1&&this.dia<=30){
                    return true;
                }else{
                    return false;
                }
        }else if((this.mes==1||this.mes==3||this.mes==5||this.mes==7||this.mes==8||this.mes==10||this.mes==12)&&(this.mes>=1&&this.mes<=12)){
            if(this.dia>=1&&this.dia<=31){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
    //La complejidad de este método es constante, O(1).
    public String mesLetra(){
        HashMap<String, String> meses = new HashMap<>();
        
        meses.put("1","Enero");
        meses.put("2","Febrero");
        meses.put("3","Marzo");
        meses.put("4","Abril");
        meses.put("5","Mayo");
        meses.put("6","Junio");
        meses.put("7","Julio");
        meses.put("8","Agosto");
        meses.put("9","Septiembre");
        meses.put("10","Octubre");
        meses.put("11","Noviembre");
        meses.put("12","Diciembre");
        
        String mesToString = String.valueOf(this.mes);
        return meses.get(mesToString);
    }
    //La complejidad de este método es constante, O(1).
    public String fechaLarga(){
        String mesString= mesLetra();
        return this.dia+" de "+ mesString+" de "+this.anio;
    }
}
