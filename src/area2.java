import java.util.Scanner;

public class area2 {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);

        System.out.println("Digita la base del rectángulo");
        int base= entrada.nextInt();
        System.out.println("Digita la altura del rectángulo");
        int altura= entrada.nextInt();
        int area=base*altura;
        System.out.println("El área del rectángulo es: " +area);
    }
}
