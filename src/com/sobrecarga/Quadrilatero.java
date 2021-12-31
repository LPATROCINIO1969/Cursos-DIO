package com.sobrecarga;

import java.text.NumberFormat;

public class Quadrilatero {
    public static void area(double lado){
        double area;
        area = lado*lado;
        System.out.printf("Quadrado de lado = %3.3f - Área =  %4.3f\n",lado,area);

    }

    public static void area(double lado1, double lado2){
        double area;
        area = lado1*lado2;
        System.out.printf("Retângulo - base = %3.3f - altura = %3.3f - Área =  %4.3f\n",lado1,lado2,area);

    }

    public static void area(double base1, double base2, double altura){
        double area;
        area = (base1 + base2)*altura/2.0;
        System.out.printf("Trapézio - base1 = %3.3f - base 2 = %3.3f - altura = %3.3f - Área =  %4.3f\n",base1,base2,altura,area);

    }

}
