import java.util.Scanner;

public class NotaNecesaria {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese nota examen 1: ");
        double notaC1 = leer.nextDouble();
        System.out.print("Ingrese nota examen 2: ");
        double notaC2 = leer.nextDouble();
        System.out.print("Ingrese nota laboratorio: ");
        double notaLaboratorio = leer.nextDouble();

        // Calcular la nota que necesita el alumno en el tercer examen con un minimo de 70
        double notaNecesaria = 60 - (0.66 * (notaC1 + notaC2)) - notaLaboratorio;

        // Mostrar la nota que necesita el alumno
        System.out.println("Necesita nota " + notaNecesaria + " en el examen 3");

        leer.close();
    }
}