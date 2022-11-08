import java.util.Scanner;

public class DescuentoIva {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digita el valor del artícuo");
        int valor= entrada.nextInt();
        double descuento=valor*0.8;
        double iva=descuento*1.19;
        System.out.println("El valor con descuento es: $"+descuento);
        System.out.println("El valor a pagar incluyendo iva es: $"+ iva);

    }
}
