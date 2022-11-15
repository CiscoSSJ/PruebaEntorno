import java.util.Scanner;



public class main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String cadena1, cadena2, cadenaCompleta;
        System.out.println("Introduce una cadena");
        cadena1 = input.nextLine();
        System.out.println("Introduce la otra cadena");
        cadena2 = input.nextLine();

        cadenaCompleta = concatenar(cadena1, cadena2);
        System.out.println(cadenaCompleta);
        // hola nena
    }

    private static String concatenar(String cadena1, String cadena2){
        String cadenaCompleta;
        cadenaCompleta = cadena1+cadena2;
        return cadenaCompleta;
    }
}
