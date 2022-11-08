import java.util.Scanner;

public class Ahorro {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa tu salario mensual");
        int salario= entrada.nextInt();
        double ahorro =(salario*0.15)*4;
        double ahorroAño=ahorro*12;
        System.out.println("El ahorro total durante un año es de: $"+ahorroAño);
    }
}
