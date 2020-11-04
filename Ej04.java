package sesion04;

import java.util.Scanner;

public class Ej04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mete numero");
        int numero = sc.nextInt();
        switch (numero) {
            case 1:
                System.out.println("lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("jueves");
                break;
            case 5:
                System.out.println("viernes");
                break;
            case 6:
                System.out.println("sabado");
                break;
            default:
                System.out.println("domingo");
        }

    }
}

