import java.util.Scanner;

public class ParteDecimal {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        System.out.println("Escriba un numero para entreguar la parte decimal de un número real");
        System.out.println("Ingrese el numero: ");
        double numero = leer.nextDouble();

        double Decimal = numero - Math.floor(numero);
        //math.floor lo redondea hacia el mas cercano

        System.out.println("La parte decimal del número " + numero + " es: " + Decimal);
        
        leer.close();
    }
}

