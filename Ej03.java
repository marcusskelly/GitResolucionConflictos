package sesion04;

import java.util.Scanner;

public class Ej03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuanto gana");
        int sueldo = sc.nextInt();
        if (sueldo > 9000) {
            System.out.println("Debe paga impuestos");
        }else{
            System.out.println("no paga");
        }
    }
}

