
import java.util.Scanner;

public class Viáticos {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa número de días del viaje");
        int dias= entrada.nextInt();
        System.out.println("Ingresa valor del hotel por día");
        int hotel = entrada.nextInt()*dias;
        System.out.println("Ingrea valor de la comida por día");
        int comida= entrada.nextInt()*dias;
        int gastos=100*dias;
        int cheque=(hotel+comida+gastos);
        System.out.printf("Viáticos por viaje a Monterey para %d días:\n Comida=%d \n Hotel=%d \n Otros Gastos= %d \n Valor Total= $ %d",
                dias, comida, hotel, gastos, cheque);



    }
}
