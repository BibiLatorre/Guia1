import java.util.Scanner;

public class Circuito {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Indica la corriente del circuito en Amperios");
        double corriente=entrada.nextDouble();
        double voltaje =corriente*4;
        double potencia=voltaje*corriente;
        System.out.println("La potencia del circuito es de: "+potencia +"W");
    }
}
