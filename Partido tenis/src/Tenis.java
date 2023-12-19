import java.util.Scanner;

public class Tenis {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Juegos ganados por A: ");
        int juegosA = leer.nextInt();

        System.out.print("Juegos ganados por B: ");
        int juegosB = leer.nextInt();

        if (juegosA < 0 || juegosB < 0 || Math.abs(juegosA - juegosB) > 2 || (juegosA > 7 || juegosB > 7) || (juegosA == 6 && juegosB == 6)) {
            System.out.println("Valores ilegales - Resultado invalido");
        } else if (juegosA == 6 && juegosB <= 4) {
            System.out.println("Gano A");
        } else if (juegosB == 6 && juegosA <= 4) {
            System.out.println("Gano B");
        } else if (juegosA == 7 && juegosB == 5) {
            System.out.println("Gano A");
        } else if (juegosB == 7 && juegosA == 5) {
            System.out.println("Gano B");
        } else {
            System.out.println("Aun no termina");
        }
        leer.close();
    }
}
