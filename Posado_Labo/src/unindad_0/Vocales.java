package unindad_0;

public class Vocales {
    public static void main(String[] args) {
        String frase = "Ayer me compré muñecos de la marca ‘Colchitas’ por internet";
        frase = frase.toLowerCase();
        int n = 0; //contador
        int largo = frase.length(); //largo palabra
        for (int i = 0; i<largo; i++){
            if(frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u' || frase.charAt(i) == 'i'){
                n = n + 1;
            }
        }
        System.out.println("La cantidad de vocales en la frase es: " + n);
    }
}
