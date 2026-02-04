import java.util.Scanner;
public class Exercise2Nota{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu nota: ");
        double nota = scanner.nextDouble();
        if (nota <0 || nota > 10) {
            System.out.println("Error: La nota debe estar entre 0 y 10");
        }
        else if (nota <5) {
            System.out.println("Suspenso");
        }
        else if (nota <7) {
            System.out.println("Aprobado");
        }
        else if (nota <9) {
            System.out.println("Notable");
        }
        else {
            System.out.println("Sobresaliente");
        }
        scanner.close();
    }
}
