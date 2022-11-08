import java.util.Scanner;

public class Llamada {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("¿Cuál es el valor por minuto de llamada?");
        int minuto= entrada.nextInt();
        System.out.println("Digite tiempo de la llamada en minutos");
        int tiempo= entrada.nextInt();
        int valor= minuto*tiempo;
        System.out.println("El valor de la llamada es: $"+valor);
    }
}
