import java.util.Scanner;

public class TrianguloRectangulo {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digita la base del triángulo");
        int base= entrada.nextInt();
        System.out.println("Digita la altura del triángulo");
        int altura= entrada.nextInt();
        double Hipotenusa= Math.sqrt((base*base)+(altura*altura));
        System.out.println("La hipotenusa del triángulo es: " +Hipotenusa);
    }
}
