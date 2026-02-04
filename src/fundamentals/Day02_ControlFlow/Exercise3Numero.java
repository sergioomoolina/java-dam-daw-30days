import java.util.Scanner;
public class Exercise3Numero{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0){
            System.out.println("El número " + numero + " es PAR" );
        }
        else {
            System.out.println("En número " + numero + " es IMPAR");
        }
        scanner.close();
    }
}