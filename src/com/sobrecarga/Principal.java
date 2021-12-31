package com.sobrecarga;

public class Principal {
    public static void main(String[] args) {
        // executa cálculo de área de quadrilateros
        double lado = 10.0;
        double lado1 = 10.0;
        double lado2 = 3.5;
        double altura = 5;

        // área do quadrado
        Quadrilatero.area(lado);
        Quadrilatero.area(lado1,lado2);
        Quadrilatero.area(lado1,lado2,altura);



    }
}
