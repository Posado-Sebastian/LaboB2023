import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList123 {
    public static void main(String[] args) {
        Scanner entradaN = new Scanner(System.in);
        Scanner entradaS = new Scanner(System.in);
        int n2;
        String palabra;
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        ArrayList<String> cadenas = new ArrayList<String>();
        ArrayList<Persona> personas = new ArrayList<Persona>();
        int suma=0;
        System.out.println("Ingrese un numero para determinar la cantidad de valores a ingresar");
        int n = Integer.parseInt(entradaN.nextLine());
        for(int i=0; i<n; i++){
            n = Integer.parseInt(entradaN.nextLine());
            numeros.add(n);
        }
        System.out.println("Ingrese un numero para determinar la cantidad de valores a ingresar");
        n = Integer.parseInt(entradaN.nextLine());
        for(int i=0; i<n; i++){
            palabra = entradaS.nextLine();
            cadenas.add(palabra);
        }
        System.out.println("Ingrese un numero para determinar la cantidad de valores a ingresar");
        n = Integer.parseInt(entradaN.nextLine());
        for(int i=0; i<n; i++){
            System.out.println("Ingrese la edad");
            n = Integer.parseInt(entradaN.nextLine());
            System.out.println("Ingrese la direccion");
            n2 = Integer.parseInt(entradaN.nextLine());
            System.out.println("Ingrese el nombre");
            palabra = entradaS.nextLine();
            personas.add(new Persona(n, n2, palabra));
        }
        for (Integer numero : numeros) {
            suma=suma+numero;
        }
        System.out.println(suma);
        for (String cadena : cadenas){
            if(cadena.toLowerCase().charAt(0)=='c'){
                System.out.println(cadena);
            }
        }
        for(Persona persona : personas){
            if(persona.getEdad()>30){
                System.out.println(persona.getNombre()+" tiene mas de 30 años");
            }
        }
    }
}
