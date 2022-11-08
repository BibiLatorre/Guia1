import java.util.Scanner;

public class MetrosAgua {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int ValorMetro=50;
        System.out.println("Digite la cantidad de metros cúbicos de agua consumidos");
        int cantidad= entrada.nextInt();
        int precio= ValorMetro*cantidad;
        System.out.println("El valor a pagar por consumo de agua es: $"+precio);
    }
}
