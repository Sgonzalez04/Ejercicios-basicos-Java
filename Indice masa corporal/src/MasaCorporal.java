import java.util.Scanner;

public class MasaCorporal {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese masa(kilos): ");
        double peso = leer.nextDouble();

        System.out.print("Ingrese estatura(metros): ");
        double altura = leer.nextDouble();

        System.out.print("Ingrese la edad: ");
        double edad = leer.nextDouble();
        
        double imc=peso/(altura*altura);
        String riesgo = "";

        if (imc < 22 && edad < 45) {
            riesgo="bajo";
        }if (imc < 22 && edad >= 45) {
            riesgo="medio";
        }if (imc >= 22 && edad < 45) {
            riesgo="medio";
        }if (imc >= 22 && edad >= 45) {
            riesgo="alto";
        }
        System.out.println("Su condicion de riesgo es: " + riesgo);
        leer.close();
    }
}
