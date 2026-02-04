import java.util.Scanner;
public class Exercise4Dia{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número del 1 al 7: ");
        int dia = scanner.nextInt();
        String resultado = switch (dia){
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "ERROR: Número no válido";
        };
        System.out.println(resultado);
        scanner.close();
    }
}