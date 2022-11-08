import java.util.Scanner;

//Un estacionamiento requiere determinar el cobro que debe aplicar a las personas que lo utilizan.
// Considere que el cobro es con base en las horas que lo disponen y que las fracciones de hora
// se toman como completas
public class Parqueadero {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese la hora de entrada");
        int Entrada= entrada.nextInt();
        System.out.println("Ingrese la hora de salida");
        int Salida= entrada.nextInt();
        System.out.println("Digite el valor de la hora o fracción");
        int hora= entrada.nextInt();
        int cobro= hora*(Salida-Entrada);
        System.out.println("El valor a pagar es: " +cobro);
    }
}
