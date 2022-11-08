import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa nombre del estudiante");
        String nombre= entrada.nextLine();
        System.out.println("Digita la nota del primer examen");
        double Nota1= (entrada.nextDouble()*0.25);
        System.out.println("Digita la nota del segundo examen");
        double Nota2= entrada.nextDouble()*0.25;
        System.out.println("Digita la nota del tercer examen");
        double Nota3= entrada.nextDouble()*0.5;
        Double promedio= Nota1+Nota2+Nota3;
        System.out.printf("La nota definitiva para %s es %f",
                nombre,promedio);
    }
}
