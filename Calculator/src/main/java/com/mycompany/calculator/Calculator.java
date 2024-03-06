package com.mycompany.calculator;

public class Calculator {
public static int sum(int numberUno,int numberTwo){
    return numberUno + numberTwo;
}
public static int rest(int numberUno,int numberTwo){
    return numberUno - numberTwo;
}
public static int multiplication(int numberUno,int numberTwo){
    return numberUno * numberTwo;
}
public static float division(int numberUno,int numberTwo){
    if (numberTwo == 0) {
         throw new ArithmeticException(" No se puede dividir por cero ");
    }
    return (float)numberUno / numberTwo;
}
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
