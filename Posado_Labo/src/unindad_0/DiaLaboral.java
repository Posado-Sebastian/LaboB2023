package unindad_0;

import java.util.Scanner;

public class DiaLaboral {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String dia;
        System.out.println("Ingrese un dia de la semana");
        dia = entrada.nextLine();
        switch (dia.toLowerCase()){
            case "domingo":
                System.out.println("No es un dia laboral");
                break;
            case "sabado":
                System.out.println("No es un dia laboral");
                break;
            case "lunes":
                System.out.println("Es un dia laboral");
                break;
            case "martes":
                System.out.println("Es un dia laboral");
                break;
            case "miercoles":
                System.out.println("Es un dia laboral");
                break;
            case "jueves":
                System.out.println("Es un dia laboral");
                break;
            case "viernes":
                System.out.println("Es un dia laboral");
                break;
            default:
                System.out.println("La palabra ingresada no es un dia de la semana");
                break;
        }
    }
}
