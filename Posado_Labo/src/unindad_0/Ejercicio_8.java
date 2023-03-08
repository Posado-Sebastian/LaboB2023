package unindad_0;

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese 2 palabras para comparar si son iguales o no");
        String palabra1 = entrada.nextLine();
        String palabra2 = entrada.nextLine();
        if(palabra1.equals(palabra2)){
            System.out.println("Las palabras son iguales");
        }else{
            System.out.println("Las palabras no son iguales");
        }
    }
}
