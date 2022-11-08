import java.util.Scanner;

public class Ej3Edad {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        System.out.println("Digita nombre del empleado");
        String nombre = entrada.nextLine();
        System.out.println("Ingresa año de nacimiento");
        int fec= entrada.nextInt();
        int edad = 2022 - fec;
        System.out.printf ("%s tiene %d años",
                nombre, edad);


    }
}
