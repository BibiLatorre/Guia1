import java.util.Scanner;

public class EjercicioPintura {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Escribe el nombre del cliente");
        String nombre= entrada.nextLine();

        System.out.println("Digita el valor de la mano de obra de pintura por metro cuadrado");
        int VrMetro= entrada.nextInt();


        System.out.println("Ingresa la cantidad de metros a pintar");
        int metros= entrada.nextInt();
        int cobro=metros*VrMetro;
        System.out.printf("El precio del proyecto para %s es: $ %d ",
                nombre,cobro );

    }
}
