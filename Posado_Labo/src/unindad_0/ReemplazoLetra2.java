package unindad_0;

import java.util.Scanner;

public class ReemplazoLetra2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una letra para sustituir por la e en la frase");
        String letraString = entrada.nextLine();
        String frase = "Ayer me compré muñecos de la marca ‘Colchitas’ por internet";
        frase = frase.replaceAll("e",letraString);
        System.out.println(frase.replaceAll("é",letraString));
    }
}
