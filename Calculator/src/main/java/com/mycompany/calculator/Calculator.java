package com.mycompany.calculator;
import javax.swing.JOptionPane;

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
public static void showInformation(){
    int numberUno,numberTwo,option = 0;
    do{
       try {
                 option = Integer.parseInt(JOptionPane.showInputDialog(
                        "Seleccione la operación:\n" +
                        "1. Sumar\n" +
                        "2. Restar\n" +
                        "3. Multiplicar\n" +
                        "4. Dividir\n" +
                        "5. Salir"));
                 switch (option){
               case 1:
                        numberUno=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
                        numberTwo= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));
                        JOptionPane.showMessageDialog(null, "La suma de " + numberUno + " + " + numberTwo + " = " + sum(numberUno, numberTwo));
                        break;
               case 2:
                        numberUno = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
                        numberTwo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));
                        JOptionPane.showMessageDialog(null, "La resta de " + numberUno + " - " + numberTwo + " = " + rest(numberUno, numberTwo));
                        break;
                    case 3:
                        numberUno = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
                        numberTwo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));
                        JOptionPane.showMessageDialog(null, "La multiplicación de " + numberUno + " * " + numberTwo + " = " + multiplication(numberUno, numberTwo));
                        break;
                    case 4:
                        numberUno = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
                        numberTwo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));
                        JOptionPane.showMessageDialog(null, "La división de " + numberUno + " / " + numberTwo + " = " + division(numberUno, numberTwo));
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Saliendo...");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción invalida digite una opcion valida", "Error", JOptionPane.ERROR_MESSAGE);
           }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } 
    } while (option !=5);
}
    public static void main(String[] args) {
        showInformation();
    }
}
