package unindad_0;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = 0; //numeros q ingresa el usuario
        int n3 = 0; //contador de los numeros ingresados
        int nMayor=0; //mayor numero ingresado
        int nMenor=0; //menor numero ingresado
        int sumaTotal=0;
        int sumaPositiva=0; //suma de todos los numeros positivos
        int sumaNegativa=0; //suma de todos los numeros negativos
        System.out.println("Ingrese numeros y -1 para dejar de hacerlo");
        while(n != -1){
            n = entrada.nextInt();
            n3++;
            if(n > nMayor){
                nMayor = n;
            }
            if(n < nMenor){
                nMenor = n;
            }
            sumaTotal = sumaTotal + n;
            if(n > 0){
                sumaPositiva = sumaPositiva + n;
            }else{
                sumaNegativa = sumaNegativa - n;
            }

        }
        System.out.println("La cantidad de numeros ingresado es: " + (n3 - 1) + " Menor numer " + nMenor + " Mayor numero " + nMayor + " suma positiva " + sumaPositiva + " suma negativa " + (sumaNegativa+1) + " suma total " + (sumaTotal+1));
    }
}
