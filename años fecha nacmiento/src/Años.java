import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Años {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese su fecha de nacimiento:");
        System.out.print("Día: ");
        int day = leer.nextInt();
        System.out.print("Mes: ");
        int month = leer.nextInt();
        System.out.print("Año: ");
        int year = leer.nextInt();

        // Obtener la fecha actual
        LocalDate Date = LocalDate.now();

        // Crear un objeto LocalDate con la fecha de nacimiento ingresada por el usuario
        LocalDate bithdate = LocalDate.of(year, month, day);

        // Calcular la edad
        Period periodo = Period.between(bithdate, Date);
        int age = periodo.getYears();

        // Verificar si el cumpleaños ya ocurrió este año
        LocalDate NextBirth = bithdate.withYear(Date.getYear());
        if (NextBirth.isAfter(Date) || NextBirth.isEqual(Date)) {
            age--; // Restar un año si el cumpleaños no ha pasado aún
        }

        System.out.println("Usted tiene " + age + " años");

        leer.close();
    }
}