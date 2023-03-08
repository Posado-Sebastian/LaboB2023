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
            case "sabado":
                System.out.println("No es un dia laboral");
                break;
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Es un dia laboral");
                break;
            default:
                System.out.println("La palabra ingresada no es un dia de la semana");
                break;
        }
    }
}
