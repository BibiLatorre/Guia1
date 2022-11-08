import java.util.Scanner;

public class Km {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite el valor por Km");
        int Vr1= entrada.nextInt();
        System.out.println("Ingrese cantidad de Km a recorrer");
        int Km= entrada.nextInt();
        int cobro= Vr1*Km;
        System.out.println("El valor del tiquete es: " +cobro);

    }
}
