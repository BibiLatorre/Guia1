import java.util.Scanner;

public class Ej2DolaresPesos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa cantidad de pesos a convertir");
        int pesos= entrada.nextInt();
        int trm= 5040;
        int dolares = pesos/trm;

        System.out.printf("Puedes adquirir %d dolares.",
                dolares);
    }
}
