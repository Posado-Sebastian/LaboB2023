package unindad_0;

import java.util.Scanner;

public class ReemplazoLetra {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una letra para sustituir por la e en la frase");
        String letraString = entrada.nextLine();
        String frase = "Ayer me compré muñecos de la marca ‘Colchitas’ por internet";
        String frase2 = " "; //frase sin e
        int n = 0; //contador
        int largo = frase.length(); //largo palabra

        for (int i = 0; i<largo; i++){
            if(frase.toLowerCase().charAt(i) == 'e'){
                frase2 = frase2 + letraString;
            }else {
                frase2 = frase2 + frase.charAt(i);
            }
        }
        System.out.println(frase2);
    }
}
