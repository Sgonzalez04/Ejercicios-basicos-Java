import java.util.Scanner;

public class ComparaPalabras {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Palabra 1: ");
        String palabra1 = leer.nextLine();

        System.out.print("Palabra 2: ");
        String palabra2 = leer.nextLine();

        int diferencia = Math.abs(palabra1.length() - palabra2.length());

        if (palabra1.length() > palabra2.length()) {
            System.out.println("La palabra " + palabra1 + " tiene " + diferencia + " letras más que " + palabra2);
        } else if (palabra2.length() > palabra1.length()) {
            System.out.println("La palabra " + palabra2 + " tiene " + diferencia + " letras más que " + palabra1);
        } else {
            System.out.println("Las dos palabras tienen el mismo largo");
        }
    leer.close();
    }
}