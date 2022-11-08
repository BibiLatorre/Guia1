import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int base=0;
        int altura=0;
        int area=0;
        System.out.println("Digita la base del rectángulo");
        base= entrada.nextInt();
        System.out.println("Digita la altura del rectángulo");
        altura= entrada.nextInt();
        area=base*altura;
        System.out.println("El área del rectángulo es: " +area);


    }
}
