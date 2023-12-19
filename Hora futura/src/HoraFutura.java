import java.util.Scanner;

public class HoraFutura {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        System.out.println("Hora calcularemos la hora en un futuro en formato 24 horas");
        System.out.println("Cual es la hora actual: ");
        int horaActual = leer.nextInt();

        System.out.println("cantidad de horas a futuro: ");
        int horas = leer.nextInt();

        int nuevaHora = (horaActual + horas) % 24;

        System.out.println("En " + horas + " horas, el reloj marcará las " + nuevaHora);
        
        leer.close();
    }
}

//Escriba un programa que pregunte al usuario la hora actual *t* del reloj y un número entero de horas *h*, que indique qué hora marcará el reloj dentro de *h* horas:

//`Hora actual: **3**
//Cantidad de horas: **5**
//En 5 horas, el reloj marcara las 8`

//`Hora actual: **11**
//Cantidad de horas: **43**
//En 43 horas, el reloj marcara las 6`