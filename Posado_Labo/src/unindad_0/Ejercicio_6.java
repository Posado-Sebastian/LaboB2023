package unindad_0;

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = 0; //numeros q ingresa el usuario
        int n3 = 0; //contador de los numeros ingresados
        System.out.println("Ingrese numeros y -1 para dejar de hacerlo");
        while(n != -1){
            n = entrada.nextInt();
            n3++;
        }
        System.out.println("La cantidad de numeros ingresado es: " + (n3 - 1));
    }
}
