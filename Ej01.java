package sesion04;

import java.util.Scanner;

public class Ej01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Introduzca Edad: ");
        int edad = sc.nextInt();
        if (edad >=18){

            System.out.println(" Es mayor de edad, es posible. Cambiamos aqu� tambi�n");
        }else{

            System.out.println(" Es menor de edad, en efecto. cambiamos de nuevo. De nuevo cambiamos");
    

        }
    }
}
