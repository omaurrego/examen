package com.company;

import javax.xml.transform.SourceLocator;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.function.DoubleFunction;

public class Main {

    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        int n,plato, hamburguesa, perros, salchipapas, chorizos, i, totalh, totalp,totals,totalc, totalcompra, propina;
        double descuento, totalpagar, totalpropina, totalpro;
        hamburguesa=0;
        perros=0;
        salchipapas=0;
        chorizos=0;
        System.out.println("Ingrese la cantidad de personas");
        n= inputData.nextInt();
        for (i=0; i<=n;i++);{
            System.out.println("Que plato desea comer?");
            System.out.print("1.Hamburguesa ");
            System.out.print("2.Perro ");
            System.out.print("3.Salchipapas ");
            System.out.print("4.Chorizos ");
            plato=inputData.nextInt();
            if (plato==1){
                    hamburguesa++;
            }
            else {
                if (plato==2){
                    perros++;
                }
                else {
                    if (plato==3){
                        salchipapas++;
                    }
                    else {
                        if (plato==4){
                            chorizos++;
                        }
                    }
                }
            }



        }

        totalh=hamburguesa*10000;
        totalp=perros*8000;
        totals=salchipapas*6000;
        totalc=chorizos*7000;
        totalcompra=totalc+totalh+totalp+totals;
        descuento=totalcompra*0.1;
        totalpagar= totalcompra-descuento;
        if(totalcompra>20000){
            System.out.println("se le realizó un descuento por compras superiores a 20000 pesos" );
            System.out.println("El total a pagar es: "+ totalpagar);

        }
        else{
            System.out.println("El total a pagar es: "+ totalcompra);
        }
        System.out.println("Desea incluir la propina? ");
        System.out.print("1.SI ");
        System.out.print("2.NO ");
        propina=inputData.nextInt();
        totalpro=totalcompra*0.1;
        totalpropina=totalcompra+totalpro;

        if (propina == 1) {
            System.out.println("El total a pagar es: " + totalpropina);
        }
        else{
            System.out.println("El total a pagar es: " + totalcompra);
        }


    }


    }

