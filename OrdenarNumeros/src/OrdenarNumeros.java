import java.util.Arrays;
import java.util.Scanner;

public class OrdenarNumeros {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese número: ");
        int num1 = leer.nextInt();

        System.out.print("Ingrese número: ");
        int num2 = leer.nextInt();

        System.out.print("Ingrese número: ");
        int num3 = leer.nextInt();

        System.out.print("Ingrese número: ");
        int num4 = leer.nextInt();

        int[] numeros = {num1, num2, num3, num4};
        //los ordena en forma asendente
        Arrays.sort(numeros);

        System.out.println(numeros[0] + " " + numeros[1] + " " + numeros[2] + " " + numeros[3]);
        leer.close();
    }
}
